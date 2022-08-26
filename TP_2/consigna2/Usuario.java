package TP_2.consigna2;

public class Usuario {
  private String nombre;
  private String contacto_telefonico;
  private String mail;

  private static final String DEF_NOMBRE = "Roberto";
  private static final String DEF_TEL = "555-555";
  private static final String DEF_MAIL = "defmail@gmail.com";

  public Usuario(String nombre, String contacto_telefonico, String mail){
    setNombre(nombre);
    setContacto_telefonico(contacto_telefonico);
    setMail(mail);
  }

  public void setNombre(String nombre) {
    this.nombre = (nombre != null) ? nombre : DEF_NOMBRE;
  }
  public void setContacto_telefonico(String contacto_telefonico) {
    this.contacto_telefonico = (contacto_telefonico != null) ? contacto_telefonico : DEF_TEL;
  }
  public void setMail(String mail) {
    this.mail = (mail != null) ? mail : DEF_MAIL;
  }

  public String getNombre(){return nombre;}
  public String getContacto_telefonico(){return contacto_telefonico;}
  public String getMail(){return mail;}
}
