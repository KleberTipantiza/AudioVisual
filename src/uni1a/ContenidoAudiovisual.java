package uni1a;

public abstract class ContenidoAudiovisual {
	
    private static int contar = 1;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;
    private int id;

    // Constructor
    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = generarIdUnico();
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }

    //Metodo para generacion del ID (separacion de responsabilidades)
    private int generarIdUnico() {
        return contar++;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    // Método abstracto para mostrar los detalles
    public abstract void mostrarDetalles();
}
