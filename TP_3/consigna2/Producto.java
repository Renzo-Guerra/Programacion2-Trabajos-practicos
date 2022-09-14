package TP_3.consigna2;

import java.util.ArrayList;

public class Producto {
  private String nombre;
  private ArrayList<String> posibles_nombres;
  private double peso;
  private double costo_fab;
  private String madera;
  private String color; 
  private double porcentaje_ganancia;

  public Producto(String nombre, double peso, double costo_fab, String madera, String color, double porcentaje_ganancia){
    posibles_nombres = new ArrayList<>();
    posibles_nombres.add("silla");
    posibles_nombres.add("mesa");
    posibles_nombres.add("banco");
    setNombre(nombre);
    setPeso(peso);
    setCostoFab(costo_fab);
    setMadera(madera);
    setColor(color);
    setPorcentajeGanancia(porcentaje_ganancia);
  }

  public void setNombre(String nombre) {
    // Se pasa el nombre a minuscula
    nombre = nombre.toLowerCase();
    // Se valida que no este null y que el nombre este dentro del arraylist de posibles nombres
    if(nombre != null && posibles_nombres.contains(nombre)){
      this.nombre = nombre;
    }else{
      // Por default te guarda una silla
      this.nombre = posibles_nombres.get(0);
    }
  }

  public void setPeso(double peso){this.peso = peso;}
  public void setCostoFab(double costo_fab){this.costo_fab = costo_fab;}
  public void setMadera(String madera){this.madera = madera;}
  public void setColor(String color){this.color = color;}
  public void setPorcentajeGanancia(double porcentaje_ganancia){
    this.porcentaje_ganancia = Math.abs(porcentaje_ganancia);
  }

  public String getNombre() {return nombre;}
  public double getPeso() {return peso;}
  public double getPrecio() {return getCostoFab() + (porcentaje_ganancia * getCostoFab() / 100);}
  public double getCostoFab() {return costo_fab;}
  public String getMadera() {return madera;}
  public String getColor() {return color;}

  @Override
  public boolean equals(Object obj) {
    Producto prod = (Producto)obj;
    if((prod.getNombre() == this.getNombre()) && (prod.getPeso() == this.getPeso()) && (prod.getPrecio() == this.getPrecio()) && (prod.getCostoFab() == this.getCostoFab()) && (prod.getMadera() == this.getMadera()) && (prod.getColor() == this.getColor())){
      return true;
    }

    return false;
  }

  public String toString(){
    return getNombre() + ", " + getPeso() + ", " + getPrecio() + ", " + getCostoFab() + ", " + getMadera() + ", " + getColor();
  }
}
