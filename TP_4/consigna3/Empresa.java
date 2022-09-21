package TP_4.consigna3;

import java.util.ArrayList;
import TP_4.consigna3.Empleado.Empleado;

public class Empresa {
  private ArrayList<Empleado> empleados;

  public Empresa(){
    empleados = new ArrayList<>();
  }

  /**
   * Agrega un empleado al registro de empleados, para eso, el nuevo empleado a ingresar 
   * NO debe aparecer ya en el registro
   * @param nuevo_empleado a agregar al registro de empleados
   */
  public void agregarEmpleado(Empleado nuevo_empleado){
    if((nuevo_empleado != null) && (!empleados.contains(nuevo_empleado))){
      empleados.add(nuevo_empleado);
    }
  }

  public void verTodosLosEmpleados(){
    System.out.println("Empleados: ");
    for (Empleado empleado : empleados) {
      System.out.println(empleado);
    }
    System.out.println("");
  }

  public double getMontoPagar(Empleado empleado_evaluado){
    return empleado_evaluado.calcularCobroEmpleado();
  }
}
