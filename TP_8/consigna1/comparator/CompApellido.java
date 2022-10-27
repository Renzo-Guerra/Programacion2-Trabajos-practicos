package TP_8.consigna1.comparator;

import TP_8.consigna1.Socio;

public class CompApellido extends CompSocio{
  public CompApellido(){
    super();
  }

  public CompApellido(CompSocio siguiente){
    super(siguiente);
  }

  @Override
  public int comparar(Socio socio1, Socio socio2) {
    return socio1.getApellido().compareTo(socio2.getApellido());
  }
}
