package consigna3;

import java.util.ArrayList;

public class Cooperativa {
  private ArrayList<Lote> lotes;
  private ArrayList<Cereal> cereales;

  public Cooperativa(){
    lotes = new ArrayList<>();
    cereales = new ArrayList<>();
  }

  public void agregarLote(Lote nuevo_lote){
    if((nuevo_lote != null) && (!lotes.contains(nuevo_lote))){
      lotes.add(nuevo_lote);
    }
  }

  public void agregarCereal(Cereal nuevo_cereal){
    if((nuevo_cereal != null) && (!cereales.contains(nuevo_cereal))){
      cereales.add(nuevo_cereal);
    }
  }

  /**
   * Qué cereales pueden sembrarse en un determinado lote.
   * @param lote a evaluar posibles cereales
   */
  public void cerealesSembrablesEnLote(Lote lote){
    boolean resultados = false;

    System.out.println("Cereales que se pueden plantar en el lote " + lote.getNombre() + ": ");
    for (Cereal cereal : cereales) {
      if(cereal.puedeSerPlantadoEnDeterminadoLote(lote)){
        System.out.println(cereal);
        resultados = true;
      }
    }
    if(!resultados){
      System.out.println("Ningun cereal de la cooperativa posee los requerimientos necesarios para poder ser plantados en el lote " + lote.getNombre() + " ...");
    }
  }

  /**
   * En qué lotes se puede sembrar un determinado cereal.
   * @param cereal
   */
  public void cualesLotesSonAptos(Cereal cereal){
    boolean resultados = false;
    
    System.out.println("Lotes donde se puede sembrar " + cereal.getNombre() + ": ");
    for (Lote lote : lotes) {
      if(cereal.puedeSerPlantadoEnDeterminadoLote(lote)){
        System.out.println(lote);
        resultados = true;
      }
    }

    if(!resultados){
      System.out.println("El cereal " + cereal.getNombre() + " no es apto en ningun lote de la cooperativa...");
    }
  }

  public void imprimirLotes(){
    System.out.println("Lotes de la cooperativa: ");
    for (Lote lote : lotes) {
      System.out.println(lote);
    }
    System.out.println("");
  }

  public void imprimirCereales(){
    System.out.println("Cereales de la cooperativa: ");
    for (Cereal cereal : cereales) {
      System.out.println(cereal);
    }
    System.out.println("");
  }
}
