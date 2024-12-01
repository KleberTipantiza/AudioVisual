package uni1a;

public class Actor {
    private String nombre;
    
    // Constructor
    public Actor(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }
    
    // Método para mostrar detalles del actor
    public void mostrarDetalles() {
        System.out.println("Actor: " + nombre);
    }
}