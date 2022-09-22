package TP_4.consigna6;

public class Empleado extends Asociado{
  private long numero_legajo;
  private double sueldo;

  public Empleado(String nombre, String apellido, int edad, long numero_legajo, double sueldo) {
    super("Empleado", nombre, apellido, edad);
    setNumeroLegajo(numero_legajo);
    setSueldo(sueldo);
  }
  
  // Setters
  public void setNumeroLegajo(long numero_legajo){this.numero_legajo = numero_legajo;}
  public void setSueldo(double sueldo){this.sueldo = sueldo;}
  // Getters
  public long getNumeroLegajo(){return numero_legajo;}
  public double getSueldo(){return sueldo;}
}
