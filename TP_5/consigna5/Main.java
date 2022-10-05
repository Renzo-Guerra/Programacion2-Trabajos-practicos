package consigna5;

import consigna5.empleado.EmpBono;
import consigna5.empleado.EmpVendedor;
import consigna5.empleado.Empleado;

public class Main {
  public static void main(String[] args) {
    Empresa empresa = new Empresa();
    // Instanciacion de los empleados
    Empleado empleado1 = new Empleado("Rodrigo", "Morales", 22333444, 22000);
    EmpVendedor empleado2 = new EmpVendedor("Miguel", "Torres",34332221, 12000, 18);
    EmpBono empleado3 = new EmpBono("Maria", "Nuñez", 24876678, 19000, 2000, 3);
    
    // Testeando metodos
    // Empleado 1
    System.out.println("\nEmpleado 1:");
    System.out.println("El empleado " + empleado1.getNombre() + " va a cobrar: " + empleado1.getMontoCobrar());
    // Empleado 2
    System.out.println("\nEmpleado 2:");
    System.out.println("El empleado " + empleado2.getNombre() + " va a cobrar: " + empleado2.getMontoCobrar());
    empleado2.agregarVenta(1800);
    empleado2.agregarVenta(5500);
    empleado2.agregarVenta(4200);
    empleado2.agregarVenta(1600);
    System.out.println("El empleado " + empleado2.getNombre() + " realizó 4 ventas");
    System.out.println("El empleado " + empleado2.getNombre() + " va a cobrar: " + empleado2.getMontoCobrar());
    // Empleado 3
    System.out.println("\nEmpleado 3:");
    System.out.println("El empleado " + empleado3.getNombre() + " va a cobrar: " + empleado3.getMontoCobrar());
    empleado3.agregarVenta(100);
    empleado3.agregarVenta(200);
    empleado3.agregarVenta(300);
    System.out.println("El empleado " + empleado3.getNombre() + " realizo 3 ventas");
    System.out.println("El empleado " + empleado3.getNombre() + " va a cobrar: " + empleado3.getMontoCobrar());

    // Se agregan los empleados a la empresa
    empresa.agregarEmpleado(empleado1);
    empresa.agregarEmpleado(empleado2);
    empresa.agregarEmpleado(empleado3);

    System.out.println("La suma total de gastos en sueldos de la empresa es de: " + empresa.getMontoCobrarEmpleados());
  }
}
