package TP_2.consigna4;

public class Cancha {
  private int numero_de_cancha;
  private String tipo_de_cancha;
  private double precio;

  // Constructor 
  public Cancha(int numero_de_cancha, String tipo_de_cancha, double precio){
    setNumeroDeCancha(numero_de_cancha);
    setTipoDeCancha(tipo_de_cancha);
    setPrecio(precio);
  }

  // Setters
  public void setNumeroDeCancha(int numero_de_cancha){this.numero_de_cancha = numero_de_cancha;}
  public void setTipoDeCancha(String tipo_de_cancha){this.tipo_de_cancha = tipo_de_cancha;}
  public void setPrecio(double precio){this.precio = precio;}

  // Getters
  public int getNumeroDeCancha(){return numero_de_cancha;}
  public String getTipoDeCancha(){return tipo_de_cancha;}
  public double getPrecio(){return precio;}
}