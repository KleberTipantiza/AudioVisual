package uni1a;

import java.util.ArrayList;

public class GestorTemporadas {

	private ArrayList<Temporada> temporadas;

    public GestorTemporadas() {
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public void mostrarTemporadas() {
        System.out.println("Detalles por temporada:");
        for (Temporada temporada : temporadas) {
            temporada.mostrarDetalles();
        }
    }
}
