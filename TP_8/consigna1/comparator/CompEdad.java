package TP_8.consigna1.comparator;

import TP_8.consigna1.Socio;

public class CompEdad extends CompSocio{
  public CompEdad(){
    super();
  }

  public CompEdad(CompSocio siguiente){
    super(siguiente);
  }

  @Override
  public int comparar(Socio socio1, Socio socio2) {
    return socio1.getEdad() - socio2.getEdad();
  }
  
}
