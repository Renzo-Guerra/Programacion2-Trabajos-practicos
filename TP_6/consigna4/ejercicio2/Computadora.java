package TP_6.consigna4.ejercicio2;

import TP_6.consigna4.colaEspera.ElementoCola;

public class Computadora implements ElementoCola{
  private String nombre;
  private double velocidadCPU;

  public Computadora(String nombre, double velocidadCPU){
    setNombre(nombre);
    setVelocidadCPU(velocidadCPU);
  }

  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setVelocidadCPU(double velocidadCPU){this.velocidadCPU = velocidadCPU;}
  
  // Getters
  public String getNombre(){return nombre;}
  public double getVelocidadCPU(){return velocidadCPU;}

  public void ejecutarProceso(Proceso proceso_a_ejecutar){
    System.out.println("El proceso '" + proceso_a_ejecutar.getNombre() + "' está siendo ejecutado.");
  }

  @Override
  public String toString() {
    return "Nombre: " + this.nombre + ", velocidad CPU: " + this.velocidadCPU;
  }

  @Override
  public boolean esMasImportante(ElementoCola elementoAComparar) {
    return this.getVelocidadCPU() > ((Computadora)elementoAComparar).getVelocidadCPU();
  }
}
