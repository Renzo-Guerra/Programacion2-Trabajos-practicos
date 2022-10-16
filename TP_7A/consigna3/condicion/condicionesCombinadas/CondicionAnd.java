package TP_7A.consigna3.condicion.condicionesCombinadas;


import TP_7A.consigna3.condicion.Condicion;
import TP_7A.consigna3.Planta;

public class CondicionAnd extends Condicion{
  private Condicion c1;
  private Condicion c2;

  public CondicionAnd(Condicion c1, Condicion c2){
    this.c1 = c1;
    this.c2 = c2;
  }
  @Override
  public boolean cumple(Planta planta) {
    return c1.cumple(planta) && c2.cumple(planta);
  }
}
