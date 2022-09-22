package consigna2;

import java.util.ArrayList;

public class Alumno {
  private String nombre;
  private String apellido;
  private ArrayList<String> cualidades;
  protected ArrayList<Alumno> familiares_concurrentes;
  private String casa_perteneciente;

  public Alumno(String nombre, String apellido){
    cualidades = new ArrayList<>();
    familiares_concurrentes = new ArrayList<>();
    setNombre(nombre);
    setApellido(apellido);
    setCasaPerteneciente("");
  }
  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setApellido(String apellido){this.apellido = apellido;}
  public void setCasaPerteneciente(String casa_perteneciente){this.casa_perteneciente = casa_perteneciente;}

  // Getters
  public String getNombre(){return nombre;}
  public String getApellido(){return apellido;}
  public String getCasaPerteneciente(){return casa_perteneciente;}

  /**
   * En caso de que no exista la cualidad en la lista de cualidades y que no sea null, 
   * agrega una cualidad.
   * @param nueva_cualidad a agregar a la lista de cualidades.
   */
  public void agregarCualidad(String nueva_cualidad){
    if((cualidades != null) && (!poseeCualidad(nueva_cualidad))){
      cualidades.add(nueva_cualidad);
    }
  }

  /**
   * Dada una cualidad, verifica si posee esta cualidad en la lista de cualidades
   * @param cualidad_a_comprobar si ya esta registrada en la lista de cualidades
   * @return true (contiene la cualidad) / false (NO contiene la cualidad)
   */
  public boolean poseeCualidad(String cualidad_a_comprobar){
    return (cualidades.contains(cualidad_a_comprobar));
  }

  /**
   * Dada una cualidad (en caso de que exista en la lista de cualidades) la elimina
   * @param cualidad_a_eliminar de la lista de cualidades
   */
  public void eliminarCualidad(String cualidad_a_eliminar){
    cualidades.remove(cualidad_a_eliminar);
  }

  /**
   * imprime las cualidades del alumno
   */
  public void imprimirCualidades(){
    System.out.print("Cualidades del alumno " + this.getNombre() + ": ");
    for (String cualidad : cualidades) {
      System.out.print(cualidad + " . ");
    }
    System.out.println("");
  }

  /**
   * Agrega un familiar a los familiares del alumno
   * @param familiar_alumno a agregar
   */
  public void agregarFamiliar(Alumno familiar_alumno){
    if((familiar_alumno != null) && (!familiares_concurrentes.contains(familiar_alumno))){
      familiares_concurrentes.add(familiar_alumno);
    }
  }

  /**
   * 2 alumnos son "iguales" cuando tienen el mismo nombre y apellido
   */
  @Override
  public boolean equals(Object obj) {
    Alumno alumno = (Alumno)obj;
    return ((alumno.getNombre() == this.getNombre()) && (alumno.getApellido() == this.getApellido()));
  }

  @Override
  public String toString() {
    return ("Nombre: " + this.getNombre() + ", apellido: " + this.getApellido() + ", casa perteneciente: " + getCasaPerteneciente());
  }
}
