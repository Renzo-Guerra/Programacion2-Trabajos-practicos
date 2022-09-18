package TP_3.consigna3;

import java.util.ArrayList;

public class Juego {
  private ArrayList<Carta> cartas;
  private ArrayList<Jugador> jugadores;
  private int puntaje_x_ganar_ronda;

  public Juego(){
    cartas = new ArrayList<>();
    jugadores = new ArrayList<>();
    puntaje_x_ganar_ronda = 1;
  }

  /**
   * Añade una carta al mazo principal
   * @param new_card es la carta a agregar
   */
  public void addCarta(Carta new_card){
    if(new_card != null){
      cartas.add(new_card);
    }
  }

  /**
   * Añade un jugador al juego (No se pueden añadir jugadores con el mismo nombre)
   * @param new_jugador a añadir
   */
  public void addJugador(Jugador new_jugador){
    if((new_jugador != null) && !jugadores.contains(new_jugador)){
      jugadores.add(new_jugador);
    }
  }

  public void repartirCartas(){
    /*
     * Se reparte N veces 1 carta a cada jugador, esto controla que cada jugador 
     * tenga la misma cantidad de cartas, ademas de que se reparten la mayor 
     * cantidad de cartas posibles por haber en el mazo 
    */
    while(cartas.size() > jugadores.size()){
      for (Jugador jugador : jugadores) {
        // Se elimina la primer carta del mazo (vendria a ser como la de arriba del todo) y se la asigna al jugador
        jugador.agarrarCarta(cartas.remove(0));
      }
    }
  }
  /**
   * Se jugaran N rondas, al principio de cada ronda los 3 jugadores tiran una carta, estos deberan intuir cual será la stat a salir,
   * los jugadores saben que si 2 o mas cartas terminan en empate, se tomará otra stat, por lo tanto juegan teniendo eso en mente.
   * 
   */
  public void jugar(){
    ArrayList<String> posibles_caracteristicas; // ArrayList con las string de las caracteristicas
    ArrayList<Integer> posibles_numeros; // ArrayList con los valores de las caracteristicas
    ArrayList<Carta> cartas_ronda = new ArrayList<>();
    int caracteristica_actual;
    boolean empate = false; // En caso de que 2 o mas jugadores tengan el mismo valor sobre la stat a comparar, se deberia volver a evaluar la ronda con otra stat.

    // Mientras el primer jugador tenga alguna carta en mano, se jugará otra ronda
    while(jugadores.get(0).getCantidadCartas() > 0){
      // Cada jugador vé sus cartas, y elige que carta tirar
      for (Jugador jugador_actual : jugadores) {
        // Cada jugador vé sus cartas, para luego elegir cual tirar
        jugador_actual.verCartas();
        // Cada jugador elije que carta tirar, esta se almacenará durante la ronda en "cartas_ronda"
        cartas_ronda.add(jugador_actual.tirarCarta()); 
      }
    
      // Setteamos las posibles caracteristicas a comparar
      posibles_numeros = new ArrayList<>(cartas_ronda.get(0).getCaracteristicasIntArrayList());
      posibles_caracteristicas = new ArrayList<>(cartas_ronda.get(0).getCaracteristicasStringArrayList());
      
      // Se declaran fuera del while para que tambien puedan ser usadas fuera del dowhile
      Carta mayor_carta;
      int jugador_ganador;

      do {
        //Por default, carta del primer jugador es la carta con la mayor caracteristica relevante de la ronda
        mayor_carta = cartas_ronda.get(0);
        jugador_ganador = 0;

        // Se obtiene la caracteristica actual que se utilizará en la ronda
        caracteristica_actual = obtenerCaracteristicaDeFormaAleatoria(posibles_numeros);
        /**
         * 0: vision nocturna
         * 1: velocidad
         * 2: fuerza
         * 3: peso
         * 4: altura
         * 5: edad
         */

        for(int i=1;i<cartas_ronda.size();i++){
          Carta carta_actual = cartas_ronda.get(i);
          // Stat a comparar de la carta actual
          int stat_carta = carta_actual.getCaracteristicasIntArrayList().get(caracteristica_actual);

          if(stat_carta == mayor_carta.getCaracteristicasIntArrayList().get(caracteristica_actual)){
            empate = true;
          }else if(stat_carta > mayor_carta.getCaracteristicasIntArrayList().get(caracteristica_actual)){
            mayor_carta = carta_actual;
            jugador_ganador = i;
            empate = false;
          }
        }
        if(empate){
          System.out.println("Se evaluó la caracteristica '" + obtenerCaracteristicaActual(posibles_caracteristicas, caracteristica_actual) + "' pero hubo empate. Eligiendo proximo valor...");
          // En caso de empate, se elimina la caracteristica actual de las posibles caracteristicas.
          posibles_numeros.remove(caracteristica_actual);
          posibles_caracteristicas.remove(caracteristica_actual);
        }
      // Se repetirá mientras todavia haya habilidades por comparar, o mientras siga siendo empate
      } while ((!posibles_numeros.isEmpty()) && empate);

      if(posibles_numeros.isEmpty()){
        // En el HIPOTETICO CASO de que TODAS las caracteristicas de TODAS las cartas tengan algun tipo de empate...
        System.out.println("Ninguna carta cuenta con una caracteristica mayor al de las demas cartas (sin empate), NADIE suma puntos");
      }else{
        // Se le agrega al jugador correspondiente su puntaje
        System.out.println("La caracteristica que se tomo en cuenta en esta ronda fue: '" + obtenerCaracteristicaActual(posibles_caracteristicas, caracteristica_actual) + "'");
        // Se le agrega el puntaje al jugador que ganó la ronda
        System.out.println("El ganador de la ronda es: " + jugadores.get(jugador_ganador).getNombre());
        jugadores.get(jugador_ganador).agregarPuntos(puntaje_x_ganar_ronda);
        // Se muestran los puntos actuales de cada jugador
        mostrarPuntajes();
      }
      // SUPER IMPORTANTE, ELIMINAR LAS CARTAS X RONDA (Estuve mas de 2 hs debugueando... (Me estaba tomando las cartas anteriores...))
      cartas_ronda.clear();
    }
    System.out.println("Terminó el juego, resultados");
    mostrarPuntajes();
  }
  /**
   * Dado un indice de las posibles caracteristicas indica cual es la caracteristica que se evaluó en la ronda (tener en cuenta 
   * que 'posibles_caracteristicas' se va modificando cada ronda cada vez que hay un empate, es por eso que tambien debemos pasarlo 
   * por marametro).
   * @param posibles_caracteristicas contiene los posibles strings de las caracteristicas.
   * @param caracteristica_actual es el indice de la posible caracteristica que se está evaluando.
   * @return el nombre de la caracteristica que se esta evaluando.
   */
  private String obtenerCaracteristicaActual(ArrayList<String> posibles_caracteristicas, int caracteristica_actual){
    return (caracteristica_actual < posibles_caracteristicas.size())? posibles_caracteristicas.get(caracteristica_actual):"Error al encontrar la caracteristica";
  }

  private void mostrarPuntajes(){
    System.out.println("");
    for (Jugador jugador_actual : jugadores) {
      System.out.println("Nombre: " + jugador_actual.getNombre() + ", puntos: " + jugador_actual.getPuntos());
    }
    System.out.println("");
  }
  /**
   * Se obtendrá de manera aleatoria la caracteristica a comparar entre cada carta tirada de cada jugador (en esa ronda).
   * @param posibles_numeros son las posibles caracteristicas que todavia no se compararon.
   * @return indice de la caracteristica a comparar.
   */
  private int obtenerCaracteristicaDeFormaAleatoria(ArrayList<Integer> posibles_numeros){
    int MENOR_POSIBLE = 0;
    int MAYOR_POSIBLE = (posibles_numeros.size()-1);

    return (int)(Math.random() * (MAYOR_POSIBLE - MENOR_POSIBLE + 1) + MENOR_POSIBLE);
  }
}
