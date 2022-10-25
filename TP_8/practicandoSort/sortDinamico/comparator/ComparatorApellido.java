package TP_8.practicandoSort.sortDinamico.comparator;

import java.util.Comparator;

import TP_8.practicandoSort.sortDinamico.Persona;

public class ComparatorApellido implements Comparator<Persona>{
  @Override
  public int compare(Persona persona1, Persona persona2){
    return persona1.getApellido().compareTo(persona2.getApellido());
  }
}
