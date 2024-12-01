package Utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import uni1a.Documental;
import uni1a.Pelicula;
import uni1a.SerieDeTV;

public class LectorDeArchivos {
    
    // Método para leer y mostrar los contenidos de un archivo CSV
    public void mostrarContenidoDesdeCSV(String nombreArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                
                // Dependiendo del tipo de contenido, creamos el objeto adecuado
                if (datos[0].equals("Pelicula")) {
                    // Suponiendo que los datos son [Pelicula, Titulo, Duracion, Genero, Estudio]
                    String titulo = datos[1];
                    int duracion = Integer.parseInt(datos[2]);
                    String genero = datos[3];
                    String estudio = datos[4];
                    Pelicula pelicula = new Pelicula(titulo, duracion, genero, estudio);
                    pelicula.mostrarDetalles();
                } else if (datos[0].equals("SerieDeTV")) {
                    // [SerieDeTV, Titulo, Duracion, Genero, Estudio]
                    String titulo = datos[1];
                    int duracion = Integer.parseInt(datos[2]);
                    String genero = datos[3];
                    String estudio = datos[4];
                    SerieDeTV serie = new SerieDeTV(titulo, duracion, genero, estudio);
                    serie.mostrarDetalles();
                } else if (datos[0].equals("Documental")) {
                    // [Documental, Titulo, Duracion, Genero, Tema]
                    String titulo = datos[1];
                    int duracion = Integer.parseInt(datos[2]);
                    String genero = datos[3];
                    String tema = datos[4];
                    Documental documental = new Documental(titulo, duracion, genero, tema);
                    documental.mostrarDetalles();
                }
                // Puedes añadir más condiciones si tienes más tipos de contenidos como Telenovela, etc.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

