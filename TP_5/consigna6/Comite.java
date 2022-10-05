package consigna6;

import java.util.ArrayList;

public class Comite {
  private ArrayList<Evaluador> evaluadores;

  public Comite(){
    evaluadores = new ArrayList<>();
  }

  public void agregarEvaluador(Evaluador nuevo_evaluador){
    if((nuevo_evaluador != null) && ((!evaluadores.contains(nuevo_evaluador)))){
      this.evaluadores.add(nuevo_evaluador);
    }
  }

  public ArrayList<Evaluador> posiblesEvaluadores(Trabajo trabajo){
    ArrayList<Evaluador> evaluadores_aptos = new ArrayList<>();
    if(trabajo != null){
      for (Evaluador evaluador : evaluadores) {
        if(trabajo.elEvaluadorEsApto(evaluador)){
          evaluadores_aptos.add(evaluador);
        }
      }
    }

    return evaluadores_aptos;
  }

  public ArrayList<Evaluador> getEvaluadores(){
    return new ArrayList<>(evaluadores);
  }
}
