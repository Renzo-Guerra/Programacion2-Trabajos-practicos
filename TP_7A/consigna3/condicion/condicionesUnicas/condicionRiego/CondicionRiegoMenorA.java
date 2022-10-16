package TP_7A.consigna3.condicion.condicionesUnicas.condicionRiego;

import TP_7A.consigna3.Planta;
import TP_7A.consigna3.condicion.Condicion;

public class CondicionRiegoMenorA extends Condicion{
  private int riego;

  public CondicionRiegoMenorA(int numeroMenorA){
    riego = numeroMenorA;
  }

  @Override
  public boolean cumple(Planta planta) {
    return planta.getRiego() < this.riego;
  }
}
