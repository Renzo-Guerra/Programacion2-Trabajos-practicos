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
    String fecha_nacimiento = "1989-08-03"; // Ingresar "1999-2-4" estaria mal, "1999-2-03" MAL, "1999-02-3" MAL
    char sexo = 'm';
    int altura = 191;
    int peso = 90;

    // Persona sujeto_1 = new Persona(dni_ingresar);
    // Persona sujeto_2 = new Persona(dni_ingresar, nombre);
    // Persona sujeto_3 = new Persona(dni_ingresar, nombre, fecha_nacimiento);
    // Persona sujeto_4 = new Persona(dni_ingresar, nombre, fecha_nacimiento, sexo);
    // Persona sujeto_5 = new Persona(dni_ingresar, nombre, fecha_nacimiento, sexo, altura);
    Persona sujeto_6 = new Persona(dni_ingresar, nombre, fecha_nacimiento, sexo, altura, peso);
    
    System.out.println("\nInformacion del sujeto_6: ");
    mostrarDatos(sujeto_6);
    System.out.println("El IMC es de: " + sujeto_6.devolverIndiceMasaCorporal());
    System.out.println("Esta en forma: " + sujeto_6.estaEnForma());
    System.out.println("Es su cumpleanios: " + sujeto_6.esSuCumpleanios());
    System.out.println("Es mayor de edad: " + sujeto_6.esMayorDeEdad());
    // System.out.println("\nInformacion del sujeto_2: ");
    // mostrarDatos(sujeto_2);
    // System.out.println("\nInformacion del sujeto_3: ");
    // mostrarDatos(sujeto_3);
    // System.out.println("\nInformacion del sujeto_4: ");
    // mostrarDatos(sujeto_4);
    // System.out.println("\nInformacion del sujeto_5: ");
    // mostrarDatos(sujeto_5);
    // System.out.println("\nInformacion del sujeto_6: ");
    // mostrarDatos(sujeto_6);
  }

  public static void mostrarDatos(Persona sujeto){
    System.out.println("DNI: " + sujeto.getDNI());
    System.out.println("Nombre: " + sujeto.getNombre());
    System.out.println("Fecha de nacimiento: " + sujeto.getFechaNacimiento());
    System.out.println("Edad: " + sujeto.getEdad());
    System.out.println("Sexo: " + sujeto.getSexo());
    System.out.println("Altura: " + sujeto.getAltura());
    System.out.println("Peso: " + sujeto.getPeso());
  }
}