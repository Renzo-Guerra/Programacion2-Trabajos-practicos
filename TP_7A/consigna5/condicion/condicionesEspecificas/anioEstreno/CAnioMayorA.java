package TP_7A.consigna5.condicion.condicionesEspecificas.anioEstreno;

import TP_7A.consigna5.Pelicula;
import TP_7A.consigna5.condicion.abstractas.Condicion;

public class CAnioMayorA extends Condicion{
  private int anio;

  public CAnioMayorA(int anio){
    this.anio = anio;
  }
  @Override
  public boolean cumple(Pelicula pelicula) {
    return pelicula.getAnioEstreno() > this.anio;
  }
  
}
