package uni1a;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private GestorInvestigadores gestorInvestigadores; // Delegar la gestión de investigadores

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.gestorInvestigadores = new GestorInvestigadores(); // Iniciamos el gestor de investigadores
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    // Método para agregar un investigador
    public void agregarInvestigador(Investigador investigador) {
        gestorInvestigadores.agregarInvestigador(investigador);
    }

    // Método getter para acceder al gestor de investigadores
    public GestorInvestigadores getGestorInvestigadores() {
        return gestorInvestigadores;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        gestorInvestigadores.mostrarInvestigadores(); // Delegamos la responsabilidad de mostrar los investigadores
    }
}
