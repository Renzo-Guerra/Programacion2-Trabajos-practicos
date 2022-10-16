package TP_7A.consigna4.condicion.condicionesEspecificas.poderDestruccion;

import TP_7A.consigna4.condicion.Condicion;
import TP_7A.consigna4.ficha.Ficha;

public class CPoderDestruccionMayorA extends Condicion{
  private double cotaInferior;

  public CPoderDestruccionMayorA(double cotaInferior){
    this.cotaInferior = cotaInferior;
  }
  @Override
  public boolean cumple(Ficha ficha) {
    return ficha.getPoderDestruccion() > cotaInferior;
  }
  
}
