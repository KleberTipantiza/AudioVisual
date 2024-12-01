package uni1a;

import java.util.ArrayList;

public class GestorInvestigadores {

	private ArrayList<Investigador> investigadores;

    public GestorInvestigadores() {
        this.investigadores = new ArrayList<>();
    }

    // Método para agregar un investigador
    public void agregarInvestigador(Investigador investigador) {
        investigadores.add(investigador);
    }

    // Método para mostrar los detalles de los investigadores
    public void mostrarInvestigadores() {
        System.out.println("Investigadores: ");
        for (Investigador investigador : investigadores) {
            investigador.mostrarDetalles();
        }
    }
	
}
