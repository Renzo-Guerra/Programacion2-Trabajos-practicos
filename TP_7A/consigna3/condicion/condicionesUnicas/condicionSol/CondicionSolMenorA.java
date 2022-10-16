package TP_7A.consigna3.condicion.condicionesUnicas.condicionSol;

import TP_7A.consigna3.Planta;
import TP_7A.consigna3.condicion.Condicion;

public class CondicionSolMenorA extends Condicion{
  private int sol;

  public CondicionSolMenorA(int numeroMenorA){
    sol = numeroMenorA;
  }

  @Override
  public boolean cumple(Planta planta) {
    return planta.getSol() < this.sol;
  }
}
