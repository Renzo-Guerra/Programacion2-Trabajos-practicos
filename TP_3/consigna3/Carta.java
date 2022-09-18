package TP_3.consigna3;

import java.util.ArrayList;

public class Carta {
  private String nombre_real;
  private String nombre_heroe;
  private ArrayList<Integer> caracteristicas_int = new ArrayList<>();
  private ArrayList<String> caracteristicas_string = new ArrayList<>();

  /**
   * 0: vision nocturna
   * 1: velocidad
   * 2: fuerza
   * 3: peso
   * 4: altura
   * 5: edad
   */

  public Carta(String nombre_real, String nombre_heroe, int vision_noctura, int velocidad, int fuerza, int peso, int altura, int edad){
    this.nombre_real = nombre_real;
    this.nombre_heroe = nombre_heroe;
    this.caracteristicas_int.add(Math.abs(vision_noctura));
    this.caracteristicas_string.add("vision_noctura");
    this.caracteristicas_int.add(Math.abs(velocidad));
    this.caracteristicas_string.add("velocidad");
    this.caracteristicas_int.add(Math.abs(fuerza));
    this.caracteristicas_string.add("fuerza");
    this.caracteristicas_int.add(Math.abs(peso));
    this.caracteristicas_string.add("peso");
    this.caracteristicas_int.add(Math.abs(altura));
    this.caracteristicas_string.add("altura");
    this.caracteristicas_int.add(Math.abs(edad));
    this.caracteristicas_string.add("edad");
  }

  public String getNombreReal(){return nombre_real;}
  public String getNombreHeroe(){return nombre_heroe;}
  public int getVisionNoctura(){return this.caracteristicas_int.get(0);}
  public int getVelocidad(){return this.caracteristicas_int.get(1);}
  public int getFuerza(){return this.caracteristicas_int.get(2);}
  public int getPeso(){return this.caracteristicas_int.get(3);}
  public int getAltura(){return this.caracteristicas_int.get(4);}
  public int getEdad(){return this.caracteristicas_int.get(5);}
  public int getCantCaracteristicas_int(){return this.caracteristicas_int.size();}
  public ArrayList<Integer> getCaracteristicasIntArrayList(){return new ArrayList<>(this.caracteristicas_int);}
  public ArrayList<String> getCaracteristicasStringArrayList(){return new ArrayList<>(this.caracteristicas_string);}

  @Override
  public String toString() {
    return "nombre real: " + getNombreReal() + ", nombre heroe: " + getNombreHeroe() + ", vision nocturna: " + getVisionNoctura() + ", velocidad: " + getVelocidad() + ", fuerza: " + getFuerza() + ", peso: " + getPeso() + ", altura: " + getAltura() + ", edad: " + getEdad();
  }

  @Override
  public boolean equals(Object obj) {
    Carta carta = (Carta)obj;
    // 2 cartas son iguales cuando tanto su nombre real como el nombre del heroe coinciden.
    // Pueden haber heroes con las mismas stats en atributos.
    return ((carta.getNombreReal() == this.getNombreReal()) && (carta.getNombreHeroe() == this.getNombreHeroe()));
  }
}
