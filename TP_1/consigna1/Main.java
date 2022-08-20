package TP_1.consigna1;

/*
 * Para que el programe tome la fecha de nacimiento ingresada,
 * debe seguir el patron "yyyy-MM-dd" ej: "1997-12-23"
 * NO se puede ingresar ni meses ni dias con solo 1 numero, 
 * se deberá hacer utilizando "02", o "09"
 * 
 * La altura aunque se muestre en metros, usted debe ingresarla
 * en centimetros.
 * El peso debe ir indicado en KG
*/

public class Main {
  public static void main(String[] args) {
    int dni_ingresar = 24504877;
    String nombre = "Franco";
    String fecha_nacimiento = "2009-08-03"; // Ingresar "1999-2-4" estaria mal, "1999-2-03" MAL, "1999-02-3" MAL
    char sexo = 'm';
    int altura = 191;
    int peso = 90;

    Persona sujeto_1 = new Persona(dni_ingresar, nombre, fecha_nacimiento, sexo, altura, peso);
    
    System.out.println("\nInformacion del sujeto_1: ");
    sujeto_1.mostrarDatos();
  }
}