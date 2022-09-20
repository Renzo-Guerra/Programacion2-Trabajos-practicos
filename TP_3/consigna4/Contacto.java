package TP_3.consigna4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Contacto {
  private String nombre;
  private String apellido;
  private LocalDate fecha_nacimiento;
  private String num_telefono;
  private String direccion;
  private String mail;

  /**
   * Instancia un objeto de tipo Contacto
   * @param nombre (String) del contacto 
   * @param apellido (String) del contacto 
   * @param fecha_nacimiento (LocalDate) del contacto 
   * @param num_telefono (String) del contacto, (NO INGRESAR EL PRIMER 0 DE LA CARACTERISTICA), separar la caracteristica del numero con un espacio, ej: "2262 223344" 
   * @param direccion (String) fisica del contacto
   * @param mail (String) del contacto
   */
  public Contacto(String nombre, String apellido, LocalDate fecha_nacimiento, String num_telefono, String direccion, String mail){
    setNombre(nombre);
    setApellido(apellido);
    setFechaNacimiento(fecha_nacimiento);
    setNumTelefono(num_telefono);
    setDireccion(direccion);
    setMail(mail);
  }

  public void setNombre(String nombre) {this.nombre = nombre;}
  public void setApellido(String apellido) {this.apellido = apellido;}
  public void setFechaNacimiento(LocalDate fecha_nacimiento) {this.fecha_nacimiento = fecha_nacimiento;}
  public void setNumTelefono(String num_telefono) {this.num_telefono = num_telefono;}
  public void setDireccion(String direccion) {this.direccion = direccion;}
  public void setMail(String mail) {this.mail = mail;}

  public String getNombre() {return nombre;}
  public String getApellido() {return apellido;}
  private LocalDate getFechaNacimiento() {return fecha_nacimiento;}
  
  public long getEdad(){
    // Tambien se puede hacer asi, usando between:
    // ChronoUnit.DAYS.between(getFechaNacimiento(), LocalDate.now());

    // Dada la fecha de nacimiento, calcula la cantidad de años entre esta y la fecha actual
    return getFechaNacimiento().until(LocalDate.now(), ChronoUnit.YEARS);

  }
  public String getNumTelefono() {return num_telefono;}
  public String getDireccion() {return direccion;}
  public String getMail() {return mail;}
  
  /**
   * Dado el numero de telefono del contacto, evalua de que ciudad es,
   * solo estan cargadas las caracteristicas de: Necochea, Mar del Plata y tandil.
   * En caso de ingresar una caracteristica que no sea igual a las cargadas, devolvera "desconocido"
   * @return ciudad proveniente del numero.
   */
  public String getCiudad(){
    // Buscamos el indice del espacio (' ') (separa la "caracteristica" del "numero").
    int posicion_guion = getNumTelefono().indexOf(' ');
    String discernible = "desconocido";

    // Obtenemos el prefijo
    String prefijo_telefonico = getNumTelefono().substring(0, posicion_guion);  
    
    switch (prefijo_telefonico) {
      case "2262": return "Necochea";
      case "223": return "Mar del Plata";
      case "249": return "Tandil";
      default: return discernible;
    }
  }

  @Override
  public String toString() {
    return "Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Edad: " + getEdad() + ", Numero: " + getNumTelefono() + ", Ciudad: " + getCiudad();
  }

  @Override
  public boolean equals(Object obj) {
    Contacto contacto = (Contacto)obj;

    return ((contacto.getNombre() == this.getNombre()) && (contacto.getApellido() == this.getApellido()) && (contacto.getNumTelefono() == this.getNumTelefono()));
  }
}