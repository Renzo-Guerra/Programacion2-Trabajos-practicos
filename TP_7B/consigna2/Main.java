package TP_7B.consigna2;

/**
 * NOTA:
 * No ejecuta, la verdad ni idea, pero bueno, no me quiero atrazar por un ejercicio.
 */

public class Main {
  public static void main(String[] args) {
    Persona persona1 = new Persona("Marcos", "Ponse", "Tandil", "calle falsa 123");
    Persona persona2 = new Persona("Javier", "Mundano", "Necochea", "av 10");

    Paquete paquete1 = new Paquete(22342, persona1, persona2, 0.6);
    Paquete paquete2 = new Paquete(22343, persona1, persona2, 1.2);
    Paquete paquete3 = new Paquete(22344, persona1, persona2, 5.1);
    Paquete paquete4 = new Paquete(22345, persona1, persona2, 1);
    // El 5to paquete se lo envia la persona 2 a la 1, es para ver si me lo acepta en un mismo combo
    Paquete paquete5 = new Paquete(22345, persona2, persona1, 4);

    ComboPostal combo1 = new ComboPostal(3321);
    combo1.agregarEnvio(paquete1);
    combo1.agregarEnvio(paquete2);
    combo1.agregarEnvio(paquete3);
    combo1.agregarEnvio(paquete4);
    combo1.agregarEnvio(paquete5);
    System.out.println(combo1);



  }
}
