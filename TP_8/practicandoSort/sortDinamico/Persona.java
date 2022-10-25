package TP_8.practicandoSort.sortDinamico;

public class Persona implements Comparable<Persona>{
  private String nombre;
  private String apellido;
  private int edad;

  public Persona(String nombre, String apellido, int edad){
    setNombre(nombre);
    setApellido(apellido);
    setEdad(edad);
  }

  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setApellido(String apellido){this.apellido = apellido;}
  public void setEdad(int edad){this.edad = edad;}

  // Getters
  public String getNombre(){return nombre;}
  public String getApellido(){return apellido;}
  public int getEdad(){return edad;}

  @Override
  public int compareTo(Persona persona) {
    return this.compareTo(persona);
  }

  @Override
  public String toString() {
    return "Nombre: " + this.getNombre() + ", apellido: " + this.getApellido() + ", edad: " + this.getEdad() + "\n";
  }
}
