package TP_7A.consigna5.condicion.condicionesEspecificas.duracion;

import TP_7A.consigna5.Pelicula;
import TP_7A.consigna5.condicion.abstractas.Condicion;

public class CDuracionIgualA extends Condicion{
  private int tiempoDuracion;

  public CDuracionIgualA(int tiempoDuracion){
    this.tiempoDuracion = tiempoDuracion;
  }
  @Override
  public boolean cumple(Pelicula pelicula) {
    return pelicula.getDuracionPelicula() == tiempoDuracion;
  }
  
}