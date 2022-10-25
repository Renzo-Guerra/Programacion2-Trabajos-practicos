package TP_8.consigna1.filtro.filtrosCombinados;

import TP_8.consigna1.Socio;
import TP_8.consigna1.filtro.Filtro;

public class FiltroOr extends Filtro{
  private Filtro f1;
  private Filtro f2;

  public FiltroOr(Filtro f1, Filtro f2){
    this.f1 = f1;
    this.f2 = f2;
  }
  @Override
  public boolean cumple(Socio socio) {
    return f1.cumple(socio) || f2.cumple(socio);
  }
}
