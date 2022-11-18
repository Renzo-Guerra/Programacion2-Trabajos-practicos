package comparadores.probandoComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Escuela escuela = new Escuela();

    Alumno al1 = new Alumno("Julian", "Torres", 22333444, 30);
    Alumno al2 = new Alumno("Agustina", "Palacios", 20111222, 23);
    Alumno al3 = new Alumno("Micaela", "Rodriguez", 44555444, 33);
    Alumno al4 = new Alumno("Francisco", "Gonzalez", 12555666, 43);
    Alumno al5 = new Alumno("Valentino", "Otrozqui", 16777666, 43);
    Alumno al6 = new Alumno("Celeste", "Gonzalez", 20222333, 32);

    escuela.agregarAlumno(al1);
    escuela.agregarAlumno(al2);
    escuela.agregarAlumno(al3);
    escuela.agregarAlumno(al4);
    escuela.agregarAlumno(al5);
    escuela.agregarAlumno(al6);

    System.out.println(escuela.getAlumnos());
  }
}
