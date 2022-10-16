package TP_7A.consigna3.condicion.condicionesUnicas;

import TP_7A.consigna3.Planta;
import TP_7A.consigna3.condicion.Condicion;

public class CondicionTipo extends Condicion{
  private String tipoBuscar;

  /**
   * Busca el tipo (interior / exterior)
   * @param tipoBuscar
   */
  public CondicionTipo(String tipoBuscar){
    this.tipoBuscar = tipoBuscar;
  }

  @Override
  public boolean cumple(Planta planta) {
    return planta.getTipo().equalsIgnoreCase(this.tipoBuscar);
  }
  
}
