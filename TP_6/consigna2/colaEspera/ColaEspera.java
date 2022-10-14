package TP_6.consigna2.colaEspera;
import java.util.ArrayList;

public class ColaEspera {
  private ArrayList<ElementoCola> elementos = new ArrayList<>();

  public ColaEspera(){
    elementos = new ArrayList<>();
  }

  public ElementoCola pop(){
    if(!colaVacia()){
      return elementos.remove(0);
    }

    return null;
  }

  public boolean colaVacia(){
    return (elementos.isEmpty());
  }

  public void agregarElemento(ElementoCola nuevo_elemento){
    boolean insertado = false;
    int i = 0;
    while(!insertado && (i < elementos.size())){
      if(nuevo_elemento.esMayor(elementos.get(i))){
        elementos.add(i, nuevo_elemento);
        insertado = true;
      }
      i++;
    }

    if(!insertado)
      elementos.add(nuevo_elemento);
  }
}
