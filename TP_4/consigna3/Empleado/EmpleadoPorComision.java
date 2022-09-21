package TP_4.consigna3.Empleado;

import java.util.ArrayList;

public class EmpleadoPorComision extends Empleado {
  private static double montoFijoSemanal = 2000;
  private static double porcentajePorVenta = 14;
  private ArrayList<Double> ventas;

  public EmpleadoPorComision(String nombre, String apellido, long dni) {
    super(nombre, apellido, dni);
    ventas = new ArrayList<>();
  }

  public void resetearVentas(){ventas.clear();}
  public void agregarVenta(double precio_de_la_venta){
    if(precio_de_la_venta > 0){
      ventas.add(precio_de_la_venta);
    }
  }
  public int getCantidadVentasRealizadas(){return this.ventas.size();}


  @Override
  public double getMontoFijoSemanal() {return EmpleadoPorComision.montoFijoSemanal;}

  @Override
  public double calcularCobroEmpleado() {return getMontoFijoSemanal() + getComisionPorVentas();}

  /**
   * Calcula el monto que obtendremos por todas ventas que hizo el empleado
   * @return el porcentaje (en dinero) que obtendrá el empleado por sus ventas
   */
  public double getComisionPorVentas(){
    double acumulador = 0;
    
    for (double venta : ventas) {
        acumulador += venta;
    }

    return (acumulador / 100 * getPorcentajePorVenta());
  }

  public double getPorcentajePorVenta(){return EmpleadoPorComision.porcentajePorVenta;}

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + ": {Nombre: " + getNombre() + ", apellido: " + getApellido() + ", dni: " + getDni() + ", ventas realizadas: " + getCantidadVentasRealizadas() + ", comisiones recaudadas: " + getComisionPorVentas() + ", monto acumulado: $" + calcularCobroEmpleado() + "}";
  }
  
}
