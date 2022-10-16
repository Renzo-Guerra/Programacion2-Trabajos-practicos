package TP_7A.consigna4.ficha;

public class Ficha {
  private String nombre;
  private int fortaleza;
  private int espacio;
  private double poderDestruccion;

  public Ficha(String nombre, int fortaleza, int espacio, double poderDestruccionBase){
    setNombre(nombre);
    setFortaleza(fortaleza);
    setEspacio(espacio);
    setPoderDestruccionBase(poderDestruccionBase);
  }

  // Setters:
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setFortaleza(int fortaleza){
    // Nunca puede tener una fortaleza negativa o nula
    this.fortaleza = (fortaleza <= 0)? 1 : fortaleza;
  }
  public void setEspacio(int espacio){
    // Nunca puede tener un espacio negativo o nulo
    this.espacio = (espacio <= 0)? 1 : espacio;
  }
  public void setPoderDestruccionBase(double poderDestruccion){
    // Nunca puede tener un 'poder de destruccion inicial' menor a 0 
    this.poderDestruccion = (poderDestruccion < 0)? 0 : poderDestruccion;
  }

  // Getters:
  public String getNombre(){return this.nombre;}
  public int getFortaleza(){return this.fortaleza;}
  public int getEspacio(){return this.espacio;}
  public double getPoderDestruccion(){return this.poderDestruccion;}

  @Override
  public String toString() {
    return "nombre: " + this.getNombre() + ", fortaleza: " + this.getFortaleza() + ", espacio que ocupa: " + this.getEspacio() + ", poder de destruccion: " + this.getPoderDestruccion() + "\n";
  }
}
