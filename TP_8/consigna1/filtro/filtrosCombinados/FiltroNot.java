package TP_8.consigna1.filtro.filtrosCombinados;

import TP_8.consigna1.Socio;
import TP_8.consigna1.filtro.Filtro;

public class FiltroNot extends Filtro{
  private Filtro filtro;

  public FiltroNot(Filtro filtro){
    this.filtro = filtro;
  }
  
  @Override
  public boolean cumple(Socio socio) {
    return !filtro.cumple(socio);
  }
}
