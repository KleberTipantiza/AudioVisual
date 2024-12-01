package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uni1a.Anime;

public class AnimeTest {

    private Anime anime;

    @BeforeEach
    public void setUp() {
        anime = new Anime("Naruto", 24, "Acción", "Pierrot", 2002);
    }

    @Test
    public void testGetEstudioAnimacion() {
        assertEquals("Pierrot", anime.getEstudioAnimacion());
    }

    @Test
    public void testSetEstudioAnimacion() {
        anime.setEstudioAnimacion("Toei Animation");
        assertEquals("Toei Animation", anime.getEstudioAnimacion());
    }

    @Test
    public void testGetAñoDeEstreno() {
        assertEquals(2002, anime.getAñoDeEstreno());
    }

    @Test
    public void testSetAñoDeEstreno() {
        anime.setAñoDeEstreno(2005);
        assertEquals(2005, anime.getAñoDeEstreno());
    }

    @Test
    public void testMostrarDetalles() {
        // Aquí podrías redirigir la salida estándar a un ByteArrayOutputStream para verificar la salida
        // Pero para simplificar, solo llamaremos al método
        anime.mostrarDetalles();
    }
}

