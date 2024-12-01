package uni1a;

public class Telenovela extends ContenidoAudiovisual { // Extiende de ContenidoAudiovisual
    private String productor; // En lugar de autor, podemos tener un productor
    private int numeroCapitulos;
    private int anioDeEmision; // Año de emisión para la telenovela

    // Constructor que pasa los parámetros comunes a la clase base
    public Telenovela(String titulo, int duracionEnMinutos, String genero, String productor, int numeroCapitulos, int anioDeEmision) {
        super(titulo, duracionEnMinutos, genero); // Llamada al constructor de la clase base
        this.productor = productor;
        this.numeroCapitulos = numeroCapitulos;
        this.anioDeEmision = anioDeEmision;
    }

    // Getters y setters
    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public void setNumeroCapitulos(int numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }

    public int getAnioDeEmision() {
        return anioDeEmision;
    }

    public void setAnioDeEmision(int anioDeEmision) {
        this.anioDeEmision = anioDeEmision;
    }

    // Implementación del método mostrarDetalles heredado
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Telenovela:");
        System.out.println("ID: " + getId()); // Utiliza el método heredado getId()
        System.out.println("Título: " + getTitulo()); // Utiliza el método heredado getTitulo()
        System.out.println("Duración en minutos: " + getDuracionEnMinutos()); // Utiliza el método heredado getDuracionEnMinutos()
        System.out.println("Género: " + getGenero()); // Utiliza el método heredado getGenero()
        System.out.println("Productor: " + getProductor());
        System.out.println("Número de capítulos: " + getNumeroCapitulos());
        System.out.println("Año de emisión: " + getAnioDeEmision());
    }
}
