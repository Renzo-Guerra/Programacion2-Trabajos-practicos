package TP_4.consigna6;

public class UsuarioFinal extends Asociado{
  private String nombre_usuario;
  private String contraseña;

  public UsuarioFinal(String nombre, String apellido, int edad, String nombre_usuario, String contraseña) {
    super("Usuario final", nombre, apellido, edad);
    setNombreUsuario(nombre_usuario);
    setContraseña(contraseña);
  }

  // Setters
  public void setNombreUsuario(String nombre_usuario){this.nombre_usuario = nombre_usuario;}
  public void setContraseña(String contraseña){this.contraseña = contraseña;}
  // Getters
  public String getNombreUsuario(){return nombre_usuario;}
  public String getContraseña(){return contraseña;}
}
