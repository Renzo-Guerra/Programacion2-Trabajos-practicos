package comparadores.probandoComparator;

import java.util.Comparator;

public class CompNombre implements Comparator<Alumno>{

  @Override
  public int compare(Alumno o1, Alumno o2) {
    return o1.getNombre().compareTo(o2.getNombre());
  }
  
}
