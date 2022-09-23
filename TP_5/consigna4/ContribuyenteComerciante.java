package consigna4;

import java.util.ArrayList;

public class ContribuyenteComerciante extends Contribuyente{
  private ArrayList<Double> ventas;
  private static double porcentaje_monto_fijo;
  private static double porcentaje_ventas;
  
  public ContribuyenteComerciante(String nombre, long codigo_identificacion_tributaria, double monto_fijo) {
    super(nombre, codigo_identificacion_tributaria, monto_fijo);
    ventas = new ArrayList<>();
    setPorcentajeMontoFijo(50);
    setPorcentajeVentas(3.5);
  }
  public static void setPorcentajeMontoFijo(double porcentaje_monto_fijo){ContribuyenteComerciante.porcentaje_monto_fijo = porcentaje_monto_fijo;}
  public void setPorcentajeVentas(double porcentaje_ventas){ContribuyenteComerciante.porcentaje_ventas = porcentaje_ventas;}

  public double getPorcentajeMontoFijo(){return porcentaje_monto_fijo;}
  public double getPorcentajeVentas(){return porcentaje_ventas;}

  public void agregarVenta(double monto){
    if(monto > 0){
      ventas.add(monto);
    }
  }

  public double montoTotalVentas(){
    double acumulador = 0;
    for (Double venta : ventas) {
      acumulador += venta;
    }

    return acumulador;
  }
  public double getPorcentajePagar(){
    return montoTotalVentas() / 100 * getPorcentajeVentas();
  }
  @Override
  public double getMontoTotalPagar(){
    return ((getMontoFijo() - (getMontoFijo() * 100 / getPorcentajePagar())) + (montoTotalVentas() / 100 * getPorcentajeVentas())); 
  }
}
