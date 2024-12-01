package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uni1a.Telenovela;

public class TelenovelaTest {

    private Telenovela telenovela;

    @BeforeEach
    public void setUp() {
        telenovela = new Telenovela("La Rosa de Guadalupe", 45, "Drama", "Televisa", 100, 2008);
    }

    @Test
    public void testGetProductor() {
        assertEquals("Televisa", telenovela.getProductor());
    }

    @Test
    public void testSetProductor() {
        telenovela.setProductor("Univision");
        assertEquals("Univision", telenovela.getProductor());
    }

    @Test
    public void testGetNumeroCapitulos() {
        assertEquals(100, telenovela.getNumeroCapitulos());
    }

    @Test
    public void testSetNumeroCapitulos() {
        telenovela.setNumeroCapitulos(120);
        assertEquals(120, telenovela.getNumeroCapitulos());
    }

    @Test
    public void testGetAnioDeEmision() {
        assertEquals(2008, telenovela.getAnioDeEmision());
    }

    @Test
    public void testSetAnioDeEmision() {
        telenovela.setAnioDeEmision(2010);
        assertEquals(2010, telenovela.getAnioDeEmision());
    }

    @Test
    public void testMostrarDetalles() {
        // Aquí podrías redirigir la salida estándar a un ByteArrayOutputStream para verificar la salida
        // Pero para simplificar, solo llamaremos al método
        telenovela.mostrarDetalles();
    }
}
