package audiovisualmvc;

public class PruebaAudioVisual {

	public static void main(String[] args) {
        Vista vista = new Vista(); // Crear el objeto Vista
        Controlador controlador = new Controlador(vista); // Pasar el objeto Vista al constructor del controlador
        controlador.iniciar(); // Llamar al método iniciar
    }
	
}
