package TP_7A.consigna4;

import java.util.ArrayList;

import TP_7A.consigna4.condicion.Condicion;
import TP_7A.consigna4.ficha.Ficha;

public class Tablero {
  private long puntageMinimo; // está medio al pedo, ya que nunca pide que operemos con él
  private ArrayList<Ficha> fichas;
  
  public Tablero(){
    fichas = new ArrayList<>();
  }

  public void agregarFicha(Ficha nuevaFicha){
    if(nuevaFicha != null){
      fichas.add(nuevaFicha);
    }
  }

  public double getDificultad(){
    return (getSumatoriaPoderDestruccion() == 0)? 0 : (getSumatoriaFortaleza() / getSumatoriaPoderDestruccion());
  }

  private int getSumatoriaFortaleza(){
    int resultado = 0;
    for (Ficha ficha : fichas)
      resultado += ficha.getFortaleza();

    return resultado;
  }

  private double getSumatoriaPoderDestruccion(){
    double resultado = 0;
    for (Ficha ficha : fichas)
      resultado += ficha.getPoderDestruccion();

    return resultado;
  }

  public ArrayList<Ficha> getFichasWhere(Condicion condicion){
    ArrayList<Ficha> resultados = new ArrayList<>();
    for (Ficha ficha : fichas) {
      if(condicion.cumple(ficha))
        resultados.add(ficha);
    }

    return resultados;
  }
}
