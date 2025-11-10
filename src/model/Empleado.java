package model;

public class Empleado extends Persona {
    //Atributos privados.
    private String cargo;
    private double salario;
    private Direccion direccion; // Composición: un empleado tiene una dirección

    //Constructor sin parámetros.
    public Empleado() {
        super(); // llama al constructor de Persona
        this.cargo = "Sin cargo";
        this.salario = 0.0;
        this.direccion = new Direccion();
    }

    //Constructor con parámetros.
    public Empleado(String nombre, int edad, String rut, String cargo, double salario, Direccion direccion) {
        super(nombre, edad, rut);
        this.cargo = cargo;
        this.salario = salario;
        this.direccion = direccion;
    }

    //Getters y setters.
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //Nuevamente el  tostring para que sea legible.
    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: " + cargo +
                "\nSalario: $" + salario +
                "\nDirección: " + direccion.toString();
    }
}

