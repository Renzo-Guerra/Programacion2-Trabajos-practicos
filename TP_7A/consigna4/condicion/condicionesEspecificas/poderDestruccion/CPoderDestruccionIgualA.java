package TP_7A.consigna4.condicion.condicionesEspecificas.poderDestruccion;

import TP_7A.consigna4.condicion.Condicion;
import TP_7A.consigna4.ficha.Ficha;

public class CPoderDestruccionIgualA extends Condicion{
  private double destruccionExacta;

  public CPoderDestruccionIgualA(double destruccionExacta){
    this.destruccionExacta = destruccionExacta;
  }
  @Override
  public boolean cumple(Ficha ficha) {
    return ficha.getPoderDestruccion() == destruccionExacta;
  }
  
}