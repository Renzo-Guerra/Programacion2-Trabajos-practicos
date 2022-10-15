package TP_7A.consigna2.condicion.condicionesCombinadas;

import TP_7A.consigna2.Documento;
import TP_7A.consigna2.condicion.Condicion;

public class CondicionAnd extends Condicion{
  private Condicion c1;
  private Condicion c2;

  public CondicionAnd(Condicion c1, Condicion c2){
    this.c1 = c1;
    this.c2 = c2;
  }
  @Override
  public boolean cumple(Documento documento) {
    return c1.cumple(documento) && c2.cumple(documento);
  }
}
