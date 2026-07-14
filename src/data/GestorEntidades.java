package data;

import model.Registrable;
import model.Persona;
import model.Cliente;
import model.GuiaTuristico;
import model.ColaboradorExterno;
import model.Vehiculo;
import model.Direccion;

import java.util.ArrayList;

/**
 * Clase encargada de gestionar las distintas entidades registrables del sistema de Llanquihue Tour (personas y vehiculos)
 */
public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
        cargarEntidades();
    }


    private void cargarEntidades() {
        Direccion direccionPuertoVaras = new Direccion("Av. Vicente Pérez Rosales", 100, "Puerto Varas", "Los Lagos");
        Direccion direccionFrutillar = new Direccion("Av. Philippi", 200, "Frutillar", "Los Lagos");
        Direccion direccionOsorno = new Direccion("Calle Mackenna", 300, "Osorno", "Los Lagos");

        entidades.add(new Cliente("Javiera Soto", "javiera.soto@gmail.com", "+56911111111", direccionPuertoVaras, 29, "Chilena", "Gastronómico"));
        entidades.add(new GuiaTuristico("Martín Alarcón", "martin.alarcon@gmail.com", "+56922222222", direccionFrutillar, "Español, Inglés", 6));
        entidades.add(new ColaboradorExterno("Transportes Los Lagos", "contacto@translagos.cl", "+56933333333", direccionOsorno, "Transportes Los Lagos", "Transporte"));
        entidades.add(new Vehiculo("HZVY-41", "Mercedes-Benz Sprinter", 18));
        entidades.add(new Vehiculo("TCSP-22", "Toyota Hiace", 12));
    }


    public void mostrarEntidades() {
        for (Registrable entidad : entidades) {
            entidad.mostrarResumen();

            if (entidad instanceof Cliente cliente) {
                System.out.println("Es un cliente. Intereses: " + cliente.getIntereses());
            } else if (entidad instanceof GuiaTuristico guia) {
                System.out.println("Es un guía turístico. Idiomas: " + guia.getIdiomas());
            } else if (entidad instanceof ColaboradorExterno colaborador) {
                System.out.println("Es un colaborador externo. Empresa: " + colaborador.getEmpresa());
            } else if (entidad instanceof Vehiculo vehiculo) {
                System.out.println("Es un vehículo. Capacidad: " + vehiculo.getCapacidadPasajeros() + " pasajeros");
            }

            System.out.println("---");
        }
    }

    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }
}