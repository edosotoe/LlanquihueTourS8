package model;

/**
 * Clase que representa una Excursion Cultural ofrecida por la agencia LLanquihue Tour
 * Representa una clase hija de servicio turistico, heredando sus atributos y métodos
 */
public class ExcursionCultural extends ServicioTuristico {
        private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }
        
@Override
public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Lugar Historico: " + lugarHistorico);
}

}
