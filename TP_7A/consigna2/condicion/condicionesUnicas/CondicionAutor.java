package TP_7A.consigna2.condicion.condicionesUnicas;

import TP_7A.consigna2.Documento;
import TP_7A.consigna2.condicion.Condicion;

public class CondicionAutor extends Condicion{
  private String autor;

  public CondicionAutor(String autor){
    this.autor = autor;
  }

  @Override
  public boolean cumple(Documento documento) {
    return documento.contieneAutor(autor);
  }
  
}
