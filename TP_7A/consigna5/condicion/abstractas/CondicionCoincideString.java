package TP_7A.consigna5.condicion.abstractas;

/**
 * NOTA:
 *  - Abstraje la condicion de que un atributo String sea igual a otro String
 */

public abstract class CondicionCoincideString extends Condicion{
  private String palabra;

  public CondicionCoincideString(String palabra){
    this.palabra = palabra;
  }

  public String getStringComparar(){return palabra;}
}
