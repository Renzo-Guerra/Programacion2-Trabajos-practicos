package TP_6.consigna3;

import TP_6.consigna3.colaEspera.ElementoCola;

public class Barco extends ElementoCola{
  private double capacidad;
  private String id;

  public Barco(String id, double capacidad){
    this.id = id;
    setCapacidad(capacidad);
  }

  // Setters
  public void setCapacidad(double capacidad) {this.capacidad = Math.abs(capacidad);}

  // Getters
  public double getCapacidad() {return capacidad;}
  public String getId(){return id;}

  // Heredados
  @Override
  public boolean esMasImportante(ElementoCola elementoAComparar) {
    return this.getCapacidad() > ((Barco)elementoAComparar).getCapacidad();
  }  

  @Override
  public String toString() {
    return "Id:" + this.getId() + ", capacidad del barco: " + this.getCapacidad() + "\n";
  }

  @Override
  public boolean equals(Object obj) {
    Barco barco = (Barco)obj;
    return barco.getId().equals(this.getId());
  }
}
