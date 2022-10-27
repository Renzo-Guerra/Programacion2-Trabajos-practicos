package TP_8.consigna1.comparator;

import TP_8.consigna1.Socio;

public class CompNombre extends CompSocio{
  public CompNombre(){
    super();
  }

  public CompNombre(CompSocio siguiente){
    super(siguiente);
  }

  @Override
  public int comparar(Socio socio1, Socio socio2) {
    return socio1.getNombre().compareTo(socio2.getNombre());
  }
}
