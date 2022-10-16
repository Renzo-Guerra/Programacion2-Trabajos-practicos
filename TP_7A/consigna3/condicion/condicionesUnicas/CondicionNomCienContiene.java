package TP_7A.consigna3.condicion.condicionesUnicas;

import TP_7A.consigna3.Planta;
import TP_7A.consigna3.condicion.Condicion;

public class CondicionNomCienContiene extends Condicion{
  private String substring;

  public CondicionNomCienContiene(String substringBuscar){
    substring = substringBuscar;
  }
  
  @Override
  public boolean cumple(Planta planta) {
    return planta.getNombreCientifico().contains(this.substring);
  }
}
