package TP_7A.consigna2.condicion.condicionesCombinadas;

import TP_7A.consigna2.Documento;
import TP_7A.consigna2.condicion.Condicion;

public class CondicionNot extends Condicion{
  private Condicion condicion;

  public CondicionNot(Condicion condicion){
    this.condicion = condicion;
  }
  @Override
  public boolean cumple(Documento documento) {
    return !condicion.cumple(documento);
  }
}
