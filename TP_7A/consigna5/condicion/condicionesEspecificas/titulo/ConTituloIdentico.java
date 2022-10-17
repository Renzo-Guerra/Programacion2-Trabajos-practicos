package TP_7A.consigna5.condicion.condicionesEspecificas.titulo;

import TP_7A.consigna5.Pelicula;
import TP_7A.consigna5.condicion.abstractas.CondicionContieneString;

public class ConTituloIdentico extends CondicionContieneString{
  public ConTituloIdentico(String palabraBuscar) {
    super(palabraBuscar);
  }

  @Override
  public boolean cumple(Pelicula pelicula) {
    return pelicula.getTitulo().equals(this.getStringComparar());
  }
    
}
