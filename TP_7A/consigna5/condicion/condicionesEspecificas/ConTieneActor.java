package TP_7A.consigna5.condicion.condicionesEspecificas;

import TP_7A.consigna5.Pelicula;
import TP_7A.consigna5.condicion.abstractas.CondicionCoincideString;

public class ConTieneActor extends CondicionCoincideString{
  public ConTieneActor(String actorBuscar) {
    super(actorBuscar);
  }

  @Override
  public boolean cumple(Pelicula pelicula) {
    return pelicula.contieneActor(this.getStringComparar());
  }
    
}
