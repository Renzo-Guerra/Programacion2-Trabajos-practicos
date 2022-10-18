package TP_7B.consigna1;

import java.util.ArrayList;

import TP_7B.consigna1.abstractas.ElementoAlmacena;
import TP_7B.consigna1.abstractas.ElementoSA;

public class Directorio extends ElementoAlmacena{
  public Directorio(String nombre) {
    super(nombre);
    elementos = new ArrayList<>();
  }

  @Override
  public int getPeso() {
    int acumulador = 0;
    for (ElementoSA elementoActual : elementos){
      acumulador += elementoActual.getPeso();
    }
    
    return acumulador;
  }
  
}
