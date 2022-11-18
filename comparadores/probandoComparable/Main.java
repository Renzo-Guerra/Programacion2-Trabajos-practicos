package comparadores.probandoComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Alumno> alumnos = new ArrayList<>();

    Alumno al1 = new Alumno("Julian", "Torres", 22333444, 30);
    Alumno al2 = new Alumno("Agustina", "Palacios", 20111222, 23);
    Alumno al3 = new Alumno("Micaela", "Rodriguez", 44555444, 33);
    Alumno al4 = new Alumno("Francisco", "Gonzalez", 12555666, 43);
    Alumno al5 = new Alumno("Valentino", "Otrozqui", 16777666, 43);
    Alumno al6 = new Alumno("Celeste", "Gonzalez", 20222333, 32);

    alumnos.add(al1);
    alumnos.add(al2);
    alumnos.add(al3);
    alumnos.add(al4);
    alumnos.add(al5);
    alumnos.add(al6);

    Collections.sort(alumnos);

    System.out.println(alumnos);
  }
}
