package TP_4.consigna5.producto;

import java.time.LocalDate;

/**
 * Debido a que los productos "frescos", "refrigerados" y "congelados" 
 * compartian los atributos "fecha envasado" y "granja", en vez de crear una clase 
 * abstracta de "Producto" que contenga la "informacion comun", la clase padre pasará 
 * a ser "ProductoFresco".
 */

public class ProductoFresco {
  String nombre;
  LocalDate fecha_envasado;
  LocalDate fecha_vencimiento;
  String granja; // Alto lio crear un objeto Granja, a gran escala se podria hacer
  long lote;

  /**
   * Instancia un ProductoFresco
   * @param nombre_del_producto (String)
   * @param fecha_envasado (LocalDate)
   * @param fecha_vencimiento (LocalDate)
   * @param granja_de_origen (String)
   * @param numero_del_lote (long)
   */
  public ProductoFresco(String nombre_del_producto, LocalDate fecha_envasado, LocalDate fecha_vencimiento, String granja_de_origen, long numero_del_lote){
    setNombre(nombre_del_producto);
    setFechaEnvasado(fecha_envasado);
    setFechaVencimiento(fecha_vencimiento);
    setGranja(granja_de_origen);
    setLote(lote);
  }

  public void setNombre(String nombre_del_producto){this.nombre = nombre_del_producto;}
  public void setFechaEnvasado(LocalDate fecha_envasado){this.fecha_envasado = fecha_envasado;}
  public void setFechaVencimiento(LocalDate fecha_vencimiento){this.fecha_vencimiento = fecha_vencimiento;}
  public void setGranja(String granja){this.granja = granja;}
  public void setLote(long lote){this.lote = lote;}

  public String getNombre(){return nombre;}
  public LocalDate getFechaEnvasado(){return fecha_envasado;}
  public LocalDate getFechaVencimiento(){return fecha_vencimiento;}
  public String getGranja(){return granja;}
  public long getLote(){return lote;}

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " - nombre: " + getNombre() + ", fecha envasado: " + getFechaEnvasado() + ", fecha vencimiento: " + getFechaVencimiento() + ", granja: " + getGranja() + ", numero del lote: " + getLote();
  }
}
