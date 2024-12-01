package audiovisualmvc;

import java.util.List;
import java.util.Scanner;

import uni1a.Actor;
import uni1a.ContenidoAudiovisual;
import uni1a.Documental;
import uni1a.Investigador;
import uni1a.Pelicula;
import uni1a.SerieDeTV;
import uni1a.Telenovela;
import uni1a.Temporada;

public class Vista {
    private Scanner scanner;  // Para leer las entradas del usuario

    public Vista() {
        this.scanner = new Scanner(System.in);
    }

    // Método para obtener la opción seleccionada por el usuario
    public int obtenerOpcion() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Agregar película");
        System.out.println("2. Agregar documental");
        System.out.println("3. Agregar telenovela");
        System.out.println("4. Agregar serie de TV");
        System.out.println("5. Salir");
        return scanner.nextInt();  // Lee la opción seleccionada por el usuario
    }

    // Método para crear una película
    public Pelicula crearPelicula() {
        scanner.nextLine(); // Consumir salto de línea pendiente
        System.out.println("Ingrese el título de la película:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese la duración en minutos:");
        int duracionEnMinutos = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea pendiente
        System.out.println("Ingrese el género de la película:");
        String genero = scanner.nextLine();
        System.out.println("Ingrese el nombre del estudio:");
        String estudio = scanner.nextLine();

        return new Pelicula(titulo, duracionEnMinutos, genero, estudio);
    }

    // Método para crear un documental
    public Documental crearDocumental() {
        scanner.nextLine(); // Consumir salto de línea pendiente
        System.out.println("Ingrese el título del documental:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese la duración en minutos:");
        int duracionEnMinutos = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea pendiente
        System.out.println("Ingrese el género del documental:");
        String genero = scanner.nextLine();
        System.out.println("Ingrese el tema del documental:");
        String tema = scanner.nextLine();

        return new Documental(titulo, duracionEnMinutos, genero, tema);
    }

    // Método para crear una telenovela
    public Telenovela crearTelenovela() {
        scanner.nextLine(); // Consumir salto de línea pendiente
        System.out.println("Ingrese el título de la telenovela:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese la duración en minutos:");
        int duracionEnMinutos = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea pendiente
        System.out.println("Ingrese el género de la telenovela:");
        String genero = scanner.nextLine();
        System.out.println("Ingrese el nombre del productor:");
        String productor = scanner.nextLine();
        System.out.println("Ingrese el número de capítulos:");
        int numeroCapitulos = scanner.nextInt();
        System.out.println("Ingrese el año de emisión:");
        int anioDeEmision = scanner.nextInt();

        return new Telenovela(titulo, duracionEnMinutos, genero, productor, numeroCapitulos, anioDeEmision);
    }

    // Método para crear una serie de TV
    public SerieDeTV crearSerieDeTV() {
        scanner.nextLine(); // Consumir salto de línea pendiente
        System.out.println("Ingrese el título de la serie de TV:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese la duración en minutos:");
        int duracionEnMinutos = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea pendiente
        System.out.println("Ingrese el género de la serie de TV:");
        String genero = scanner.nextLine();
        System.out.println("Ingrese el nombre del estudio:");
        String estudio = scanner.nextLine();

        return new SerieDeTV(titulo, duracionEnMinutos, genero, estudio);
    }

    // Método para agregar actores a una película
    public void agregarActorAPelicula(Pelicula pelicula) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("¿Desea agregar un actor a la película? (Si o No): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("Si")) {
                System.out.println("Ingrese el nombre del actor:");
                String nombreActor = scanner.nextLine();
                Actor actor = new Actor(nombreActor);
                pelicula.agregarActor(actor);  // Agregar actor a la película
            } else {
                seguir = false;  // Dejar de agregar actores
            }
        }
    }

    // Método para agregar investigadores a un documental
    public void agregarInvestigadorADocumental(Documental documental) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("¿Desea agregar un investigador al documental? (Si o No): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("Si")) {
                System.out.println("Ingrese el nombre del investigador:");
                String nombreInvestigador = scanner.nextLine();
                Investigador investigador = new Investigador(nombreInvestigador);
                documental.agregarInvestigador(investigador);  // Agregar investigador al documental
            } else {
                seguir = false;  // Dejar de agregar investigadores
            }
        }
    }

    // Método para agregar temporadas a una serie de TV
    public void agregarTemporadaASerie(SerieDeTV serie) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("¿Desea agregar una temporada a la serie de TV? (S/N): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Ingrese el número de temporada:");
                int numeroDeTemporada = scanner.nextInt();
                System.out.println("Ingrese el número de capítulos de la temporada:");
                int capitulos = scanner.nextInt();
                Temporada temporada = new Temporada(numeroDeTemporada, capitulos);
                serie.agregarTemporada(temporada);  // Agregar temporada a la serie
                scanner.nextLine(); // Consumir salto de línea pendiente
            } else {
                seguir = false;  // Dejar de agregar temporadas
            }
        }
    }

    // Método para mostrar los detalles de un contenido
    public void mostrarDetallesContenido(ContenidoAudiovisual contenido) {
        contenido.mostrarDetalles();  // Llamada al método mostrarDetalles de la clase base
    }
    
 // Método para mostrar los contenidos al usuario
    public void mostrarContenidos(List<ContenidoAudiovisual> contenidos) {
        if (contenidos.isEmpty()) {
            System.out.println("No hay contenidos para mostrar.");
        } else {
            for (ContenidoAudiovisual contenido : contenidos) {
                contenido.mostrarDetalles(); // Muestra los detalles del contenido
                System.out.println("--------------------------------");
            }
        }
    }
    
}
