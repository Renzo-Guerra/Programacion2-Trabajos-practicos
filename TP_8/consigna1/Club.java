package TP_8.consigna1;

import java.util.ArrayList;

import TP_8.consigna1.filtro.Filtro;

public class Club {
  private ArrayList<Socio> socios;

  public Club(){
    socios = new ArrayList<>();
  }

  public void agregarSocio(Socio nuevoSocio){
    if((nuevoSocio != null) && (!socios.contains(nuevoSocio)))
      socios.add(nuevoSocio);
  }

  public ArrayList<Socio> getSociosWhere(Filtro filtro){
    ArrayList<Socio> resultado = new ArrayList<>();
    for (Socio socio : socios) {
      if(filtro.cumple(socio))
        resultado.add(socio);
    }

    return resultado;
  }
}
