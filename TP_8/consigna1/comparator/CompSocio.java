package TP_8.consigna1.comparator;

import java.util.Comparator;
import TP_8.consigna1.Socio;

public abstract class CompSocio implements Comparator<Socio>{
  private CompSocio siguiente;

  // En caso de que creen un comparador "simple"
  public CompSocio(){
    this.siguiente = null;
  }

  // En caso de que quieran "enganchar" otro comparador en caso de que el primero devuelva 0.
  public CompSocio(CompSocio siguiente){
    this.siguiente = siguiente;
  }

  public abstract int comparar(Socio socio1, Socio socio2);

  @Override
  public int compare(Socio socio1, Socio socio2) {
    int resultado = comparar(socio1, socio2);
    if((resultado == 0) && (siguiente != null))
      return siguiente.comparar(socio1, socio2);
    return resultado;
  }
  
}
