package TP_8.consigna1.filtro;

import TP_8.consigna1.Socio;

public class UltimaCuotaPagada extends Filtro{
  private boolean ultimaCuotaPagada;

  public UltimaCuotaPagada(boolean ultimaCuotaPagada){
    this.ultimaCuotaPagada = ultimaCuotaPagada;
  }

  @Override
  public boolean cumple(Socio socio) {
    return socio.getUltimaCuotaPagada() == this.ultimaCuotaPagada;
  }
  
}
