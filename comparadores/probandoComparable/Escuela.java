package comparadores.probandoComparable;

import java.util.ArrayList;

public class Escuela {
  private ArrayList<Alumno> alumnos;

  public Escuela(){
    alumnos = new ArrayList<>();
  }

  public void agregarAlumno(Alumno nuevoAlumno){
    if(nuevoAlumno != null && !alumnos.contains(nuevoAlumno)){
      insertarOrdenado(nuevoAlumno);
    }
  }

  /**
   * Dado un nuevo alumno (Alumno), se lo inserta ordenado en el arreglo (En base al Comparable que tenga Alumno)
   * @param nuevAlumno a agregar a alumnos (ArrayList<Alumno>)
   */
  private void insertarOrdenado(Alumno nuevAlumno){
    int i = 0;
    while((i < alumnos.size()) && (alumnos.get(i).compareTo(nuevAlumno) < 0)){
      i++;
    }
    alumnos.add(i, nuevAlumno);
  }

  public ArrayList<Alumno> getAlumnos(){
    return new ArrayList<>(alumnos);
  }
}
