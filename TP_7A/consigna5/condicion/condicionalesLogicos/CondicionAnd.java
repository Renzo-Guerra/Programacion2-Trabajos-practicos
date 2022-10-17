package TP_7A.consigna5.condicion.condicionalesLogicos;

import TP_7A.consigna5.Pelicula;
import TP_7A.consigna5.condicion.abstractas.Condicion;

public class CondicionAnd extends Condicion{
  private Condicion c1;
  private Condicion c2;

  public CondicionAnd(Condicion c1, Condicion c2){
    this.c1 = c1;
    this.c2 = c2;
  }
  @Override
  public boolean cumple(Pelicula pelicula) {
    return c1.cumple(pelicula) && c2.cumple(pelicula);
  }
}
