package TP_6.consigna4.ejercicio3;

import TP_6.consigna4.colaEspera.ElementoCola;

import java.time.LocalDate;
import java.time.Period;

public class Camion implements ElementoCola{
  private String id;
  private LocalDate fechaCargado;

  public Camion(String id, LocalDate fechaCargado){
    this.id = id;
    setFechaCargado(fechaCargado);
  }

  // Setters
  public void setFechaCargado(LocalDate fechaCargado){this.fechaCargado = fechaCargado;}
  
  // Getters
  public LocalDate getFechaCargado() {return fechaCargado;}
  public String getId(){return id;}

  // Heredados
  @Override
  public boolean esMasImportante(ElementoCola elementoAComparar) {
    /*
      Period.between(a, b) calcula el periodo entre 2 fechas (anios, meses, semanas, etc). 
      En caso de que la primer fecha sea mayor a la segunda, devuelve un periodo negativo.
      En nuestro caso, los camiones que ingresaron antes son los mas importantes.
      Es por eso que si !periodo.isNegative() es verdadero, la fecha de "this" es "mas importante" que la comparada.
    */
    Period periodo = Period.between(this.getFechaCargado(), ((Camion)elementoAComparar).getFechaCargado());
    
    return !periodo.isNegative();
  }
  
  @Override
  public String toString() {
    return "Id:" + this.getId() + ", Fecha de cargado: " + this.getFechaCargado() + "\n";
  }

  @Override
  public boolean equals(Object obj) {
    Camion camion = (Camion)obj;
    return camion.getId().equals(this.getId());
  }
}
