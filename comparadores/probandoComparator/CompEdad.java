package comparadores.probandoComparator;

import java.util.Comparator;

public class CompEdad implements Comparator<Alumno>{
  
  @Override
  public int compare(Alumno o1, Alumno o2) {
    return o1.getEdad() - o2.getEdad();
  }
  
}
