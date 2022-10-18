package TP_7B.consigna1.abstractas;

import java.time.LocalDateTime;

public abstract class ElementoSA {
  private String nombre;
  private LocalDateTime fechaCreacion;

  public ElementoSA(String nombre){
    setNombre(nombre);
    this.fechaCreacion = LocalDateTime.now();
  }

  // Setters
  public void setNombre(String nombre) {this.nombre = nombre;}
  
  // Getters
  public String getNombre(){return nombre;}
  public LocalDateTime getFechaCreacion(){return fechaCreacion;}

  // Metodos abstractos
  public abstract int getCantidadElementos();
  public abstract int getPeso();
}
