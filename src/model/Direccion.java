package model;

public class Direccion {
    private String calle;
    private int numero;
    private String ciudad;
    private String region;
    
/**
 * 
 * @param calle nombre de la calle donde vive la persona
 * @param numero numero de la direccion de la calle donde vive la persona
 * @param ciudad ciudad donde vive la persona
 * @param region region donde vive la persona 
 * 
 */

    public Direccion(String calle, int numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }
    
    /**
     * 
     * @return metodo para que muestre la direccion completa del cliente
     */
    
    @Override
    public String toString() {
       return calle + "#" + numero + ", " + ciudad + ", Region " + region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
}