package consigna4;

import java.util.ArrayList;

public class ContribuyenteProgramador extends Contribuyente{
  private ArrayList<Double> desarrollo_software;
  private static double porcentaje_monto_fijo;
  private static double porcentaje_facturado;

  public ContribuyenteProgramador(String nombre, long codigo_identificacion_tributaria, double monto_fijo) {
    super(nombre, codigo_identificacion_tributaria, monto_fijo);
    desarrollo_software = new ArrayList<>();
  }

  // Setters
  public void setPorcentajeMontoFijo(double porcentaje_monto_fijo){ContribuyenteProgramador.porcentaje_monto_fijo = porcentaje_monto_fijo;}
  public void setPorcentajeFacturado(double porcentaje_facturado){ContribuyenteProgramador.porcentaje_facturado = porcentaje_facturado;}
  // Getters
  public double getPorcentajeMontoFijo(){return porcentaje_monto_fijo;}
  public double getPorcentajeFacturado() {return porcentaje_facturado;}

  public void agregarDesarrolloSoftware(double monto){
    if(monto > 0){
      desarrollo_software.add(monto);
    }
  }

  public double montoTotalDesarrolloSoftware(){
    double acumulador = 0;
    for (Double desarrollo_actual : desarrollo_software) {
      acumulador += desarrollo_actual;
    }

    return acumulador;
  }
  public double getPorcentajePagar(){
    return montoTotalDesarrolloSoftware() / 100 * getPorcentajeFacturado();
  }

  @Override
  public double getMontoTotalPagar(){
    return ((getMontoFijo() - (getMontoFijo() * 100 / getPorcentajePagar())) + (montoTotalDesarrolloSoftware() / 100 * getPorcentajeFacturado())); 
  }
}
