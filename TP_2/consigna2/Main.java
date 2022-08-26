package TP_2.consigna2;

import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {
    Usuario user_1 = new Usuario("Marcos", "1234", "marquitos@gmail.com");
    Usuario user_2 = new Usuario("Graciela", "12231", "laGraci@gmail.com");
    Usuario user_3 = new Usuario("Agustin", "111", "aGusto@hotmail.com");
    LocalDateTime inicio = LocalDateTime.of(2022, 8, 30, 15, 30);
    LocalDateTime fin = LocalDateTime.of(2022, 8, 30, 18, 21);
    Usuario[] participantes = {user_1, user_2};
    Usuario[] asistentes = {user_3};
    Reunion reunion_x = new Reunion("Tandil", "Album qatar 2022", inicio, fin, participantes, asistentes);
    Reunion[] reuniones  = {reunion_x};
    Agenda agenda = new Agenda(user_1, reuniones);
    
    mostrarInfoUsuario(user_1);
    mostrarInfoReunion(reunion_x);

  }

  public static void mostrarInfoUsuario(Usuario user){
    System.out.println("Su nombre es: " + user.getNombre());
    System.out.println("Su contacto es: " + user.getContacto_telefonico());
    System.out.println("Su mail es: " + user.getMail());
  }

  public static void mostrarInfoReunion(Reunion reunion){
    // Almacenamos la duracion
    String duracion = reunion.getDuracion();
    System.out.println((duracion != null)? duracion : "Error al calcular la duracion"); 
    System.out.println("La reunion es en: " + reunion.getLugar());
    System.out.println("El tema a tratar es: " + reunion.getTema_tratar());
  }
}
