package audiovisualmvc;

import java.util.List;
import uni1a.ContenidoAudiovisual;
import uni1a.Documental;
import uni1a.GestorContenidosAudiovisuales;
import uni1a.Pelicula;
import uni1a.SerieDeTV;
import uni1a.Telenovela;
import Utilidades.GestorArchivos;

public class Controlador {

    private Vista vista;
    private GestorContenidosAudiovisuales gestorContenido;
    private String nombreArchivo;  // Nombre del archivo CSV

    public Controlador(Vista vista) {
        this.vista = vista;
        this.gestorContenido = new GestorContenidosAudiovisuales();
        this.nombreArchivo = "contenidos.csv";  // Nombre del archivo CSV
    }

    public void iniciar() {
        boolean seguir = true;
        while (seguir) {
            int opcion = vista.obtenerOpcion();
            switch (opcion) {
                case 1:
                    // Agregar película
                    Pelicula pelicula = vista.crearPelicula();
                    vista.agregarActorAPelicula(pelicula);  // Permitir agregar actores
                    gestorContenido.agregarContenido(pelicula);
                    break;
                case 2:
                    // Agregar documental
                    Documental documental = vista.crearDocumental();
                    vista.agregarInvestigadorADocumental(documental);  // Permitir agregar investigadores
                    gestorContenido.agregarContenido(documental);
                    break;
                case 3:
                    // Agregar telenovela
                    Telenovela telenovela = vista.crearTelenovela();
                    gestorContenido.agregarContenido(telenovela);
                    break;
                case 4:
                    // Agregar serie de TV
                    SerieDeTV serieDeTV = vista.crearSerieDeTV();
                    vista.agregarTemporadaASerie(serieDeTV);  // Permitir agregar temporadas
                    gestorContenido.agregarContenido(serieDeTV);
                    break;
                case 5:
                    // Mostrar detalles de todo el contenido agregado
                    gestorContenido.mostrarDetalles();  // Mostrar detalles de los contenidos agregados
                    break;
                case 6:
                    // Guardar los contenidos en un archivo CSV
                    GestorArchivos.escribirArchivo(nombreArchivo, gestorContenido.getContenidos()); // Guardar en CSV
                    System.out.println("Contenidos guardados en el archivo CSV.");
                    break;
                case 7:
                    // Mostrar contenidos desde archivo CSV
                    List<ContenidoAudiovisual> contenidos = GestorArchivos.leerArchivo(nombreArchivo); // Cargar desde CSV
                    vista.mostrarContenidos(contenidos);  // Mostrar los contenidos desde el archivo CSV
                    break;
                case 8:
                    // Salir
                    System.out.println("Saliendo...");
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}