package TP_3.consigna1;

public class Empleado {
  private long dni;
  private String nombre;
  
  public Empleado(long dni, String nombre){
    setDni(dni);
    this.nombre = nombre;
  }

  // Setter
  private void setDni(long dni){this.dni = Math.abs(dni);}

  // Getter
  public long getDni() {return dni;}
  public String getNombre(){return nombre;}

  @Override
  public boolean equals(Object empleado_comparar) {
    Empleado emp = (Empleado) empleado_comparar; 

    return (emp.getDni() == this.getDni());
  }

  @Override
  public String toString(){
    return "DNI: " + getDni() + ", nombre: " + getNombre();
  }
}
