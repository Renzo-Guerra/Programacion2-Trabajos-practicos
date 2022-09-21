package TP_4.consigna4;

import java.time.LocalDate;

public class Masajista extends Integrante{
  private String titulo;
  private String experiencia; // Principiante, basico, intermedio, avanzado, experto
  
  public Masajista(String nombre, String apellido, long numero_pasaporte, LocalDate fecha_nacimiento, String estado, String titulo, String experiencia) {
    super(nombre, apellido, numero_pasaporte, fecha_nacimiento, estado);
    setTitulo(titulo);
    setExperiencia(experiencia);
  }

  public void setTitulo(String titulo){this.titulo = titulo;}
  public void setExperiencia(String experiencia){this.experiencia = experiencia;}

  public String getTitulo(){return titulo;}
  public String getExperiencia(){return experiencia;}

  @Override
  public String toString() {
    return super.toString() + "titulo: " + getTitulo() + ", experiencia: " + getExperiencia() + "}";
  }
  
}
