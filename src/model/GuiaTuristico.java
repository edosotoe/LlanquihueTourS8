package model;

/**
 * Clase que representa a un Guia Turistico de Llanquihue Tour
 * Extiende la clase Persona con atributos propios del perfil de un guia turistico
 *
 */
public class GuiaTuristico extends Persona {

    private String idiomas;      // ej: "Español, Inglés, Alemán"
    private int aniosExperiencia;

    /**
     * @param nombre nombre del guia
     * @param correo correo electronico del guia
     * @param telefono telefono del guia
     * @param direccion direccion del guia
     * @param idiomas idiomas que maneja el guia
     * @param aniosExperiencia años de experiencia como guia turistico
     */
    public GuiaTuristico(String nombre, String correo, String telefono, Direccion direccion, String idiomas, int aniosExperiencia) {
        super(nombre, correo, telefono, direccion);
        this.idiomas = idiomas;
        this.setAniosExperiencia(aniosExperiencia);
    }

    public String getIdiomas() {
        return idiomas;
    }
    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        if (aniosExperiencia >= 0) {
            this.aniosExperiencia = aniosExperiencia;
        } else {
            System.out.println("Los años de experiencia no pueden ser negativos");
            this.aniosExperiencia = 0;
        }
    }

    /**
     * @return muestra informacion del guia y datos de contacto heredados de persona
     */
    @Override
    public String toString() {
        return "Guía Turístico: " + super.toString() +
                "| Idiomas: " + idiomas +
                "| Experiencia: " + aniosExperiencia + " años";
    }

    @Override
    public void mostrarResumen() {
        System.out.println(toString());
    }
}