package TP_7A.consigna2.condicion.condicionesUnicas;

import TP_7A.consigna2.Documento;
import TP_7A.consigna2.condicion.Condicion;

public class CondicionPalabraClave extends Condicion{
  private String palabraClave;

  public CondicionPalabraClave(String palabraClave){
    this.palabraClave = palabraClave;
  }

  @Override
  public boolean cumple(Documento documento) {
    return documento.contienePalabraClave(palabraClave);
  }
  
}
