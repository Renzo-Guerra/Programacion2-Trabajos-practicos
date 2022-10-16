package TP_7A.consigna3.condicion.condicionesUnicas;

import TP_7A.consigna3.Planta;
import TP_7A.consigna3.condicion.Condicion;

public class CondicionClasificacion extends Condicion{
  private String nombreClasificacion;

  public CondicionClasificacion(String nombreClasificacion){
    this.nombreClasificacion = nombreClasificacion;
  }

  @Override
  public boolean cumple(Planta planta) {  
    return planta.getClase().equalsIgnoreCase(nombreClasificacion);
  }
  
}
