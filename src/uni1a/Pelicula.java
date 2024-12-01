package uni1a;

import java.util.ArrayList;

import uni1a.GestionDeActores.ActoresGestion;

public class Pelicula extends ContenidoAudiovisual implements ActoresGestion {
    private String estudio;
    private ArrayList<Actor> actores; // Lista de actores

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>(); // Inicializa la lista de actores
    }

    // Método getter para 'estudio'
    public String getEstudio() {
        return estudio;
    }

    // Método getter para 'actores'
    public ArrayList<Actor> getActores() {
        return actores;
    }

    // Implementación de los métodos de ActoresGestion
    @Override
    public void agregarActor(Actor actor) {
        actores.add(actor); // Agrega un actor a la lista
    }

    @Override
    public void eliminarActor(Actor actor) {
        actores.remove(actor); // Elimina un actor de la lista
    }

    @Override
    public void mostrarActores() {
        System.out.println("Actores: ");
        for (Actor actor : actores) {
            System.out.println("Nombre: " + actor.getNombre());
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        mostrarActores(); // Llamada para mostrar actores
    }

}

