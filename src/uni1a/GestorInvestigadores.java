package uni1a;

import java.util.ArrayList;
import java.util.ArrayList;

public class GestorInvestigadores {
    private ArrayList<Investigador> investigadores;

    public GestorInvestigadores() {
        investigadores = new ArrayList<>();
    }

    public void agregarInvestigador(Investigador investigador) {
        investigadores.add(investigador);
    }

    public void eliminarInvestigador(Investigador investigador) {
        investigadores.remove(investigador);
    }

    public void mostrarInvestigadores() {
        for (Investigador investigador : investigadores) {
            System.out.println("Investigador: " + investigador.getNombre());
        }
    }

    // Método getter para acceder a la lista de investigadores
    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }
}

