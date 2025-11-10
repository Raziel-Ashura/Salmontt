package model;

public class Direccion {
    //Atributos privados de la dirección.
    private String calle;
    private String ciudad;
    private String region;

    //Constructor sin parámetros.
    public Direccion() {
        this.calle = "Sin calle";
        this.ciudad = "Sin ciudad";
        this.region = "Sin región";
    }

    //Constructor con parámetros.
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    //Getters y setters.
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
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

    //tostring para que sea legible.
    @Override
    public String toString() {
        return "Calle: " + calle + ", Ciudad: " + ciudad + ", Región: " + region;
    }
}
