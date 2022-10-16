package TP_7A.consigna4.condicion.condicionalesLogicos;

import TP_7A.consigna4.condicion.Condicion;
import TP_7A.consigna4.ficha.Ficha;

public class CondicionNot extends Condicion{
  private Condicion condicion;

  public CondicionNot(Condicion condicion){
    this.condicion = condicion;
  }
  @Override
  public boolean cumple(Ficha ficha) {
    return !condicion.cumple(ficha);
  }
}
