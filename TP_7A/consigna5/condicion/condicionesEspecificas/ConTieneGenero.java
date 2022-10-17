package TP_7A.consigna5.condicion.condicionesEspecificas;

import TP_7A.consigna5.Pelicula;
import TP_7A.consigna5.condicion.abstractas.CondicionCoincideString;

public class ConTieneGenero extends CondicionCoincideString{
  public ConTieneGenero(String generoBuscar) {
    super(generoBuscar);
  }

  @Override
  public boolean cumple(Pelicula pelicula) {
    return pelicula.contieneGenero(this.getStringComparar());
  }
    
}
