package TP_7A.consigna3.condicion.condicionesUnicas.condicionRiego;

import TP_7A.consigna3.Planta;
import TP_7A.consigna3.condicion.Condicion;

public class CondicionRiegoIgualA extends Condicion{
  private int riego;

  public CondicionRiegoIgualA(int riegoExacto){
    riego = riegoExacto;
  }

  @Override
  public boolean cumple(Planta planta) {
    return planta.getRiego() == riego;
  }
  
}
