package TP_4.consigna3;

import TP_4.consigna3.Empleado.*;

public class Main{
  public static void main(String[] args) {
    EmpleadoContratado emp1 = new EmpleadoContratado("Juan", "Miguel", 34435444);
    EmpleadoContratado emp2 = new EmpleadoContratado("Franco", "Rodriguez", 22333444);
    EmpleadoContratado emp3 = new EmpleadoContratado("Maria", "Gonzales", 8231234);
    EmpleadoPorHoras emp4 = new EmpleadoPorHoras("Tomas", "Torres", 12435657);
    EmpleadoPorHoras emp5 = new EmpleadoPorHoras("Rodolfo", "Anzorena", 40345839);
    EmpleadoPorHoras emp6 = new EmpleadoPorHoras("Gimena", "Romero", 14346466);
    EmpleadoPorComision emp7 = new EmpleadoPorComision("Julieta", "Peralta", 43342355);
    EmpleadoPorComision emp8 = new EmpleadoPorComision("Pilar", "Aguilar", 38982234);
    EmpleadoPorComision emp9 = new EmpleadoPorComision("Lucas", "Ponse", 44543546);
    emp4.agregarHoras(5);
    emp4.agregarHoras(9);
    emp5.agregarHoras(8);
    emp6.agregarHoras(4);
    emp6.agregarHoras(5);
    emp6.resetearHoras();

    emp7.agregarVenta(7000);
    emp7.agregarVenta(6000);
    emp7.agregarVenta(7523.43);
    emp8.agregarVenta(5000);
    emp9.agregarVenta(4500);
    emp9.resetearVentas();
    Empresa empresa = new Empresa();
    empresa.agregarEmpleado(emp1);
    empresa.agregarEmpleado(emp2);
    empresa.agregarEmpleado(emp3);
    empresa.agregarEmpleado(emp4);
    empresa.agregarEmpleado(emp5);
    empresa.agregarEmpleado(emp6);
    empresa.agregarEmpleado(emp7);
    empresa.agregarEmpleado(emp8);
    empresa.agregarEmpleado(emp9);

    empresa.verTodosLosEmpleados();

  }
}