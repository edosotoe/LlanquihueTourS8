package model;

/**
 * Clase base que representa los servicios turisticos ofrecidos por la empresa LLanquihue tour
 *
 */
public class ServicioTuristico {
   private String nombre;
   private int duracionHoras;

/**
 * 
 * @param nombre nombre del servicio turistico
 * @param duracionHoras duracion del servicio turistico en horas
 */
   
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras > 0) {
            this.duracionHoras = duracionHoras;
        } else {
            System.out.println("La duracion debe ser mayor a 0 horas");
   
        }
    }
    
    public void mostrarInformacion() {
        System.out.println("Servicio Turístico");
        System.out.println("Nombre: " + nombre);
        System.out.println("Duracion " + duracionHoras + " horas");
    }
    
     
}
