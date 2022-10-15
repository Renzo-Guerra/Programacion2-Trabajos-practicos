package TP_7A.consigna2.condicion.condicionesUnicas;

import TP_7A.consigna2.Documento;
import TP_7A.consigna2.condicion.Condicion;

public class CondicionTituloContiene extends Condicion{
  private String subString;

  public CondicionTituloContiene(String subString){
    this.subString = subString;
  }

  @Override
  public boolean cumple(Documento documento) {
    return documento.getTitulo().contains(subString);
  }
}
