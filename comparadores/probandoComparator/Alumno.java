package comparadores.probandoComparator;

public class Alumno {
  private String nombre, apellido;
  private int dni, edad;

  public Alumno(String nombre, String apellido, int dni, int edad){
    setNombre(nombre);
    setApellido(apellido);
    setDni(dni);
    setEdad(edad);
  }

  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setApellido(String apellido){this.apellido = apellido;}
  public void setDni(int dni){this.dni = dni;}
  public void setEdad(int edad){this.edad = edad;}

  // Getters
  public String getNombre(){return nombre;}
  public String getApellido(){return apellido;}
  public int getDni(){return dni;}
  public int getEdad(){return edad;}

  @Override
  public String toString() {
    return "Nombre: " + getNombre() + ", apellido: " + getApellido() + ", dni: " + getDni() + ", edad: " + getEdad() + "\n";
  }

  @Override
  public boolean equals(Object obj) {
    try {
      Alumno alumno = (Alumno)obj;
      return this.getDni() == alumno.getDni();
    } catch (Exception e) {
      return false;
    }
  }
}
