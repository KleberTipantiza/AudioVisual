package uni1a;

import java.util.ArrayList;
import java.util.List;

public class GestorContenidosAudiovisuales {

    private List<ContenidoAudiovisual> contenidos;

    public GestorContenidosAudiovisuales() {
        contenidos = new ArrayList<>();
    }

    // Método para agregar contenido
    public void agregarContenido(ContenidoAudiovisual contenido) {
        contenidos.add(contenido);
    }

    // Método para obtener todos los contenidos
    public List<ContenidoAudiovisual> getContenidos() {
        return contenidos;
    }

    // Método para mostrar detalles de los contenidos
    public void mostrarDetalles() {
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}


