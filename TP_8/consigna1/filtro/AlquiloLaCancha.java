package TP_8.consigna1.filtro;

import TP_8.consigna1.Cancha;
import TP_8.consigna1.Socio;

public class AlquiloLaCancha extends Filtro{
  private Cancha cancha;
  
  public AlquiloLaCancha(Cancha canchaVerificar){
    this.cancha = canchaVerificar;
  }

  @Override
  public boolean cumple(Socio socio) {
    return socio.alquiloLaCancha(cancha);
  }
  
}
