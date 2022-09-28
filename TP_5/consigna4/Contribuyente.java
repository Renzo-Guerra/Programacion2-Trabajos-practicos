package consigna4;

// "Contribuyente" es el contribuyente simple

public class Contribuyente {
  private String nombre;
  private long identificacion_tributaria;
  private double monto_fijo;

  public Contribuyente(String nombre, long codigo_identificacion_tributaria, double monto_fijo){
    setNombre(nombre);
    setIdentificacionTributaria(codigo_identificacion_tributaria);
    setMontoFijo(monto_fijo);
  }
  // Setter
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setIdentificacionTributaria(long identificacion_tributaria){this.identificacion_tributaria = identificacion_tributaria;}
  public void setMontoFijo(double monto_fijo){this.monto_fijo = monto_fijo;}
  // Getter
  public String getNombre(){return this.nombre;}
  public long getIdentificacionTributaria(){return this.identificacion_tributaria;}
  public double getMontoFijo(){return this.monto_fijo;}
  /**
   * Calcula lo que el contribuyente debe pagar al estado
   * @return monto final a pagar
   */
  public double getMontoTotalPagar(){
    return this.getMontoFijo();
  }
}
