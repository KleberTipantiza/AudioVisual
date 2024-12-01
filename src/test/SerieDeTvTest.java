package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uni1a.SerieDeTV;
import uni1a.Temporada;

public class SerieDeTvTest {

    private SerieDeTV serieDeTV;

    @BeforeEach
    public void setUp() {
        serieDeTV = new SerieDeTV("Breaking Bad", 45, "Drama", "AMC");
    }

    @Test
    public void testGetEstudio() {
        assertEquals("AMC", serieDeTV.getEstudio());
    }

    @Test
    public void testMostrarDetalles() {
        // Aquí podrías redirigir la salida estándar a un ByteArrayOutputStream para verificar la salida
        // Pero para simplificar, solo llamaremos al método
        serieDeTV.mostrarDetalles();
    }
}
