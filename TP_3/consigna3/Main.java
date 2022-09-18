package TP_3.consigna3;

/*
 * REGLAS DEL JUEGO:
 * - Jugadores N
 * - A cada jugador se le repartiran cartas de manera equitativa hasta que no haya mas cartas (o queden menos de las necesarias para repartirle 1 a cada jugador)
 * - Cada carta cuenta con atributos que poseen un valor, se randomizara un atributo y la carta que posea el mayor en dicho atributo gana la ronda.
 * - En caso de que 2 o mas personas tiren una carta con el mismo valor del atributo relevante de dicha ronda, se volvera a elegir de manera aleatoria un atributo de manera random.
 * - En caso de que NINGUN atributo sea mayor al de las cartas de los demas jugadores NADIE sumará puntos.
 * - El ganador de la ronda sumara 1 punto
 * - Para que 2 cartas sean iguales, tanto "nombre_real" como "nombre_heroe" deben ser iguales en ambas cartas
 * - Los atributos de las cartas son generados automaticamente (Ultima funcion en el Main)
*/

public class Main {
  public static void main(String[] args) {
    // Instanciamos el juego
    Juego juego = new Juego();
    // Añadimos las cartas que se utilizaran
    generarCartas(juego, 12);
    // Añadimos los jugadores
    Jugador player1 = new Jugador("Mariano");
    Jugador player2 = new Jugador("Luis");
    Jugador player3 = new Jugador("Agustina");
    juego.addJugador(player1);
    juego.addJugador(player2);
    juego.addJugador(player3);
    //Repartimos  N (cantidad_de_cartas/cantidad_de_jugadores) cartas a cada jugador
    juego.repartirCartas();
    juego.jugar();
  }

  /**
   * Crea N cantidad de cartas y las añade al deck principal (El del juego)
   * @param juego al cual le añadiremos las cartas
   * @param cant_cartas que añadiremos al mazo del juego
   */
  public static void generarCartas(Juego juego, int cant_cartas){
    for(int i=0;i<cant_cartas;i++){
      juego.addCarta(crearCarta(i));
    }
  }

  /**
   * Crea una carta, todos tienen el mimso nombre tanto real como de heroe
   */
  public static Carta crearCarta(int i){
    final int MIN_VALOR_POSIBLE = 0;
    final int MAX_VALOR_POSIBLE = 3;
    
    // Debido a que el nombre de la carta no debe estar en el mazo para ser añadida, cree los nombres de esta forma
    // Se supone que cada carta en realidad es cargada. 
    String nombre_real = "Juan " + i;
    String nombre_heroe = "Super x " + i;
    int vision_noctura = (int) (Math.random() * (MAX_VALOR_POSIBLE - MIN_VALOR_POSIBLE + 1) + MIN_VALOR_POSIBLE); 
    int velocidad = (int) (Math.random() * (MAX_VALOR_POSIBLE - MIN_VALOR_POSIBLE + 1) + MIN_VALOR_POSIBLE);  
    int fuerza = (int) (Math.random() * (MAX_VALOR_POSIBLE - MIN_VALOR_POSIBLE + 1) + MIN_VALOR_POSIBLE);  
    int peso = (int) (Math.random() * (MAX_VALOR_POSIBLE - MIN_VALOR_POSIBLE + 1) + MIN_VALOR_POSIBLE);  
    int altura = (int) (Math.random() * (MAX_VALOR_POSIBLE - MIN_VALOR_POSIBLE + 1) + MIN_VALOR_POSIBLE);   // En centimetros
    int edad = (int) (Math.random() * (MAX_VALOR_POSIBLE - MIN_VALOR_POSIBLE + 1) + MIN_VALOR_POSIBLE);  
    
    return new Carta(nombre_real, nombre_heroe, vision_noctura, velocidad, fuerza, peso, altura, edad);
  }
}
