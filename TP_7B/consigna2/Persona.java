package TP_7B.consigna2;

public class Persona {
  private String nombre;
  private String apellido;
  private String direccion;
  private String ciudad;

  public Persona(String nombre, String apellido, String ciudad, String direccion){
    setNombre(nombre);
    setApellido(apellido);
    setCiudad(ciudad);
    setDireccion(direccion);
  }

  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setApellido(String apellido){this.apellido = apellido;}
  public void setCiudad(String ciudad){this.ciudad = ciudad;}
  public void setDireccion(String direccion){this.direccion = direccion;}

  // Getters
  public String getNombre(){return nombre;}
  public String getApellido(){return apellido;}
  public String getCiudad(){return ciudad;}
  public String getDireccion(){return direccion;}

  @Override
  public String toString() {
    return "nombre: " + this.nombre + ", ciudad: " + this.ciudad + ", direccion: " + this.direccion;
  }
}
