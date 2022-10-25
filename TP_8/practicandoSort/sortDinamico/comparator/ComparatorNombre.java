package TP_8.practicandoSort.sortDinamico.comparator;

import java.util.Comparator;

import TP_8.practicandoSort.sortDinamico.Persona;

public class ComparatorNombre implements Comparator<Persona> {
  @Override
  public int compare(Persona persona1, Persona persona2) {
    return persona1.getNombre().compareTo(persona2.getNombre());
  }
  
}
