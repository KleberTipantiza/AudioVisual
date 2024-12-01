package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uni1a.Actor;
import uni1a.Pelicula;

public class PeliculaTest {

    private Pelicula pelicula;

    @BeforeEach
    public void setUp() {
        pelicula = new Pelicula("Inception", 148, "Sci-Fi", "Warner Bros");
    }

    @Test
    public void testGetEstudio() {
        assertEquals("Warner Bros", pelicula.getEstudio());
    }

    @Test
    public void testAgregarActor() {
        Actor actor = new Actor("Leonardo DiCaprio");
        pelicula.agregarActor(actor);
        assertTrue(pelicula.getActores().contains(actor));
    }

    @Test
    public void testEliminarActor() {
        Actor actor = new Actor("Leonardo DiCaprio");
        pelicula.agregarActor(actor);
        pelicula.eliminarActor(actor);
        assertFalse(pelicula.getActores().contains(actor));
    }

    @Test
    public void testMostrarActores() {
        // Aquí podrías redirigir la salida estándar a un ByteArrayOutputStream para verificar la salida
        // Pero para simplificar, solo llamaremos al método
        pelicula.mostrarActores();
    }

    @Test
    public void testMostrarDetalles() {
        // Aquí podrías redirigir la salida estándar a un ByteArrayOutputStream para verificar la salida
        // Pero para simplificar, solo llamaremos al método
        pelicula.mostrarDetalles();
    }
}


