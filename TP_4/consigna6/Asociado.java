package TP_4.consigna6;

public abstract class Asociado {
  private String cargo;
  private String nombre;
  private String apellido;
  private int edad;

  public Asociado(String cargo, String nombre, String apellido, int edad){
    setCargo(cargo);
    setNombre(nombre);
    setApellido(apellido);
    setEdad(edad);
  }
  // Setters
  public void setCargo(String cargo){this.cargo = cargo;}
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setApellido(String apellido){this.apellido = apellido;}
  public void setEdad(int edad){this.edad = edad;}
  // Getters
  public String getCargo(){return cargo;}
  public String getNombre(){return nombre;}
  public String getApellido(){return apellido;}
  public int getEdad(){return edad;}

  @Override
  public String toString() {
    return "cargo: " + getCargo() + ", nombre: " + getNombre() + ", apellido " + getApellido() + ", edad " + getEdad();
  }

  /**
   * Tanto el nombre, apellido, edad, y cargo deben coincidir
   */
  @Override
  public boolean equals(Object obj) {
    Asociado asociado = (Asociado)obj;
    
    return ((asociado.getNombre() == this.getNombre()) && (asociado.getApellido() == this.getApellido()) && (asociado.getEdad() == this.getEdad()) && (asociado.getCargo() == this.getCargo()));
  }
}
