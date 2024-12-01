package uni1a;

public class Temporada {
	private int numeroDeTemporada;
	private int capitulos;
	
	//Constructor
	public Temporada(int numeroDeTemporada, int capitulos) {
		this.numeroDeTemporada = numeroDeTemporada;
		this.capitulos = capitulos;
	}

	//Getters
	public int getNumeroDeTemporada() {
		return numeroDeTemporada;
	}
	
	public int getCapitulos() {
		return capitulos;
	}
	
	// Metodo para mostrar los detalles de la temporada
	public void mostrarDetalles() {
		System.out.println("Temporada " + numeroDeTemporada + " tiene " + capitulos + " capitulos");
	}
}
