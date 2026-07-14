package model;

/**
 * Clase que representa un Vehiculo utilizado por la agencia Llanquihue Tour para el transporte de clientes en sus distintos servicios turisticos
 * 
 */
public class Vehiculo implements Registrable {

    private String patente;
    private String modelo;
    private int capacidadPasajeros;

    /**
     * @param patente patente del vehiculo
     * @param modelo modelo del vehiculo
     * @param capacidadPasajeros capacidad maxima de pasajeros
     */
    public Vehiculo(String patente, String modelo, int capacidadPasajeros) {
        this.patente = patente;
        this.modelo = modelo;
        this.setCapacidadPasajeros(capacidadPasajeros);
    }

    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        if (capacidadPasajeros > 0) {
            this.capacidadPasajeros = capacidadPasajeros;
        } else {
            System.out.println("La capacidad de pasajeros debe ser mayor a 0");
            this.capacidadPasajeros = 1;
        }
    }

    @Override
    public String toString() {
        return "Vehículo: Patente: " + patente +
                "| Modelo: " + modelo +
                "| Capacidad: " + capacidadPasajeros + " pasajeros";
    }

    @Override
    public void mostrarResumen() {
        System.out.println(toString());
    }
}