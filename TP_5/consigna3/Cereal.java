package consigna3;

import java.util.ArrayList;

public class Cereal {
  private String nombre;
  protected ArrayList<String> minerales;

  public Cereal(String nombre_del_cereal){
    minerales = new ArrayList<>();
    setNombre(nombre_del_cereal);
  }

  // Setter
  public void setNombre(String nombre){this.nombre = nombre;}
  // Getter
  public String getNombre(){return this.nombre;}

  public void agregarMineral(String mineral_agregar){
    if((mineral_agregar != null) && (!minerales.contains(mineral_agregar))){
      minerales.add(mineral_agregar);
    }
  }

  /**
   * Determina si un determinado cereal puede ser o no plantado en un lote
   * @param lote_evaluar
   * @return true / false
   */
  public boolean puedeSerPlantadoEnDeterminadoLote(Lote lote_evaluar){
    for (String mineral: lote_evaluar.minerales) {
      if(this.tieneMineral(mineral)){
        return true;
      }
    }

    return false;
  }

  /**
   * Dado un mineral verifica si el cereal posee este mineral
   * @param mineral_verificar
   * @return true / false
   */
  protected boolean tieneMineral(String mineral_verificar){
    return minerales.contains(mineral_verificar);
  }

  @Override
  public boolean equals(Object obj) {
    Cereal cereal = (Cereal)obj;
    return (cereal.getNombre() == this.getNombre());
  }

  /**
   * Concatena todos los minerales del cereal
   * @return (String) con todos los minerales
   */
  public String getMinerales() {
    String resultado = "";
    for (String mineral : minerales) {
      resultado += mineral + " - ";
    }
    
    return resultado;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " - nombre: " + this.getNombre() + ", minerales{" + this.getMinerales() + "}";
  }
}
