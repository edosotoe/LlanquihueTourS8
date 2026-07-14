package model;

/**
 * Clase que representa un tour de la agencia LLanquihue Tour
 * 
 */

public class Tour {

    private String nombre;
    private String tipo;
    private int capacidad;
    private double precio;
    
/**
 * 
 * @param nombre nombre del tour, explica el destino de la actividad
 * @param tipo tipo del tour: gastronomico, lacustre, cultural, personalizado
 * @param capacidad número maximo de pasajeros
 * @param precio precio en pesos chilenos
 */
    
public Tour(String nombre, String tipo, int capacidad, double precio) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.capacidad = capacidad;
    this.precio = precio;
            
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
    } else {
        System.out.println("Precio no puede ser negativo");
        this.precio = precio;
        }

    }
    
    
@Override
public String toString() {
    return "Tour " + "nombre: " + nombre +
            ", tipo: " + tipo + 
            ", capacidad: " + capacidad + " personas" +
            ", precio: " + (int) precio + " pesos";
    
            
}

    
}
