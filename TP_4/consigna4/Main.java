package TP_4.consigna4;

import java.time.LocalDate;

/**
 * Los posibles estados son: 
 *  - viajando
 *  - en concentracion
 *  - en pais de origen 
 * 
 * Las posibles experiencias son:  
 *  - principiante 
 *  - intermedio 
 *  - experto 
 */

public class Main{
  public static void main(String[] args) {
    Masajista masajista1 = new Masajista("Romina", "Alvarez", 344313, LocalDate.of(1994, 5, 20), "viajando", "el titulo", "principiante");
    Masajista masajista2 = new Masajista("Juan", "Rodriguez", 223432, LocalDate.of(1980, 1, 22), "en concentracion", "el titulo", "intermedio");
    Masajista masajista3 = new Masajista("Miguel", "Ojeda", 123432, LocalDate.of(1977, 6, 4), "en pais de origen", "el titulo", "experto");
    Futbolista futbolista1 = new Futbolista("Luca", "Rodriguez", 1123344, LocalDate.of(2001, 8, 1), "en concentracion", "arquero", true, 1);
    Futbolista futbolista2 = new Futbolista("Franco", "Torres", 12343454, LocalDate.of(2000, 4, 4), "viajando", "defensor", true, 2);
    Futbolista futbolista3 = new Futbolista("Francisco", "Garcia", 56745632, LocalDate.of(1999, 2, 25), "en concentracion", "defensor", true, 3);
    Futbolista futbolista4 = new Futbolista("Tomas", "Lopez", 456356, LocalDate.of(1998, 3, 15), "viajando", "defensor", true, 7);
    Futbolista futbolista5 = new Futbolista("Ulises", "Sanches", 764467, LocalDate.of(1998, 3, 28), "en concentracion", "defensor", true, 9);
    Futbolista futbolista6 = new Futbolista("Carlos", "Perez", 113153, LocalDate.of(1999, 12, 22), "en pais de origen", "mediocampista", true, 17);
    Futbolista futbolista7 = new Futbolista("Tisiano", "Gomez", 452365, LocalDate.of(1989, 11, 21), "en concentracion", "mediocampista", true, 11);
    Futbolista futbolista8 = new Futbolista("Federico", "Ruiz", 456766, LocalDate.of(1989, 4, 12), "en concentracion", "mediocampista", true, 3);
    Futbolista futbolista9 = new Futbolista("Fausto", "Alonso", 357648, LocalDate.of(1989, 5, 15), "viajando", "delantero", true, 20);
    Futbolista futbolista10 = new Futbolista("Alan", "Jimenez", 43146, LocalDate.of(1999, 6, 8), "viajando", "delantero", true, 40);
    Futbolista futbolista11 = new Futbolista("Mariano", "Vasquez", 4455764, LocalDate.of(1989, 5, 12), "en pais de origen", "delantero", true, 39);
    Entrenador entrenador = new Entrenador("Juan", "Dominguez", 122233, LocalDate.of(1970, 5, 3), "viajando", 233342);

    Contingente equipo_argentina = new Contingente("Argentina");
    equipo_argentina.agregarIntegrante(masajista1);
    equipo_argentina.agregarIntegrante(masajista2);
    equipo_argentina.agregarIntegrante(masajista3);
    equipo_argentina.agregarIntegrante(futbolista1);
    equipo_argentina.agregarIntegrante(futbolista2);
    equipo_argentina.agregarIntegrante(futbolista3);
    equipo_argentina.agregarIntegrante(futbolista4);
    equipo_argentina.agregarIntegrante(futbolista5);
    equipo_argentina.agregarIntegrante(futbolista6);
    equipo_argentina.agregarIntegrante(futbolista7);
    equipo_argentina.agregarIntegrante(futbolista8);
    equipo_argentina.agregarIntegrante(futbolista9);
    equipo_argentina.agregarIntegrante(futbolista10);
    equipo_argentina.agregarIntegrante(futbolista11);
    equipo_argentina.agregarIntegrante(entrenador);

    equipo_argentina.verIntegrantes();

    equipo_argentina.veriSiIntegranteEstaDisponible(futbolista2);
    equipo_argentina.veriSiIntegranteEstaDisponible(futbolista6);
  }
}