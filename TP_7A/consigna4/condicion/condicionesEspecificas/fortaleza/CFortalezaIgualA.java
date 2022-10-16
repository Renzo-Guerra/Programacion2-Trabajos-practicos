package TP_7A.consigna4.condicion.condicionesEspecificas.fortaleza;

import TP_7A.consigna4.condicion.Condicion;
import TP_7A.consigna4.ficha.Ficha;

public class CFortalezaIgualA extends Condicion{
  private double fortalezaExacta;

  public CFortalezaIgualA(double fortalezaExacta){
    this.fortalezaExacta = fortalezaExacta;
  }
  @Override
  public boolean cumple(Ficha ficha) {
    return ficha.getFortaleza() == fortalezaExacta;
  }
  
}