package TP_8.consigna1.filtro;

import TP_8.consigna1.Socio;

public class EdadMenorA extends Filtro{
  private int edadTope;

  public EdadMenorA(int edadTope){
    this.edadTope = edadTope;
  }

  @Override
  public boolean cumple(Socio socio) {
    return socio.getEdad() < this.edadTope;
  }
}
