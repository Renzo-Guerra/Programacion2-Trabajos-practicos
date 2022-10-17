package TP_7A.consigna5.condicion.abstractas;

/**
 * NOTA:
 *  - Abstraje la condicion de que un atributo String contenga a otro String
 */

public abstract class CondicionContieneString extends Condicion{
  private String palabra;

  public CondicionContieneString(String palabra){
    this.palabra = palabra;
  }

  public String getStringComparar(){return palabra;}
}
