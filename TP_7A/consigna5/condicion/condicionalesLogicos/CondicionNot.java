package TP_7A.consigna5.condicion.condicionalesLogicos;

import TP_7A.consigna5.Pelicula;
import TP_7A.consigna5.condicion.abstractas.Condicion;

public class CondicionNot extends Condicion{
  private Condicion condicion;

  public CondicionNot(Condicion condicion){
    this.condicion = condicion;
  }
  @Override
  public boolean cumple(Pelicula pelicula) {
    return !condicion.cumple(pelicula);
  }
}
