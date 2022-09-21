package TP_4.consigna5.producto;

import java.time.LocalDate;

public class ProductoCongeladoNitrogeno extends ProductoRefrigerado{
  String metodo_congelacion;
  int tiempo_expuesto_nitrogeno; // En segundos

  /**
   * Instancia un ProductoCongeladoNitrogeno
   * @param fecha_envasado (LocalDate) del producto
   * @param fecha_vencimiento (LocalDate) del producto
   * @param granja_de_origen (String) del producto (El nombre nomas)
   * @param numero_del_lote (long) del producto
   * @param codigo_OSA (String) del producto
   * @param temperatura_recomendada (int) del producto
   * @param metodo_congelacion (String) del producto
   * @param tiempo_expuesto_nitrogeno (int) tiempo en segundos que el producto estuvo expuesto al nitrogeno
   */
  public ProductoCongeladoNitrogeno(String nombre_del_producto, LocalDate fecha_envasado, LocalDate fecha_vencimiento, String granja_de_origen, long numero_del_lote, String codigo_OSA, int temperatura_recomendada, String metodo_congelacion, int tiempo_expuesto_nitrogeno) {
    super(nombre_del_producto, fecha_envasado, fecha_vencimiento, granja_de_origen, numero_del_lote, codigo_OSA, temperatura_recomendada);
    setMetodoCongelacion(metodo_congelacion);
    setTiempoExpuestoNitrogeno(tiempo_expuesto_nitrogeno);
  }
  
  public void setMetodoCongelacion(String metodo_congelacion){this.metodo_congelacion = metodo_congelacion;}
  public void setTiempoExpuestoNitrogeno(int tiempo_expuesto_nitrogeno){this.tiempo_expuesto_nitrogeno = tiempo_expuesto_nitrogeno;}

  public String getMetodoCongelacion(){return metodo_congelacion;}
  public int getTiempoExpuestoNitrogeno(){return tiempo_expuesto_nitrogeno;}

  @Override
  public String toString() {
    return super.toString() + ", metodo de congelacion: " + getMetodoCongelacion() + ", segundos expuestos al nitrogeno: " + getTiempoExpuestoNitrogeno();
  }
}
