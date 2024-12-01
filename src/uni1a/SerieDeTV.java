package uni1a;

public class SerieDeTV extends ContenidoAudiovisual {
    private String estudio;
    private GestorTemporadas gestorTemporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.gestorTemporadas = new GestorTemporadas();
    }

    // Método getter para 'estudio'
    public String getEstudio() {
        return estudio;
    }

    public void agregarTemporada(Temporada temporada) {
        gestorTemporadas.agregarTemporada(temporada);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        gestorTemporadas.mostrarTemporadas();  // Delegamos la responsabilidad a GestorTemporadas
    }
}

