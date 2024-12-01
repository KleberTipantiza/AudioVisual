package uni1a;

public class Investigador {
	private String nombre;
	
	//Constructor
	public Investigador(String nombre) {
		this.nombre = nombre;
	}

	// Getters
	public String getNombre() {
		return nombre;
	}
	
	//Metodo para mostrar el nombre del/los investigador/res
	public void mostrarDetalles() {
		System.out.println("Investigador : " + nombre);
	}
}
