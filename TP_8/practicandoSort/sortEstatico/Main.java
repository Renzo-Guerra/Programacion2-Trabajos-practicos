package TP_8.practicandoSort.sortEstatico;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> nombres = new ArrayList<>();
    nombres.add("Juan");
    nombres.add("Agustin");
    nombres.add("Lucia");
    nombres.add("Sofia");
    nombres.add("Martin");

    System.out.println("Nombres por default");
    System.out.println(nombres);
    System.out.println("");
    System.out.println("Nombres ordenados alfabeticamente descentendemente: ");
    Collections.sort(nombres);
    System.out.println(nombres);
    System.out.println("");
    System.out.println("Nombres ordenados alfabeticamente ascendentemente: ");
    // Esto funcioná bien porq anteriormente se ordeno descendentemente
    Collections.reverse(nombres);
    System.out.println(nombres);
    System.out.println("");

    System.out.println("\n\n\nOrdenamiento en objetos creados por nosotros:");
    ArrayList<Persona> personas = new ArrayList<>();
    // Instanciacion de las personas
    Persona persona1 = new Persona("Juan", "Aguirre", 22);
    Persona persona2 = new Persona("Miguel", "Torres", 45);
    Persona persona3 = new Persona("Pedro", "Gonzales", 44);
    Persona persona4 = new Persona("Agustin", "Villar", 22);
    Persona persona5 = new Persona("Sofia", "Martinez", 21);
    Persona persona6 = new Persona("Andrea", "Rodriguez", 54);
    // Se agregan las personas a la lista
    personas.add(persona1);
    personas.add(persona2);
    personas.add(persona3);
    personas.add(persona4);
    personas.add(persona5);
    personas.add(persona6);

    System.out.println("Personas ordenadas por default: ");
    System.out.println(personas);
    System.out.println("");
    System.out.println("Personas ordenadas por edad: ");
    Collections.sort(personas);
    /**
     * Esto hasta acá es estatico, porq a las personas siempre te los va a 
     * organizar por edad (que atributo es el que condiciona al ordenamiento, el cual nunca cambia).
     */
    System.out.println(personas);
    System.out.println("");

  }
}
