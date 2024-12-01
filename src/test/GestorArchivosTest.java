package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Utilidades.GestorArchivos;
import uni1a.*;
import java.io.*;
import java.util.List;

public class GestorArchivosTest {

    private final String rutaArchivo = "test_contenidos.csv";

    @BeforeEach
    public void setUp() throws IOException {
        // Crear un archivo CSV de prueba
        BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo));
        writer.write("Pelicula,Inception,148,Sci-Fi,Warner Bros\n");
        writer.write("SerieDeTV,Breaking Bad,45,Drama,AMC\n");
        writer.write("Documental,Planeta Tierra,60,Naturaleza,Vida Salvaje\n");
        writer.write("Telenovela,La Rosa de Guadalupe,45,Drama,Televisa,100,2008\n");
        writer.close();
    }

    @Test
    public void testLeerArchivo() {
        List<ContenidoAudiovisual> contenidos = GestorArchivos.leerArchivo(rutaArchivo);
        assertEquals(4, contenidos.size());

        assertTrue(contenidos.get(0) instanceof Pelicula);
        assertTrue(contenidos.get(1) instanceof SerieDeTV);
        assertTrue(contenidos.get(2) instanceof Documental);
        assertTrue(contenidos.get(3) instanceof Telenovela);

        Pelicula pelicula = (Pelicula) contenidos.get(0);
        assertEquals("Inception", pelicula.getTitulo());
        assertEquals(148, pelicula.getDuracionEnMinutos());
        assertEquals("Sci-Fi", pelicula.getGenero());
        assertEquals("Warner Bros", pelicula.getEstudio());

        SerieDeTV serie = (SerieDeTV) contenidos.get(1);
        assertEquals("Breaking Bad", serie.getTitulo());
        assertEquals(45, serie.getDuracionEnMinutos());
        assertEquals("Drama", serie.getGenero());
        assertEquals("AMC", serie.getEstudio());

        Documental documental = (Documental) contenidos.get(2);
        assertEquals("Planeta Tierra", documental.getTitulo());
        assertEquals(60, documental.getDuracionEnMinutos());
        assertEquals("Naturaleza", documental.getGenero());
        assertEquals("Vida Salvaje", documental.getTema());

        Telenovela telenovela = (Telenovela) contenidos.get(3);
        assertEquals("La Rosa de Guadalupe", telenovela.getTitulo());
        assertEquals(45, telenovela.getDuracionEnMinutos());
        assertEquals("Drama", telenovela.getGenero());
        assertEquals("Televisa", telenovela.getProductor());
        assertEquals(100, telenovela.getNumeroCapitulos());
        assertEquals(2008, telenovela.getAnioDeEmision());
    }

    @Test
    public void testEscribirArchivo() throws IOException {
        List<ContenidoAudiovisual> contenidos = GestorArchivos.leerArchivo(rutaArchivo);
        String rutaArchivoEscritura = "test_contenidos_escritura.csv";
        GestorArchivos.escribirArchivo(rutaArchivoEscritura, contenidos);

        List<ContenidoAudiovisual> contenidosEscritos = GestorArchivos.leerArchivo(rutaArchivoEscritura);
        assertEquals(4, contenidosEscritos.size());

        assertTrue(contenidosEscritos.get(0) instanceof Pelicula);
        assertTrue(contenidosEscritos.get(1) instanceof SerieDeTV);
        assertTrue(contenidosEscritos.get(2) instanceof Documental);
        assertTrue(contenidosEscritos.get(3) instanceof Telenovela);

        // Verificar que los contenidos escritos son los mismos que los leídos inicialmente
        assertEquals(contenidos.get(0).getTitulo(), contenidosEscritos.get(0).getTitulo());
        assertEquals(contenidos.get(1).getTitulo(), contenidosEscritos.get(1).getTitulo());
        assertEquals(contenidos.get(2).getTitulo(), contenidosEscritos.get(2).getTitulo());
        assertEquals(contenidos.get(3).getTitulo(), contenidosEscritos.get(3).getTitulo());
    }
}
