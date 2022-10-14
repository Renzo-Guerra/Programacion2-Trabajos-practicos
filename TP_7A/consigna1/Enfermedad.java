package TP_7A.consigna1;

import java.util.ArrayList;

public class Enfermedad {
  private String nombre;
  private ArrayList<String> estadosPatologicos;

  public Enfermedad(String nombre){
    setNombre(nombre);
    estadosPatologicos = new ArrayList<>();
  }
  
  // Setters
  public void setNombre(String nombre) {this.nombre = nombre;}

  // Getters
  public String getNombre() {return nombre;}
  public ArrayList<String> getEstadosPatologicos() {return new ArrayList<>(estadosPatologicos);}

  public void agregarEstadoPatologico(String nuevoEstadoPatologico){
    if((nuevoEstadoPatologico != null) && !estadosPatologicos.contains(nuevoEstadoPatologico)){
      estadosPatologicos.add(nuevoEstadoPatologico);
    }
  }

  @Override
  public boolean equals(Object obj) {
    Enfermedad enfermedad = (Enfermedad)obj;
    return enfermedad.getNombre() == this.getNombre();
  }
}
