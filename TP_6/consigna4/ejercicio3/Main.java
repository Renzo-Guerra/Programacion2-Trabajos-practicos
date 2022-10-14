package TP_6.consigna4.ejercicio3;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    // Instanciacion de camiones
    Camion camion1 = new Camion("aas", LocalDate.of(2022, 9, 20));
    Camion camion2 = new Camion("ssd", LocalDate.of(2022, 3, 2));
    Camion camion3 = new Camion("rwe", LocalDate.of(2021, 12, 30));
    Camion camion4 = new Camion("sdf", LocalDate.of(2022, 10, 13));
    Camion camion5 = new Camion("ttt", LocalDate.of(2022, 4, 6));
    Camion camion6 = new Camion("fgg", LocalDate.of(2022,3, 3));
    Camion camion7 = new Camion("tyu", LocalDate.of(2022, 2, 27));
    
    // Instanciacion de barcos
    Barco barco1 = new Barco("rrr", 20000);
    Barco barco2 = new Barco("ggg", 30000);
    Barco barco3 = new Barco("uuu", 2000);
    Barco barco4 = new Barco("iii", 10000);

    Puerto puerto = new Puerto();
    System.out.println("Barcos en espera: ");
    System.out.println(puerto.getBarcos());
    System.out.println("Camiones en espera: ");
    System.out.println(puerto.getCamiones());

    puerto.agregarBarco(barco1);
    puerto.agregarBarco(barco2);
    puerto.agregarBarco(barco3);
    puerto.agregarBarco(barco4);

    puerto.agregarCamion(camion1);
    puerto.agregarCamion(camion2);
    puerto.agregarCamion(camion3);
    puerto.agregarCamion(camion4);
    puerto.agregarCamion(camion5);
    puerto.agregarCamion(camion6);
    puerto.agregarCamion(camion7);

    System.out.println("Barcos en espera: ");
    System.out.println(puerto.getBarcos());
    System.out.println("Camiones en espera: ");
    System.out.println(puerto.getCamiones());
    /**
     * - En caso de que ambas colas no esten vacias, "Simula la carga del barco"
     * - Remueve el elemento mas importante de ambas colas
     */
    System.out.println("");
    puerto.cargarBarco();
    System.out.println("");
    
    System.out.println("Barcos en espera: ");
    System.out.println(puerto.getBarcos());
    System.out.println("Camiones en espera: ");
    System.out.println(puerto.getCamiones());
  }
}
