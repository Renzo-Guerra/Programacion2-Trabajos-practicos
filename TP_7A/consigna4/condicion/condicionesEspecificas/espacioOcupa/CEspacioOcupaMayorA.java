package TP_7A.consigna4.condicion.condicionesEspecificas.espacioOcupa;

import TP_7A.consigna4.condicion.Condicion;
import TP_7A.consigna4.ficha.Ficha;

public class CEspacioOcupaMayorA extends Condicion{
  private double cotaInferior;

  public CEspacioOcupaMayorA(double cotaInferior){
    this.cotaInferior = cotaInferior;
  }
  @Override
  public boolean cumple(Ficha ficha) {
    return ficha.getEspacio() > cotaInferior;
  }
  
}
