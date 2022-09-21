package TP_4.consigna3.Empleado;

public class EmpleadoPorHoras extends Empleado {
  private static double montoFijoSemanal = 3000;
  private static double salarioPorHora = 200;
  private int cant_horas_trabajadas;

  public EmpleadoPorHoras(String nombre, String apellido, long dni) {
    super(nombre, apellido, dni);
    this.cant_horas_trabajadas = 0; 
  }

  public void agregarHoras(int cant_horas){
    this.cant_horas_trabajadas += cant_horas;
  }
  public void resetearHoras(){this.cant_horas_trabajadas = 0;}
  
  @Override
  public double getMontoFijoSemanal(){return EmpleadoPorHoras.montoFijoSemanal;}
  public double getSalarioPorHora(){return EmpleadoPorHoras.salarioPorHora;}
  public int getCantHorasTrabajadas(){return cant_horas_trabajadas;}

  @Override
  public double calcularCobroEmpleado() {
    return getMontoFijoSemanal() + (getSalarioPorHora() * cant_horas_trabajadas);
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + ": {Nombre: " + getNombre() + ", apellido: " + getApellido() + ", dni: " + getDni() + ", horas trabajadas: " + getCantHorasTrabajadas() + ", monto acumulado: $" + calcularCobroEmpleado() + "}";
  }

  
}
