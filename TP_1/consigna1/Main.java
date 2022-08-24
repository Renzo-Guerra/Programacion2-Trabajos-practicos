package TP_1.consigna1;

import java.time.LocalDate;

/*
  * La altura debe ir en Mts.
  * El peso debe ir indicado en KG.
*/

public class Main {
  public static void main(String[] args) {
    long dni = 24504877;
    String nombre = "Franco";
    LocalDate fecha_nacimiento = LocalDate.of(1997, 4, 2);
    char sexo = 'm';
    float altura = 191.34f;
    float peso = 90.12f;

    Persona sujeto_1 = new Persona(dni, nombre, fecha_nacimiento, sexo, altura, peso);
    
    System.out.println("\nInformacion del sujeto_1: ");
    System.out.println(sujeto_1.obtenerDatos());
    mostrarLosDemasDatos(sujeto_1);
  }
  
  // Probamos los demas metodos que no son getters
  public static void mostrarLosDemasDatos(Persona sujeto){
    System.out.println("La edad es: " + sujeto.getEdad());
    System.out.println("El IMC es: " + sujeto.calcularIndiceMasaCorporal());
    System.out.println("Esta en forma: " + sujeto.estaEnForma());
    System.out.println("Es su cumpleaños: " + sujeto.esSuCumpleanios());
    System.out.println("Es mayor de edad: " + sujeto.esMayorDeEdad());
    System.out.println("Puede votar: " + sujeto.puedeVotar());
  }
}