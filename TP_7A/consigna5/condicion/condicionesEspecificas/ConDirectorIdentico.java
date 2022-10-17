package TP_7A.consigna5.condicion.condicionesEspecificas;

import TP_7A.consigna5.Pelicula;
import TP_7A.consigna5.condicion.abstractas.CondicionContieneString;

public class ConDirectorIdentico extends CondicionContieneString{
  public ConDirectorIdentico(String directorBuscar) {
    super(directorBuscar);
  }

  @Override
  public boolean cumple(Pelicula pelicula) {
    return pelicula.getDirector().equals(this.getStringComparar());
  }
    
}
