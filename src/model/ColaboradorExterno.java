package model;

/**
 * Clase que representa a un Colaborador Externo de Llanquihue Tour
 * Extiende la clase Persona con atributos propios que la relacionan a la empresa
 *
 */
public class ColaboradorExterno extends Persona {

    private String empresa;
    private String tipoServicio; // ej: "Transporte", "Alojamiento"

    /**
     * @param nombre nombre del colaborador
     * @param correo correo electronico del colaborador
     * @param telefono telefono del colaborador
     * @param direccion direccion del colaborador
     * @param empresa empresa externa a la que representa
     * @param tipoServicio tipo de servicio que presta a la agencia
     */
    public ColaboradorExterno(String nombre, String correo, String telefono, Direccion direccion, String empresa, String tipoServicio) {
        super(nombre, correo, telefono, direccion);
        this.empresa = empresa;
        this.tipoServicio = tipoServicio;
    }

    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getTipoServicio() {
        return tipoServicio;
    }
    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    /**
     * @return muestra informacion del colaborador y datos de contacto heredados de persona
     */
    @Override
    public String toString() {
        return "Colaborador Externo: " + super.toString() +
                "| Empresa: " + empresa +
                "| Servicio: " + tipoServicio;
    }


    @Override
    public void mostrarResumen() {
        System.out.println(toString());
    }
}