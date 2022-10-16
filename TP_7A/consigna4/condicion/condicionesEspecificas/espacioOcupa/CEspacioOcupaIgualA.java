package TP_7A.consigna4.condicion.condicionesEspecificas.espacioOcupa;

import TP_7A.consigna4.condicion.Condicion;
import TP_7A.consigna4.ficha.Ficha;

public class CEspacioOcupaIgualA extends Condicion{
  private double espacioExacto;

  public CEspacioOcupaIgualA(double espacioExacto){
    this.espacioExacto = espacioExacto;
  }
  @Override
  public boolean cumple(Ficha ficha) {
    return ficha.getEspacio() == espacioExacto;
  }
  
}