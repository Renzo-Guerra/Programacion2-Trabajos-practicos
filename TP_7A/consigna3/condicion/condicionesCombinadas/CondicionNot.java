package TP_7A.consigna3.condicion.condicionesCombinadas;

import TP_7A.consigna3.Planta;
import TP_7A.consigna3.condicion.Condicion;

public class CondicionNot extends Condicion{
  private Condicion condicion;

  public CondicionNot(Condicion condicion){
    this.condicion = condicion;
  }
  @Override
  public boolean cumple(Planta planta) {
    return !condicion.cumple(planta);
  }
}
