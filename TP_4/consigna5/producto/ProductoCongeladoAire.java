package TP_4.consigna5.producto;

import java.time.LocalDate;

public class ProductoCongeladoAire extends ProductoRefrigerado{
  double porcentaje_nitrogeno;
  double porcentaje_oxigeno;
  double porcentaje_dioxido_carbono;
  double porcentaje_vapor_agua;

  /**
   * Instancia un ProductoCongeladoAire
   * @param fecha_envasado (LocalDate) del producto
   * @param fecha_vencimiento (LocalDate) del producto
   * @param granja_de_origen (String) del producto (El nombre nomas)
   * @param numero_del_lote (long) del producto
   * @param codigo_OSA (String) del producto
   * @param temperatura_recomendada (int) del producto
   * @param porcentaje_nitrogeno (double) porcentaje de nitrogeno en el producto
   * @param porcentaje_oxigeno (double) porcentaje de oxigeno en el producto
   * @param porcentaje_dioxido_carbono (double) porcentaje de dioxido de carbono en el producto
   * @param porcentaje_vapor_agua (double) porcentaje de vapor de agua en el producto
   */
  public ProductoCongeladoAire(String nombre_del_producto, LocalDate fecha_envasado, LocalDate fecha_vencimiento, String granja_de_origen, long numero_del_lote, String codigo_OSA, int temperatura_recomendada, double porcentaje_nitrogeno, double porcentaje_oxigeno, double porcentaje_dioxido_carbono, double porcentaje_vapor_agua) {
    super(nombre_del_producto, fecha_envasado, fecha_vencimiento, granja_de_origen, numero_del_lote, codigo_OSA, temperatura_recomendada);
    setPorcentajeNitrogeno(porcentaje_nitrogeno);
    setPorcentajeOxigeno(porcentaje_oxigeno);
    setPorcentajeDioxidoCarbono(porcentaje_dioxido_carbono);
    setPorcentajeVaporAgua(porcentaje_vapor_agua);
  }
  
  public void setPorcentajeNitrogeno(double porcentaje_nitrogeno){this.porcentaje_nitrogeno = porcentaje_nitrogeno;}
  public void setPorcentajeOxigeno(double porcentaje_oxigeno){this.porcentaje_oxigeno = porcentaje_oxigeno;}
  public void setPorcentajeDioxidoCarbono(double porcentaje_dioxido_carbono){this.porcentaje_dioxido_carbono = porcentaje_dioxido_carbono;}
  public void setPorcentajeVaporAgua(double porcentaje_vapor_agua){this.porcentaje_vapor_agua = porcentaje_vapor_agua;}

  public double getPorcentajeNitrogeno(){return porcentaje_nitrogeno;}
  public double getPorcentajeOxigeno(){return porcentaje_oxigeno;}
  public double getPorcentajeDioxidoCarbono(){return porcentaje_dioxido_carbono;}
  public double getPorcentajeVaporAgua(){return porcentaje_vapor_agua;}

  @Override
  public String toString() {
    return super.toString() + ", % nitrogeno: " + getPorcentajeNitrogeno() + ", % oxigeno: " + getPorcentajeOxigeno() + ", % dioxido de carbono: " + getPorcentajeDioxidoCarbono() + ", % vapor de agua: " + getPorcentajeVaporAgua();
  }
}
