package TP_7B.consigna1.abstractas;

import java.util.ArrayList;

public abstract class ElementoAlmacena extends ElementoSA{
  // Protected asi "Comprimido" puede calcular el peso.
  protected ArrayList<ElementoSA> elementos;

  public ElementoAlmacena(String nombre) {
    super(nombre);
    elementos = new ArrayList<>();
  }

  public void agregarElemento(ElementoSA nuevoElemento){
    if(nuevoElemento != null)
      elementos.add(nuevoElemento);
  }

  @Override
  public int getCantidadElementos() {
    int acumulador = 1;
    for (ElementoSA elementoActual : elementos)
      acumulador += elementoActual.getCantidadElementos();
  
    return acumulador;
  }
}
