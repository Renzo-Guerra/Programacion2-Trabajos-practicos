package TP_4.consigna3.Empleado;

public class EmpleadoContratado extends Empleado {
  private static double montoFijoSemanal = 8000;

  public EmpleadoContratado(String nombre, String apellido, long dni) {
    super(nombre, apellido, dni);
  }

  @Override
  public double getMontoFijoSemanal(){return EmpleadoContratado.montoFijoSemanal;}

  @Override
  public double calcularCobroEmpleado(){return getMontoFijoSemanal();}

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + ": {Nombre: " + getNombre() + ", apellido: " + getApellido() + ", dni: " + getDni() + ", monto acumulado: $" + calcularCobroEmpleado() + "}";
  }
}
