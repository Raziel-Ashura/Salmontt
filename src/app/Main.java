package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creo 3 direcciones para la prueba
        Direccion dir1 = new Direccion("Av. Los Lagos 123", "Puerto Montt", "Los Lagos");
        Direccion dir2 = new Direccion("Calle Principal 45", "Osorno", "Los Lagos");
        Direccion dir3 = new Direccion("Camino Rural 25", "Frutillar", "Los Lagos");

        //Creo 3 empleados para la prueba
        Empleado emp1 = new Empleado("María Torres", 35, "18.456.789-2", "Gerente de Ventas", 1500000, dir1);
        Empleado emp2 = new Empleado("Carlos Díaz", 28, "19.987.654-3", "Químico", 1200000, dir2);
        Empleado emp3 = new Empleado("Ana López", 40, "17.345.678-9", "Encargada de Exportación", 1800000, dir3);

        //Los despliego en pantalla
        System.out.println("Información de Empleados\n");
        System.out.println(emp1);
        System.out.println("\n" + emp2);
        System.out.println("\n" + emp3);
        }
    }