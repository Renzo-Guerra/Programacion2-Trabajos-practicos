package TP_4.consigna5.producto;

import java.time.LocalDate;

public class ProductoCongeladoAgua extends ProductoRefrigerado{
  double gramos_sal_en_agua;
  private static int cada_ml_agua = 100;


  /**
   * Instancia un ProductoCongeladoAgua
   * @param fecha_envasado (LocalDate) del producto
   * @param fecha_vencimiento (LocalDate) del producto
   * @param granja_de_origen (String) del producto (El nombre nomas)
   * @param numero_del_lote (long) del producto
   * @param codigo_OSA (String) del producto
   * @param temperatura_recomendada (int) del producto
   * @param gramos_sal_en_agua (double) gramos de sal por cada 100ml de agua
   */
  public ProductoCongeladoAgua(String nombre_del_producto, LocalDate fecha_envasado, LocalDate fecha_vencimiento, String granja_de_origen, long numero_del_lote, String codigo_OSA, int temperatura_recomendada, double gramos_sal_en_agua) {
    super(nombre_del_producto, fecha_envasado, fecha_vencimiento, granja_de_origen, numero_del_lote, codigo_OSA, temperatura_recomendada);
    setGramosSalEnAgua(gramos_sal_en_agua);
  }
  
  // Setters
  public void setGramosSalEnAgua(double gramos_sal_en_agua){this.gramos_sal_en_agua = gramos_sal_en_agua;}

  // Getters
  public double getGramosSalEnAgua(){return gramos_sal_en_agua;}

  @Override
  public String toString() {
    return super.toString() + ", gramos de sal cada " + cada_ml_agua + " ml de agua: " + getGramosSalEnAgua();
  }
}
