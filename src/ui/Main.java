package ui;

import data.GestorDatos;
import data.GestorServicios;
import data.GestorEntidades;
import model.Tour;
import model.Cliente;
import model.Direccion;
import service.ServicioTour;
import java.util.ArrayList;

/**
 *
 * Clase principal del sistema LLanquihue Tour App
 */
public class Main {
    public static void main (String[] args) {
        
/**        
        
        GestorDatos gestor = new GestorDatos("src/resources/tours.txt");
        ArrayList<Tour> tours = gestor.cargarTours();
        
        ServicioTour servicio =new ServicioTour(tours);
        
        System.out.println(" --- LLANQUIHUE TOUR APP --- ");
        System.out.println("Total de tours: " + tours.size());
        System.out.println();
        
        // Listado de tours
        System.out.println("-- Listado completo --");
        for (Tour tour : servicio.obtenerTodos()) {
            System.out.println(tour);
        }
        
        // Filtrar por capacidad
        System.out.println("-- Tours para >15 personas --");
        ArrayList<Tour> toursGrandes = servicio.filtrarPorCapacidad(15);
        if (toursGrandes.isEmpty()) {
            System.out.println("No se encontraron tours con esa capacidad");
        } else {
            for (Tour tour : toursGrandes) {
                System.out.println(tour.getNombre() + " | Capacidad: " + tour.getCapacidad());
            }
        }
        
        // Tour mas economico
        System.out.println("-- Tour mas económico --");
        Tour economico = servicio.obtenerMasEconomico();
        if (economico != null) { 
            System.out.println(economico.getNombre() + " | Precio: $" + (int) economico.getPrecio() + "pesos");
        }
        
        // Filtrar por tipo
        System.out.println("-- Tours gastronómicos --");
        ArrayList<Tour> toursGastronomicos = servicio.filtrarPorTipo("gastronómico");
        if (toursGastronomicos.isEmpty()) {
            System.out.println("No se encontraron tours de ese tipo");
        } else {
            for (Tour tour : toursGastronomicos) {
                System.out.println(tour.getNombre() + " | Precio: $" + (int) tour.getPrecio());
            }
        }
        
        // Mostrar clientes registrados
        // 1. Declarar direcciones
Direccion dir1 = new Direccion("El Volcan", 111, "Llanquihue", "Los Lagos");
Direccion dir2 = new Direccion("Av. Providencia", 234, "Santiago", "Metropolitana");
Direccion dir3 = new Direccion("Rua Das Pedras", 567, "Rio de Janeiro", "Brasil");

// 2. Crear instancia de clientes
Cliente cliente1 = new Cliente("Peter Parker", "ppark@yahoo.com", "56996067878", dir1, 28, "Chileno", "Excursion cultural");
Cliente cliente2 = new Cliente("Christian Carvajal", "ccarvaj@hotmail.com", "569915777745", dir2, 40, "Chileno", "Turismo Gastronomico");
Cliente cliente3 = new Cliente("Ana Barbosa", "abarbosa@gmail.com", "54991372322", dir3, 53, "Brasileña", "Paseo Lacustre");
      
// 3. Mostrar resultados
System.out.println("-- Clientes registrados --");
System.out.println(cliente1);
System.out.println(cliente2);
System.out.println(cliente3);
        
    }
    
    
    
*/



/**
 *
 *  // -------------- SEMANA 6 ---------------
 

    
        GestorDatos gestor = new GestorDatos();
        ArrayList<Object> servicios = gestor.ServiciosDePrueba();
        
System.out.println("-- Servicios Turisticos --");
for (Object servicio : servicios) {
System.out.println(servicio.toString());
}
}
}

*/

/**
 * 
 // ------ SEMANA 7 (PASO OPCIONAL) --------

    GestorServicios gestor = new GestorServicios();
    
    System.out.println(" -- Servicios Turisitcos --");
    System.out.println();
    
    gestor.mostrarServicios();
    
    }
}
*/

// -------- SEMANA 8 -----------

    GestorEntidades gestorEntidades = new GestorEntidades();
    System.out.println();
    System.out.println("--- Registrables de Llanquihue Tour App ---");
    System.out.println();
    gestorEntidades.mostrarEntidades();
       

    }
    
}
