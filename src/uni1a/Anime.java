package uni1a;

public class Anime extends ContenidoAudiovisual { // Ahora hereda de ContenidoAudiovisual
    private String estudioAnimacion;
    private int añoDeEstreno;

    // Constructor que pasa los parámetros comunes a la clase base
    public Anime(String titulo, int duracionEnMinutos, String genero, String estudioAnimacion, int añoDeEstreno) {
        super(titulo, duracionEnMinutos, genero); // Llamada al constructor de la clase base
        this.estudioAnimacion = estudioAnimacion;
        this.añoDeEstreno = añoDeEstreno;
    }

    // Getters y setters
    public String getEstudioAnimacion() {
        return estudioAnimacion;
    }

    public void setEstudioAnimacion(String estudioAnimacion) {
        this.estudioAnimacion = estudioAnimacion;
    }

    public int getAñoDeEstreno() {
        return añoDeEstreno;
    }

    public void setAñoDeEstreno(int añoDeEstreno) {
        this.añoDeEstreno = añoDeEstreno;
    }

    // Implementación del método mostrarDetalles heredado
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Anime:");
        System.out.println("ID: " + getId()); // Ahora está bien, ya que getId() está en ContenidoAudiovisual
        System.out.println("Título: " + getTitulo()); // Lo mismo con getTitulo()
        System.out.println("Duración en minutos: " + getDuracionEnMinutos()); // Lo mismo con getDuracionEnMinutos()
        System.out.println("Género: " + getGenero()); // Lo mismo con getGenero()
        System.out.println("Estudio de Animación: " + getEstudioAnimacion());
        System.out.println("Año de estreno: " + getAñoDeEstreno());
    }
}
