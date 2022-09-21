package TP_4.consigna4;

import java.time.LocalDate;

public class Entrenador extends Integrante{
  long id_federecion;

  public Entrenador(String nombre, String apellido, long numero_pasaporte, LocalDate fecha_nacimiento, String estado, long id_federecion) {
    super(nombre, apellido, numero_pasaporte, fecha_nacimiento, estado);
    setIdFederecion(id_federecion);
  }
  public void setIdFederecion(long id_federecion){this.id_federecion = id_federecion;}
  public long getIdFederecion(){return id_federecion;}
  
  @Override
  public String toString() {
    return super.toString() + "id federacion: " + getIdFederecion() + "}";
  }
}
