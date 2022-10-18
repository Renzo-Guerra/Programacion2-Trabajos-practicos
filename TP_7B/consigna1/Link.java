package TP_7B.consigna1;

import TP_7B.consigna1.abstractas.ElementoSA;

public class Link extends ElementoSA{
  private static int pesoDefault = 1;

  public Link(ElementoSA archivoReferenciado){
    // Por defecto el nombre es el nombre del archivo original + " - acceso directo".
    super(archivoReferenciado.getNombre() + " - acesso directo");
  }

  @Override
  public int getCantidadElementos() {
    /**
     * Se cuenta a si mismo nomas, no lo tomé como que cuenta a sus hijos 
     * (En caso de ser una carpeta) ya que no tiene elementos en si, 
     * sino que es una referencia nomas.
     */
    return 1;
  }

  @Override
  public int getPeso() {
    return Link.pesoDefault;
  }
  
}
