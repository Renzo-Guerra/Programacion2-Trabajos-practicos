package TP_4.consigna3.Empleado;

public abstract class Empleado {
  protected String nombre;
  protected String apellido;
  protected long dni;

  public Empleado(String nombre, String apellido, long dni){
    setNombre(nombre);
    setApellido(apellido);
    setDni(dni);
  }

  public void setNombre(String nombre){this.nombre = nombre;}
  public void setApellido(String apellido){this.apellido = apellido;}
  public void setDni(long dni){this.dni = dni;}

  public String getNombre(){return nombre;}
  public String getApellido(){return apellido;}
  public long getDni(){return dni;}
  
  /**
   * @return Se obtiene el monto fijo que obtiene semanalmente el empleado por su categoria
   */
  public abstract double getMontoFijoSemanal();
  
  /**
   * @return Calcula el monto que el empleado cobrará por su trabajo de la semana
   */
  public abstract double calcularCobroEmpleado();

  @Override
  public abstract String toString();

  /**
   * Se compara la igualdad de los empleados con el DNI de estos.
   */
  @Override
  public boolean equals(Object obj) {
    Empleado empleado = (Empleado)obj;

    return (empleado.getDni() == this.getDni());
  }
}