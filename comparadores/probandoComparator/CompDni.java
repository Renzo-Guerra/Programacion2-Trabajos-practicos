package comparadores.probandoComparator;

import java.util.Comparator;

public class CompDni implements Comparator<Alumno>{
  @Override
  public int compare(Alumno o1, Alumno o2) {
    return o1.getDni() - o2.getDni();
  }
}
