package TP_6.consigna2;

import TP_6.consigna2.colaEspera.ElementoCola;

public class Proceso extends ElementoCola{
  private String nombre;
  private double memoriaRequerida;

  public Proceso(String nombre, double memoriaRequerida){
    setNombre(nombre);
    setMemoriaRequerida(memoriaRequerida);
  }

  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setMemoriaRequerida(double memoriaRequerida){this.memoriaRequerida = memoriaRequerida;}

  // Getters
  public String getNombre(){return nombre;}
  public double getMemoriaRequerida(){return memoriaRequerida;}


  @Override
  public boolean esMayor(ElementoCola otroElementoCola) {
    return this.getMemoriaRequerida() > ((Proceso)otroElementoCola).getMemoriaRequerida();
  }
}
