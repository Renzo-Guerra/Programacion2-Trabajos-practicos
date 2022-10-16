package TP_7A.consigna3;

import java.util.ArrayList;
import TP_7A.consigna3.condicion.Condicion;

public class Vivero{
  private ArrayList<Planta> plantas;

  public Vivero(){
    plantas = new ArrayList<>();
  }

  public void agregarPlanta(Planta nuevaPlanta){
    if((nuevaPlanta != null) && (!plantas.contains(nuevaPlanta))){
      plantas.add(nuevaPlanta);
    }
  }

  /**
   * Dada una condicion, devuelve todas las plantas que cumplan la/s condicion/es.
   * @param condicion a cumplir.
   * @return (ArrayList<Planta>).
   */
  public ArrayList<Planta> getPlantasWhere(Condicion condicion){
    ArrayList<Planta> resultados = new ArrayList<>();
    for (Planta planta : plantas) {
      if(condicion.cumple(planta))
        resultados.add(planta);
    }

    return resultados;
  }

  /**
   * Devuelve todas las plantas.
   * @return (ArrayList<Planta>).
   */
  public ArrayList<Planta> getTodasLasPlantas(){
    ArrayList<Planta> resultados = new ArrayList<>();
    for (Planta planta : plantas) {
      resultados.add(planta);
    }

    return resultados;
  }
}