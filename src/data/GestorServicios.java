package data;

import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

import java.util.ArrayList;
      

/**
 * Clase encargada de gestionar los servicios turisticos de la empresa Llanquihue Tour 
 */
public class GestorServicios {
    private ArrayList<ServicioTuristico> servicios;
    
    public GestorServicios() {
        servicios = new ArrayList<>();
        cargarServicios();
    }
    
    private void cargarServicios() {
        servicios.add(new RutaGastronomica("Ruta Sabores del Lago", 3, 4));
        servicios.add(new RutaGastronomica("Ruta Quesos del Sur", 2, 3));
        servicios.add(new PaseoLacustre("Travesia por el Llanquihue", 4, "Catamaran"));
        servicios.add(new PaseoLacustre("Paseo al Atardecer", 2, "Kayak"));
        servicios.add(new ExcursionCultural("Historia de los Colonos Alemanes", 5, "Museo Colonial de Frutillar"));
        servicios.add(new ExcursionCultural("Iglesias Patrimoniales", 6, "Iglesia de Puerto Octay"));
    }
    
    public void mostrarServicios() {
        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
            System.out.println("-- -- -- --");
        }
    }
    
    public ArrayList<ServicioTuristico> getServicios() {
        return servicios;
    }
    
}


    