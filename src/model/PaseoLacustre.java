package model;

/**
 * Clase que representa un Paseo Lacustre ofrecido por la agencia LLanquihue Tour
 * Representa una clase hija de servicio turistico, heredando sus atributos y métodos
 */
public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

@Override
public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Tipo de Embaracion: " + tipoEmbarcacion);
}

}

