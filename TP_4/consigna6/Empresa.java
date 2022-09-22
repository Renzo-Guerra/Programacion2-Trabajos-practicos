package TP_4.consigna6;

import java.util.ArrayList;

public class Empresa {
  private ArrayList<Asociado> asociados;

  public Empresa(){
    asociados = new ArrayList<>();
  }

  public void agregarAsociado(Asociado nuevo_asociado){
    if((nuevo_asociado != null) && (!asociados.contains(nuevo_asociado))){
      asociados.add(nuevo_asociado);
    }
  }

  /**
   * Crea una String con TODOS los asociados (separados por "\n" (generará un salto de linea))
   * @return todos los asociados en una unica cadena
   */
  public String obtenerAsociadosEnCadena(){
    String resultado = "";
    for (Asociado asociado : asociados) {
      resultado += asociado + "\n";
    }

    return ((resultado == "")? null : resultado);
  }
}
