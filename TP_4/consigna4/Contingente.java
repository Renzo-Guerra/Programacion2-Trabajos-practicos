package TP_4.consigna4;

import java.util.ArrayList;

public class Contingente {
  String pais;
  ArrayList<Integrante> integrantes;

  public Contingente(String nombre_del_pais){
    integrantes = new ArrayList<>();
    pais = nombre_del_pais;
  }

  public void agregarIntegrante(Integrante nuevo_integrante){
    if(nuevo_integrante != null){
      integrantes.add(nuevo_integrante);
    }
  }

  public void verIntegrantes(){
    if(integrantes.size() > 0){
      System.out.println("Integrantes: ");
      for (Integrante integrante : integrantes) {
        System.out.println(integrante);
      }
    }else{
      System.out.println("No hay integrantes registrados");
    }
  }

  public void veriSiIntegranteEstaDisponible(Integrante integrante){
    System.out.println(integrante.getNombre() + " " + integrante.getApellido() + ": " + ((integrante.getEstado() != "en pais de origen")? "su estado actual es '" + integrante.getEstado() + "'.": "se encuentra disponible."));
  }
}
