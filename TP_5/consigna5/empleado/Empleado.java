package consigna5.empleado;

public class Empleado {
  private String nombre;
  private String apellido;
  private long dni;
  private double sueldo_base; //sueldo mensual

  public Empleado(String nombre, String apellido, long dni, double sueldo_base){
    setNombre(nombre);
    setApellido(apellido);
    setDni(dni);
    setSueldoBase(sueldo_base);
  }

  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setApellido(String apellido){this.apellido = apellido;}
  public void setDni(long dni){this.dni = dni;}
  public void setSueldoBase(double sueldo_base){this.sueldo_base = sueldo_base;}

  // Getters
  public String getNombre(){return nombre;}
  public String getApellido(){return apellido;}
  public long getDni(){return dni;}
  public double getSueldoBase(){return sueldo_base;}

  @Override
  public boolean equals(Object obj) {
    Empleado empleado = (Empleado) obj;

    return empleado.getDni() == this.getDni();
  }

  public double getMontoCobrar(){
    return getSueldoBase();
  }
}
