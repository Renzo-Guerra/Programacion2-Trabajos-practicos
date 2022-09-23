package consigna3;

public class CerealPastura extends Cereal{
  private static int minima_superficie_requerida; 

  public CerealPastura(String nombre_del_cereal) {
    super(nombre_del_cereal);
    minima_superficie_requerida = 50;
  }
  
  /**
   * Determina si un determinado cereal puede ser o no plantado en un lote
   * @param lote_evaluar
   * @return true / false
   */
  public boolean puedeSerPlantadoEnDeterminadoLote(Lote lote_evaluar){
    // Verificamos la superficie
    if(lote_evaluar.getSuperficie() < minima_superficie_requerida){return false;}

    for (String mineral: lote_evaluar.minerales) {
      if(this.tieneMineral(mineral)){
        return true;
      }
    }

    return false;
  }
}
