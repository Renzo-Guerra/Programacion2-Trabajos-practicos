package TP_4.consigna6;

import java.util.ArrayList;

public class Jerarquico extends Empleado{
  private ArrayList<Empleado> empleados_a_cargo;
  
  public Jerarquico(String nombre, String apellido, int edad, long numero_legajo, double sueldo) {
    super(nombre, apellido, edad, numero_legajo, sueldo);
    setCargo("Jerarquico");  // Medio de forma "rustica" se asocia el cargo
    /**
     * No pude asignarle el cargo como las otras veces ya que "Jerarquico" es hija de una clase abstracta, 
     * por lo tanto tengo que usar su constructor (La signatura del constructor "Empleado")
     */
    empleados_a_cargo = new ArrayList<>();
  }

  public void agregarEmpleadoACargo(Empleado nuevo_empleado_a_cargo){
    if((nuevo_empleado_a_cargo != null) && (!empleados_a_cargo.contains(nuevo_empleado_a_cargo))){
      empleados_a_cargo.add(nuevo_empleado_a_cargo);
    }
  }
  
  public void verEmpleadosACargo(){
    for (Empleado empleado : empleados_a_cargo) {
      System.out.println(empleado);
    }
  }
}
