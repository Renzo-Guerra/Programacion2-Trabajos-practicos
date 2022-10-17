package TP_7A.consigna5.condicion.condicionesEspecificas.anioEstreno;

import TP_7A.consigna5.Pelicula;
import TP_7A.consigna5.condicion.abstractas.Condicion;

public class CAnioIgualA extends Condicion{
  private int anio;

  public CAnioIgualA(int anio){
    this.anio = anio;
  }
  @Override
  public boolean cumple(Pelicula pelicula) {
    return pelicula.getDuracionPelicula() == this.anio;
  }
  
}