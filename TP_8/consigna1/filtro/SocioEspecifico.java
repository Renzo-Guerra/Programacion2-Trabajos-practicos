package TP_8.consigna1.filtro;

import TP_8.consigna1.Socio;

public class SocioEspecifico extends Filtro{
  private Socio socioBuscar;

  public SocioEspecifico(Socio socioBuscar){
    this.socioBuscar = socioBuscar;
  }

  @Override
  public boolean cumple(Socio socio) {
    return socio.equals(socioBuscar);
  }
  
}
