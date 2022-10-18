package TP_7B.consigna1;

import java.time.LocalDateTime;

import TP_7B.consigna1.abstractas.ElementoSA;

public class Archivo extends ElementoSA{
  private int peso; // En KiloBytes
  private LocalDateTime ultimaModificacion;

  public Archivo(String nombre, int peso) {
    super(nombre);
    setPeso(peso);
    setUltimaModificacion();
  }

  // Setters
  public void setPeso(int peso){this.peso = peso;}
  public void setUltimaModificacion(){this.ultimaModificacion = LocalDateTime.now();}

  // Getters
  public LocalDateTime getUltimaModificacion(){return ultimaModificacion;}
  
  @Override
  public int getCantidadElementos(){return 1;}
  
  @Override
  public int getPeso(){return this.peso;}

}
