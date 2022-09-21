package TP_4.consigna4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Integrante {
  private String nombre;
  private String apellido;
  private long numero_pasaporte;
  private LocalDate fecha_nacimiento;
  private String estado; // viajando / en concentracion / en pais de origen

  public Integrante(String nombre, String apellido, long numero_pasaporte, LocalDate fecha_nacimiento, String estado){
    setNombre(nombre);
    setApellido(apellido);
    setNumeroPasaporte(numero_pasaporte);
    setFechaNacimiento(fecha_nacimiento);
    setEstado(estado);
  }

  public void setNombre(String nombre) {this.nombre = nombre;}
  public void setApellido(String apellido) {this.apellido = apellido;  }
  public void setNumeroPasaporte(long numero_pasaporte) {this.numero_pasaporte = numero_pasaporte;}
  public void setFechaNacimiento(LocalDate fecha_nacimiento) {this.fecha_nacimiento = fecha_nacimiento;}
  public void setEstado(String estado) {this.estado = estado;}

  public String getNombre() {return nombre;}
  public String getApellido() {return apellido;}
  public long getNumeroPasaporte() {return numero_pasaporte;}
  public LocalDate getFechaNacimiento() {return fecha_nacimiento;}
  public int getEdad(){return (int)ChronoUnit.YEARS.between(getFechaNacimiento(), LocalDate.now());}
  public String getEstado() {return estado;}

  @Override
  public String toString(){
    return this.getClass().getSimpleName() + ": {nombre: " + this.getNombre() + ", apellido: " + this.getApellido() + ", numero pasaporte: " + this.getNumeroPasaporte() + ", fecha nacimiento: " + this.getFechaNacimiento() + ", edad: " + this.getEdad() + ", estado: " + this.getEstado() + ", ";
  }
}
