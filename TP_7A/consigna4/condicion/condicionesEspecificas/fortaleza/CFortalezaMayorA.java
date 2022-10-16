package TP_7A.consigna4.condicion.condicionesEspecificas.fortaleza;

import TP_7A.consigna4.condicion.Condicion;
import TP_7A.consigna4.ficha.Ficha;

public class CFortalezaMayorA extends Condicion{
  private double cotaInferior;

  public CFortalezaMayorA(double cotaInferior){
    this.cotaInferior = cotaInferior;
  }
  @Override
  public boolean cumple(Ficha ficha) {
    return ficha.getFortaleza() > cotaInferior;
  }
  
}
