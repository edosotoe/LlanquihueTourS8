package service;

import model.Tour;
import java.util.ArrayList;

/**
 * Clase que contiene la lógica del negocio: filtrar y buscar tours
 * 
 */
public class ServicioTour {
    
    private ArrayList<Tour> tours;
    
public ServicioTour(ArrayList<Tour> tours) {
    this.tours = tours;
}

// Retorna todos los tours disponibles
public ArrayList<Tour> obtenerTodos() {
    return tours;
}

// Filtrar los tours por tipo

public ArrayList<Tour> filtrarPorTipo(String tipo) {
    ArrayList<Tour> resultado = new ArrayList<>();
    for (Tour tour : tours) {
        if (tour.getTipo().equalsIgnoreCase(tipo)) {
            resultado.add(tour);
        }
    }
    return resultado;
}

// Filtrar por capacidad mínima requerida

public ArrayList<Tour> filtrarPorCapacidad(int minimo) {
    ArrayList<Tour> resultado = new ArrayList<>();
    for (Tour tour : tours) {
        if (tour.getCapacidad() > minimo) {
            resultado.add(tour);
        }
    }
    return resultado;
}
    
// Filtrar por precio mas bajo

public Tour obtenerMasEconomico() {
    if (tours.isEmpty()) return null;
    Tour masEconomico = tours.get(0);
    for (Tour tour : tours) {
        if (tour.getPrecio() < masEconomico.getPrecio()) {
            masEconomico = tour;            
        }
    }
    return masEconomico;
}


}
