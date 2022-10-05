package consigna5.empleado;

import java.util.ArrayList;

public abstract class EmpleadoConVentas extends Empleado{
  protected ArrayList<Double> ventas_concretadas;

  public EmpleadoConVentas(String nombre, String apellido, long dni, double sueldo_base) {
    super(nombre, apellido, dni, sueldo_base);
    ventas_concretadas = new ArrayList<>();
  }
  
  public void agregarVenta(double nueva_venta){
    ventas_concretadas.add(nueva_venta);
  }

  @Override
  public abstract double getMontoCobrar();
}
