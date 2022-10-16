package TP_7A.consigna3;

import java.util.ArrayList;

public class Planta {
  private String nombreCientifico, calificacionSuperior, familia, clase, tipo; // tipo es "interior" || "exterior". 
  private ArrayList<String> nombresVulgares;
  private int puntajeRiego, puntajeSol;
  private final int MIN_VALOR = 1;
  private final int MAX_VALOR = 10;

  public Planta(String nombreCientifico, String calificacionSuperior, String familia, String clase, String tipo, int puntajeRiego, int puntajeSol){
    setNombreCientifico(nombreCientifico);
    setCalificacionSuperior(calificacionSuperior);
    setFamilia(familia);
    setClase(clase);
    setRiego(puntajeRiego);
    setSol(puntajeSol);
    setTipo(tipo);
    nombresVulgares = new ArrayList<>();
  }

  // Setters
  public void setNombreCientifico(String nombreCientifico){this.nombreCientifico = nombreCientifico;}
  public void setCalificacionSuperior(String calificacionSuperior){this.calificacionSuperior = calificacionSuperior;}
  public void setFamilia(String familia){this.familia = familia;}
  public void setClase(String clase){this.clase = clase;}
  public void setRiego(int puntajeRiego){
    if(puntajeRiego < MIN_VALOR) {this.puntajeRiego = MIN_VALOR ; return;}
    if(puntajeRiego > MAX_VALOR) {this.puntajeRiego = MAX_VALOR ; return;}

    this.puntajeRiego = puntajeRiego;
  }
  public void setSol(int puntajeSol){
    if(puntajeSol < MIN_VALOR) {this.puntajeSol = MIN_VALOR ; return;}
    if(puntajeSol > MAX_VALOR) {this.puntajeSol = MAX_VALOR ; return;}

    this.puntajeSol = puntajeSol;
  }
  public void setTipo(String tipo) {this.tipo = tipo;}

  // Getters
  public String getNombreCientifico(){return nombreCientifico;}
  public String getCalificacionSuperior(){return calificacionSuperior;}
  public String getFamilia(){return familia;}
  public String getClase(){return clase;}
  public int getRiego(){return puntajeRiego;}
  public int getSol(){return puntajeSol;}
  public String getTipo(){return tipo;}
  
  public void agregarNombreBulgar(String nuevoNombreVulgar){
    if((nuevoNombreVulgar != null) && (!nombresVulgares.contains(nuevoNombreVulgar))){
      nombresVulgares.add(nuevoNombreVulgar);
    }
  }

  public boolean esConocidaVulgarmenteComo(String nombreVulgar){
    return nombresVulgares.contains(nombreVulgar);
  }

  @Override
  public String toString() {
    return "Nombre cientifico: " + getNombreCientifico() + ", calificacion superior: " + getCalificacionSuperior() + ", familia: " + getFamilia() + ", clase: " + getClase() + ", puntaje riego: " + getRiego() + ", puntaje sol: " + getSol() + ", conocida vulgarmente como: " + this.nombresVulgares + "\n";
  }

  @Override
  public boolean equals(Object obj) {
    Planta planta = (Planta)obj;
    return ((planta.nombreCientifico == this.nombreCientifico) && (planta.familia == this.familia) && (planta.clase == this.clase));
  }
}
