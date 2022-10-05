package consigna5.empleado;

public class EmpVendedor extends EmpleadoConVentas{
  private int porcentaje_comicion_venta;

  public EmpVendedor(String nombre, String apellido, long dni, double sueldo_base, int porcentaje_comicion_venta) {
    super(nombre, apellido, dni, sueldo_base);
    setPorcentajeComicionVenta(porcentaje_comicion_venta);
  }

  public void setPorcentajeComicionVenta(int porcentaje_comicion_venta) {
    this.porcentaje_comicion_venta = porcentaje_comicion_venta;
  } 
  public int getPorcentajeComicionVenta(){return porcentaje_comicion_venta;}

  public double sumaTotalVentas(){
    double acumulador = 0;
    for (double venta : this.ventas_concretadas) {
      acumulador += venta;
    }

    return acumulador;
  }

  public double getComicionGanada(){
    return sumaTotalVentas() / 100 * getPorcentajeComicionVenta();
  }

  @Override
  public double getMontoCobrar() {
    return super.getSueldoBase() + getComicionGanada();
  }
}
