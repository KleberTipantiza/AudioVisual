package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uni1a.Documental;
import uni1a.Investigador;

public class DocumentalTest {

    private Documental documental;

    @BeforeEach
    public void setUp() {
        documental = new Documental("Planeta Tierra", 60, "Naturaleza", "Vida Salvaje");
    }

    @Test
    public void testGetTema() {
        assertEquals("Vida Salvaje", documental.getTema());
    }

    @Test
    public void testSetTema() {
        documental.setTema("Océanos");
        assertEquals("Océanos", documental.getTema());
    }

    @Test
    public void testAgregarInvestigador() {
        Investigador investigador = new Investigador("Dr. Jane Goodall");
        documental.agregarInvestigador(investigador);
        assertTrue(documental.getGestorInvestigadores().getInvestigadores().contains(investigador));
    }

    @Test
    public void testMostrarDetalles() {
        // Aquí podrías redirigir la salida estándar a un ByteArrayOutputStream para verificar la salida
        // Pero para simplificar, solo llamaremos al método
        documental.mostrarDetalles();
    }
}
