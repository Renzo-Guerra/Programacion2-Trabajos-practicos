package consigna2;

import java.util.ArrayList;

/**
 * NOTAS: 
 * - Las cualidades las saque de internet jaja.
 * - PROBAR, solo es cuestion de PROBAR, ya lo testie (Por default "Slytherin" va a tener 2 alumnos minimo (Estan hardcodeados, sino 
 *   NUNCA se iba a poder agregar un alumno a la casa "Slytherin"))
 * 
 * - Si queres ver a que casa perteneserias cambiale el nombre alguno 😄
 */

public class Main {
  public static void main(String[] args) {
    Escuela escuela = new Escuela("Hogwarts");
  
    CasaEnemistada casa1 = new CasaEnemistada("Gryffindor", 3);
    casa1.agregarCualidad("coraje");
    casa1.agregarCualidad("osadia");
    casa1.agregarCualidad("valiente");
    casa1.agregarCualidad("imprudente");
    CasaSangrePura casa2 = new CasaSangrePura("Slytherin", 6);
    casa2.agregarCualidad("ambicioso");
    casa2.agregarCualidad("inteligente");
    casa2.agregarCualidad("astuto");
    casa2.agregarCualidad("lider");
    Casa casa3 = new Casa("Hafflepuff", 3);
    casa3.agregarCualidad("justo");
    casa3.agregarCualidad("leal");
    casa3.agregarCualidad("trabajador");
    Casa casa4 = new Casa("Ravenclaw", 2);
    casa4.agregarCualidad("sabiduria");
    casa4.agregarCualidad("ingenio");
    casa4.agregarCualidad("intelecto");

    // Setteamos la enemistad entre Gryffindor y Slytherin
    casa1.agregarCasaEnemiga(casa2);
    
    escuela.agregarCasa(casa1);
    escuela.agregarCasa(casa2);
    escuela.agregarCasa(casa3);
    escuela.agregarCasa(casa4);

    escuela.verCasas();
    // casa1.imprimirCualidades();
    // casa2.imprimirCualidades();
    // casa3.imprimirCualidades();
    // casa4.imprimirCualidades();

    Alumno alumno1 = new Alumno("Luis", "Torres");
    Alumno alumno2 = new Alumno("Angel", "Benavidez");
    Alumno alumno3 = new Alumno("Maria", "Iglesias");
    Alumno alumno4 = new Alumno("Laura", "Torres");
    Alumno alumno5 = new Alumno("Florencia", "Romero");
    Alumno alumno6 = new Alumno("Miguel", "Serqueira");
    Alumno alumno7 = new Alumno("Daniel", "Mosqueira");
    Alumno alumno8 = new Alumno("Luca", "Alverdi");
    Alumno alumno9 = new Alumno("Agustin", "Piñon");
    Alumno alumno10 = new Alumno("Martin", "Torres");

    agregarCualidadesAleatorias(alumno1, 12);
    agregarCualidadesAleatorias(alumno2, 10);
    agregarCualidadesAleatorias(alumno3, 15);
    agregarCualidadesAleatorias(alumno4, 16);
    agregarCualidadesAleatorias(alumno5, 15);
    agregarCualidadesAleatorias(alumno6, 13);
    agregarCualidadesAleatorias(alumno7, 20);
    agregarCualidadesAleatorias(alumno8, 5);
    agregarCualidadesAleatorias(alumno9, 9);
    agregarCualidadesAleatorias(alumno10, 12);
    
    /* ------------------ Incrementando las posibilidades que se cumpla la CasaSangrePura ... */
    // Cree 4 hermanos (A ver si asi sale alguno en la casa Slytherin ... )
    alumno1.agregarFamiliar(alumno2);
    alumno1.agregarFamiliar(alumno3);
    alumno1.agregarFamiliar(alumno4);
    
    alumno2.agregarFamiliar(alumno1);
    alumno2.agregarFamiliar(alumno3);
    alumno2.agregarFamiliar(alumno4);

    alumno3.agregarFamiliar(alumno2);
    alumno3.agregarFamiliar(alumno1);
    alumno3.agregarFamiliar(alumno4);

    alumno4.agregarFamiliar(alumno2);
    alumno4.agregarFamiliar(alumno3);
    alumno4.agregarFamiliar(alumno1);

    casa2.agregarFamiliarHARDCODEADO(alumno2);
    casa2.agregarFamiliarHARDCODEADO(alumno3);
    /* ------------------ Incrementando las posibilidades que se cumpla la CasaSangrePura ... */

    escuela.asignarCasaAleatoriamente(alumno1);
    // escuela.asignarCasaAleatoriamente(alumno2);
    // escuela.asignarCasaAleatoriamente(alumno3);
    escuela.asignarCasaAleatoriamente(alumno4);
    escuela.asignarCasaAleatoriamente(alumno5);
    escuela.asignarCasaAleatoriamente(alumno6);
    escuela.asignarCasaAleatoriamente(alumno7);
    escuela.asignarCasaAleatoriamente(alumno8);
    escuela.asignarCasaAleatoriamente(alumno9);
    escuela.asignarCasaAleatoriamente(alumno10);
    System.out.println("");
    escuela.verCasas();
  }

  /**
   * Crea las cualidades del alumno aleatoriamente
   * @param alumno a agregar las cualidades
   * @param cant_cualidades_agregar que un alumno puede llegar a tener (las cualidades de un alumno NO pueden ser repetidas, 
   * casos repetidos seran ignorados).
   */
  public static void agregarCualidadesAleatorias(Alumno alumno, int cant_cualidades_agregar){
    ArrayList<String> posibles_cualidades = new ArrayList<>();
    posibles_cualidades.add("coraje");
    posibles_cualidades.add("osadia");
    posibles_cualidades.add("valiente");
    posibles_cualidades.add("imprudente");
    posibles_cualidades.add("ambicioso");
    posibles_cualidades.add("inteligente");
    posibles_cualidades.add("astuto");
    posibles_cualidades.add("lider");
    posibles_cualidades.add("justo");
    posibles_cualidades.add("leal");
    posibles_cualidades.add("trabajador");
    posibles_cualidades.add("sabiduria");
    posibles_cualidades.add("ingenio");
    posibles_cualidades.add("intelecto");
    
    final int MIN_POSIBLE = 0;
    final int MAX_POSIBLE = posibles_cualidades.size() - 1;
    int random;

    for(int i=0; i < cant_cualidades_agregar;i++){
      random = (int)(Math.random() * (MAX_POSIBLE - MIN_POSIBLE + 1) + MIN_POSIBLE);
      alumno.agregarCualidad(posibles_cualidades.get(random));
    }
  }
}
