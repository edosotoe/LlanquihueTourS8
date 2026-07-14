package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.Tour;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

/**
 * 
 * Clase encargada de leer el archivo y gestionar los datos entregados en una coleccion de objetos ArrayList
 */
public class GestorDatos {

/**    
    private String rutaArchivo;
    
    public GestorDatos(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    
    public ArrayList<Tour> cargarTours() {
        
        ArrayList<Tour> listaTours = new ArrayList<>();        
    
    try {
        BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
        String linea;
                
        while ((linea = lector.readLine()) != null) {
            
            String[] partes = linea.split(";");
    
            if(partes.length == 4) {
                String nombre = partes[0].trim();
                String tipo = partes[1].trim();
                
                try {
                    int capacidad = Integer.parseInt(partes[2].trim());
                    double precio = Double.parseDouble(partes[3].trim());
                    
                    Tour tour = new Tour(nombre, tipo, capacidad, precio);
                    listaTours.add(tour);
                    
                } catch (NumberFormatException e) {
                    System.out.println("Error en formato numérico en línea:" + linea);
                }
                        
        }
    }
    
    // cerrar lector
        lector.close();
    
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

    return listaTours;
    
    }
  
}
     * @return lista con servicios creados
*/

public ArrayList<Object> ServiciosDePrueba() {
    ArrayList<Object> servicios = new ArrayList<>();

// Rutas gastronomicas
RutaGastronomica ruta1 = new RutaGastronomica("Ruta Sabores del Lago", 3, 4);
RutaGastronomica ruta2 = new RutaGastronomica("Ruta Quesos del Sur", 2, 3);

// Paseos lacustres
PaseoLacustre paseo1 = new PaseoLacustre("Travesia por el Llanquihue", 4, "Catamaran");
PaseoLacustre paseo2 = new PaseoLacustre("Paseo al Atardecer", 2, "Kayak");

// Excursiones Culturales
ExcursionCultural excursion1 = new ExcursionCultural("Historia de los Colonos Alemanes", 5, "Museo Colonial de Frutillar");
ExcursionCultural excursion2 = new ExcursionCultural("Iglesias Patrimoniales", 6, "Iglesoa de Puerto Octay");
    
servicios.add(ruta1);
servicios.add(ruta2);
servicios.add(paseo1);
servicios.add(paseo2);
servicios.add(excursion1);
servicios.add(excursion2);

return servicios;

}
}


