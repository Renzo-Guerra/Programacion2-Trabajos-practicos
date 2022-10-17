package TP_7A.consigna5.condicion.condicionesEspecificas.duracion;

import TP_7A.consigna5.Pelicula;
import TP_7A.consigna5.condicion.abstractas.Condicion;

public class CDuracionMayorA extends Condicion{
  private int tiempoDuracion;

  public CDuracionMayorA(int tiempoDuracion){
    this.tiempoDuracion = tiempoDuracion;
  }
  @Override
  public boolean cumple(Pelicula pelicula) {
    return pelicula.getDuracionPelicula() > tiempoDuracion;
  }
  
}
