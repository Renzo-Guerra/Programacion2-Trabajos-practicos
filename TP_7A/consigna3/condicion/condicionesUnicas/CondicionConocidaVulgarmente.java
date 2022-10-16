package TP_7A.consigna3.condicion.condicionesUnicas;

import TP_7A.consigna3.Planta;
import TP_7A.consigna3.condicion.Condicion;

public class CondicionConocidaVulgarmente extends Condicion{
  private String nombreVulgar;

  public CondicionConocidaVulgarmente(String nombreVulgar){
    this.nombreVulgar = nombreVulgar;
  }

  @Override
  public boolean cumple(Planta planta) {
    return planta.esConocidaVulgarmenteComo(nombreVulgar);
  }
}
