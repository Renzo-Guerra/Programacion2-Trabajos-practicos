package TP_7A.consigna3.condicion.condicionesUnicas.condicionSol;

import TP_7A.consigna3.Planta;
import TP_7A.consigna3.condicion.Condicion;

public class CondicionSolIgualA extends Condicion{
  private int sol;

  public CondicionSolIgualA(int solExacto){
    sol = solExacto;
  }

  @Override
  public boolean cumple(Planta planta) {
    return planta.getSol() == sol;
  }
  
}
