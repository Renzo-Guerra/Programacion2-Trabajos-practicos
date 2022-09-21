package TP_4.consigna4;

import java.time.LocalDate;

public class Futbolista extends Integrante{
  private String posicion; 
  private boolean es_derecho;
  private int goles_marcados;

  public Futbolista(String nombre, String apellido, long numero_pasaporte, LocalDate fecha_nacimiento, String estado, String posicion, boolean es_derecho, int goles_marcados) {
    super(nombre, apellido, numero_pasaporte, fecha_nacimiento, estado);
    setPosicion(posicion);
    this.es_derecho = es_derecho;
    setGolesMarcados(goles_marcados);
  }
  public void setPosicion(String posicion) {this.posicion = posicion;}
  public void setGolesMarcados(int goles_marcados) {this.goles_marcados = goles_marcados;}

  public String getPosicion(){return posicion;}
  public boolean getEsDerecho(){return this.es_derecho;}
  public int getGolesMarcados(){return goles_marcados;}

  @Override
  public String toString() {
    return super.toString() + "posicion: " + getPosicion() + ", es derecho: " + getEsDerecho() + ", goles marcados: " + getGolesMarcados() + "}";
  }
}
