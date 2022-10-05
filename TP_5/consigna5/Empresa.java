package consigna5;

import java.util.ArrayList;

import consigna5.empleado.Empleado;

public class Empresa {
  private ArrayList<Empleado> empleados;

  public Empresa(){
    empleados = new ArrayList<>();
  }

  public void agregarEmpleado(Empleado nuevo_empleado){
    if((nuevo_empleado != null) && (!empleados.contains(nuevo_empleado))){
      empleados.add(nuevo_empleado);
    }
  }

  /**
   * Calcula la suma total de gastos en sueldos
   * @return la suma total.
   */
  public double getMontoCobrarEmpleados(){
    double acumulador = 0;
    for (Empleado empleado : empleados) {
      acumulador += empleado.getMontoCobrar();
    }

    return acumulador;
  }
}
