package TP_7A.consigna2.condicion.condicionesUnicas;

import TP_7A.consigna2.Documento;
import TP_7A.consigna2.condicion.Condicion;

public class CondicionTituloExacto extends Condicion{
  private String titulo;

  public CondicionTituloExacto(String titulo){
    this.titulo = titulo;
  }

  @Override
  public boolean cumple(Documento documento) {
    return documento.getTitulo().equals(this.titulo);
  }
  
}
