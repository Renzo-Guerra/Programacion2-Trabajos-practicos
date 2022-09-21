package TP_4.consigna5.producto;

import java.time.LocalDate;

public class ProductoRefrigerado extends ProductoFresco{
  String codigo_OSA; // OSA -> Organismo de Supervision Alimentaria.
  int temp_recomendada;
  /**
   * Instancia un Producto Refrigerado
   * @param fecha_envasado del producto
   * @param fecha_vencimiento del producto
   * @param granja_de_origen del producto
   * @param numero_del_lote del producto
   * @param codigo_OSA OSA: Organismo de Supervision Alimentaria 
   * @param temperatura_recomendada del producto
   */
  public ProductoRefrigerado(String nombre_del_producto, LocalDate fecha_envasado, LocalDate fecha_vencimiento, String granja_de_origen, long numero_del_lote, String codigo_OSA, int temperatura_recomendada) {
    super(nombre_del_producto, fecha_envasado, fecha_vencimiento, granja_de_origen, numero_del_lote);
    setCodigoOSA(codigo_OSA);
    setTemprecomendada(temp_recomendada);
  }
  
  public void setCodigoOSA(String codigo_OSA){this.codigo_OSA = codigo_OSA;}
  public void setTemprecomendada(int temp_recomendada){this.temp_recomendada = temp_recomendada;}

  public String getCodigoOSA(){return codigo_OSA;}
  public int getTempRecomendada(){return temp_recomendada;}  

  @Override
  public String toString() {
    return super.toString() + ", codigo OSA: " + getCodigoOSA() + ", temperatura recomendada: " + getTempRecomendada();
  }
}
