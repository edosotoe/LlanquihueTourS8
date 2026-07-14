package model;

/**
 * Clase que representa una ruta gastronomica ofrecida por la agencia LLanquihue Tour
 * Representa una clase hija de servicio turistico, heredando sus atributos y métodos
 */
public class RutaGastronomica extends ServicioTuristico {
    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        if (numeroDeParadas > 0) {
            this.numeroDeParadas = numeroDeParadas;
        } else {
            System.out.println("El numero de paradas debe ser mayor a 0");
            this.numeroDeParadas = numeroDeParadas;
        }
    }
    
@Override
public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Número de Paradas: " + numeroDeParadas);
}
      
}
