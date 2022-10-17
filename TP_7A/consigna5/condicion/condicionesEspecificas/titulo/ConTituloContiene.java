package TP_7A.consigna5.condicion.condicionesEspecificas.titulo;

import TP_7A.consigna5.condicion.abstractas.CondicionCoincideString;
import TP_7A.consigna5.Pelicula;

public class ConTituloContiene extends CondicionCoincideString{
  public ConTituloContiene(String contenidoBuscar) {
    super(contenidoBuscar);
  }

  @Override
  public boolean cumple(Pelicula pelicula){
    return pelicula.getTitulo().contains(this.getStringComparar());
  } 
}
