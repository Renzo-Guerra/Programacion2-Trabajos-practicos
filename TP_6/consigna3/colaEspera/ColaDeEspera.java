package TP_6.consigna3.colaEspera;

import java.util.ArrayList;

public class ColaDeEspera {
  private ArrayList<ElementoCola> elementos;

  public ColaDeEspera(){
    elementos = new ArrayList<>();
  }

  public ElementoCola pop(){
    // Si la cola esta vacia, devuelve null
    if(laColaEstaVacia()) return null;
    // Caso contrario devuelve el primer elemento.
    return elementos.remove(0);
  }


  public boolean laColaEstaVacia(){
    return (elementos.isEmpty());
  }
  /**
   * Agrega un nuevo elemento a la cola (de manera ordenada).
   * @param nuevoElemento a agregar a la cola.
   */
  public void agregarElemento(ElementoCola nuevoElemento){
    // Se verifica que no sea null
    if((nuevoElemento == null) || elementos.contains(nuevoElemento)) return;

    int posActual = 0;
    boolean ingresado = false;

    /*
      Se itera entre los elementos de "elementos" y se compara que el nuevo elemento 
      sea mas importante que el elemento actual (para que la cola quede ordenada)
    */ 
    while(!ingresado && posActual < elementos.size()){
      if(nuevoElemento.esMasImportante(elementos.get(posActual))){
        elementos.add(posActual, nuevoElemento);
        ingresado = true;
      }
      posActual++;
    }
    // Quiere decir que el elemento debe ir al final de la cola
    if(!ingresado){
      elementos.add(nuevoElemento);
    }
  }
  
  public ArrayList<ElementoCola> getElementos(){return new ArrayList<>(elementos);}

  @Override
  public String toString() {
    return "" + this.getElementos();
  }
}