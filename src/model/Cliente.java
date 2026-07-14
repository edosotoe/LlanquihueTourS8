package model;

/**
 * Clase que representa a un Cliente de Llanquihue Tour
 * Extiende la clase persona con sus atributos + atributos propios del perfil tuistico
 * 
 */
public class Cliente extends Persona {
    
    private int edad;
    private String nacionalidad;
    private String intereses; // ej: vacaciones, gastronomico, trabajo, excursion, etc

/**
 * 
 * @param edad edad del cliente, en años
 * @param nacionalidad procedencia del cliente
 * @param intereses motivos del viaje del cliente
 * @param nombre nombre del cliente
 * @param correo correo electronico del cliente
 * @param telefono telefono del cliente
 * @param direccion direccion del cliente
 */
    
    public Cliente(String nombre, String correo, String telefono, Direccion direccion, int edad, String nacionalidad, String intereses) {
        super(nombre, correo, telefono, direccion);
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.intereses = intereses;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 120) {
            this.edad = edad;    
        } else {
            System.out.println("Edad inválida");
            this.edad = 0;
        }
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }
/**
 * 
 * @return muestra informacion de cliente y datos de contacto heredados de persona
 */
    
@Override
public String toString() {
    return "Cliente: " + super.toString() +
            "| Edad: " + edad + " años, " +
            "| Nacionalidad: " + nacionalidad +
            "| Motivo del viaje: " + intereses;
            
}
@Override
public void mostrarResumen() {
    System.out.println(toString());
    }
}
