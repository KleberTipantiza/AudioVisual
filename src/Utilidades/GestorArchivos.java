package Utilidades;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import uni1a.ContenidoAudiovisual;
import uni1a.Documental;
import uni1a.Pelicula;
import uni1a.SerieDeTV;
import uni1a.Telenovela;

public class GestorArchivos {

    // Método para leer el archivo CSV y cargar los contenidos audiovisuales
    public static List<ContenidoAudiovisual> leerArchivo(String rutaArchivo) {
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            
            // Leer cada línea del archivo CSV
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");  // Suponemos que el archivo CSV tiene coma como separador

                String tipoContenido = datos[0];  // El tipo de contenido (Pelicula, Serie, etc.)
                String titulo = datos[1];
                int duracionEnMinutos = Integer.parseInt(datos[2]);
                String genero = datos[3];

                if (tipoContenido.equalsIgnoreCase("Pelicula")) {
                    String estudio = datos[4];
                    Pelicula pelicula = new Pelicula(titulo, duracionEnMinutos, genero, estudio);
                    contenidos.add(pelicula);
                } else if (tipoContenido.equalsIgnoreCase("SerieDeTV")) {
                    String estudio = datos[4];
                    SerieDeTV serie = new SerieDeTV(titulo, duracionEnMinutos, genero, estudio);
                    contenidos.add(serie);
                } else if (tipoContenido.equalsIgnoreCase("Documental")) {
                    String tema = datos[4];
                    Documental documental = new Documental(titulo, duracionEnMinutos, genero, tema);
                    contenidos.add(documental);
                } else if (tipoContenido.equalsIgnoreCase("Telenovela")) {
                    String productor = datos[4];
                    int numeroCapitulos = Integer.parseInt(datos[5]);
                    int anioDeEmision = Integer.parseInt(datos[6]);
                    Telenovela telenovela = new Telenovela(titulo, duracionEnMinutos, genero, productor, numeroCapitulos, anioDeEmision);
                    contenidos.add(telenovela);
                }
                // Aquí puedes agregar más tipos de contenido según tu necesidad
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return contenidos;
    }

    // Método para escribir los contenidos en un archivo CSV
    public static void escribirArchivo(String rutaArchivo, List<ContenidoAudiovisual> contenidos) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(rutaArchivo));

            for (ContenidoAudiovisual contenido : contenidos) {
                if (contenido instanceof Pelicula) {
                    Pelicula pelicula = (Pelicula) contenido;
                    writer.write("Pelicula," + pelicula.getTitulo() + "," + pelicula.getDuracionEnMinutos() + ","
                            + pelicula.getGenero() + "," + pelicula.getEstudio());
                } else if (contenido instanceof SerieDeTV) {
                    SerieDeTV serie = (SerieDeTV) contenido;
                    writer.write("SerieDeTV," + serie.getTitulo() + "," + serie.getDuracionEnMinutos() + ","
                            + serie.getGenero() + "," + serie.getEstudio());
                } else if (contenido instanceof Documental) {
                    Documental documental = (Documental) contenido;
                    writer.write("Documental," + documental.getTitulo() + "," + documental.getDuracionEnMinutos() + ","
                            + documental.getGenero() + "," + documental.getTema());
                } else if (contenido instanceof Telenovela) {
                    Telenovela telenovela = (Telenovela) contenido;
                    writer.write("Telenovela," + telenovela.getTitulo() + "," + telenovela.getDuracionEnMinutos() + ","
                            + telenovela.getGenero() + "," + telenovela.getProductor() + ","
                            + telenovela.getNumeroCapitulos() + "," + telenovela.getAnioDeEmision());
                }
                writer.newLine(); // Añadir nueva línea después de cada contenido
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

