package model;

public class Persona {
    //Atributos privados.
    private String nombre;
    private int edad;
    private String rut;

    //Constructor sin parámetros.
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.rut = "Desconocido";
    }

    //Constructor con parámetros.
    public Persona(String nombre, int edad, String rut) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
    }

    //Getters y setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    //tostring para mostrar información legible.
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nRUT: " + rut;
    }
}

