package TP_3.consigna3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Jugador {
  private String nombre;
  private byte puntos;
  private ArrayList<Carta> mis_cartas;

  public Jugador(String nombre){
    setNombre(nombre);
    mis_cartas = new ArrayList<>();
    puntos = 0;
  }
  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  
  // Getters
  public String getNombre(){return nombre;}
  
  /**
   * Dada una carta pasada por Juego, la agrega a la mano del jugador
   * @param carta_a_agarrar es la carta que el jugador agregara a "mis_cartas"
   */
  public void agarrarCarta(Carta carta_a_agarrar){
    mis_cartas.add(carta_a_agarrar);
  }

  public void agregarPuntos(int cant_puntos_agregar){
    this.puntos+= cant_puntos_agregar;
  }
  public byte getPuntos() {return puntos;}
  /**
   * 
   * @return la cantidad de cartas que posee el jugador
   */
  public int getCantidadCartas(){
    return (mis_cartas.isEmpty())? 0 : mis_cartas.size();
  }
  /**
   * Se muestran por consola las cartas del jugador (en mano), 
   */
  public void verCartas(){
    byte index = 1;
    System.out.println("Cartas del jugador " + getNombre() + ": ");
    for (Carta carta_actual : mis_cartas) {
      System.out.println("carta " + index++ + "{" + carta_actual + "}");
    }
  }

  /**
   * El jugador elije un indice de carta y la "tira" al tablero.
   * @return la carta que utilizará el jugador esta ronda.
   */
  public Carta tirarCarta(){
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    int indice_carta_elegida = 0;
    do {
      try {
        System.out.println("Ingrese el numero de la carta a tirar: ");
        indice_carta_elegida = Integer.valueOf(entrada.readLine());
      } catch (Exception e) {
        indice_carta_elegida = 0;
      }
      // Debido a que en la "interfaz" se ve que la primer carta es la de indice 1...
    } while ((indice_carta_elegida < 1) || (indice_carta_elegida > (getCantidadCartas())));

    // Eliminamos de la "mano" del jugador la carta elegida
    return mis_cartas.remove((indice_carta_elegida-1));
  }

  @Override
  public boolean equals(Object obj) {
    Jugador jugador = (Jugador)obj;

    return (jugador.getNombre() == this.getNombre());
  }
}
