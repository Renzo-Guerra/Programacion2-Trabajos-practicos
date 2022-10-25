package TP_8.consigna1.filtro;

import TP_8.consigna1.Socio;

public class MontoPagadoMayorA extends Filtro{
  private double montoPagado;

  public MontoPagadoMayorA(double montoPagado){
    this.montoPagado = montoPagado;
  }

  @Override
  public boolean cumple(Socio socio) {
    return socio.contieneAlquileresPorUnMontoMayorA(montoPagado);
  }
  
}