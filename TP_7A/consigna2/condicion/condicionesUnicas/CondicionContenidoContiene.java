package TP_7A.consigna2.condicion.condicionesUnicas;

import TP_7A.consigna2.Documento;
import TP_7A.consigna2.condicion.Condicion;

public class CondicionContenidoContiene extends Condicion{
  private String subString;

  public CondicionContenidoContiene(String subString){
    this.subString = subString;
  }

  @Override
  public boolean cumple(Documento documento) {
    return documento.getContenidoTextual().contains(subString);
  }
}
