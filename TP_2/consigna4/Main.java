package TP_2.consigna4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
  public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
  public static final String CANCHA_FUTBOL = "futbol";
  public static final String CANCHA_PADDLE = "paddle";
  public static void main(String[] args) {
    // Instanciacion de las canchas de futbol
    Cancha[] canchas_futbol = {new Cancha(1, "futbol"), new Cancha(2, "futbol")};
    // Instanciacion de las canchas de paddle
    Cancha[] canchas_paddle = {new Cancha(1, "paddle"), new Cancha(2, "paddle"), new Cancha(3, "paddle"), new Cancha(4, "paddle")};

    // Se crea el establecimiento y se le asignan las canchas (tanto de paddle y de futbol). Tranquilamente se podria crear el establecimiento sin canchas, e ir agregando 1 a 1 con el metodo agregarCanchaPaddle / agregarCanchaFutbol
    Establecimiento establecimiento = new Establecimiento(canchas_futbol, canchas_paddle);
    elegirOpcion(establecimiento);

    establecimiento.agregarUsuario(new Usuario("Juan"));
    // new Turno(Cancha cancha, LocalDate fecha, LocalTime horario_inicial, int cant_horas)
    Turno turno_1 = new Turno(establecimiento.elegirCanchaFutbol(1), LocalDate.of(2022, 9, 20), LocalTime.of(15, 30), 2);
  }

  public static void elegirOpcion(Establecimiento establecimiento){
    final int MENOR_OPCION = 1;
    final int MAYOR_OPCION = 7;
    
    int opcion = 0;
    
    System.out.println("1: Agregar cancha de futbol.");
    System.out.println("2: Agregar cancha de paddle.");
    System.out.println("3: Agregar usuario.");
    System.out.println("4: Mostrar usuarios");
    System.out.println("5: Mostrar socios");
    System.out.println("6: Mostrar canchas de futbol.");
    System.out.println("7: Mostrar canchas de paddle.");
    do {  
      System.out.print("Ingrese la accion que desea realizar: ");
      try {
        opcion = entrada.read();
      } catch (Exception e) {
        // De esta forma, tendra que volver a dijitar
        opcion = MENOR_OPCION - 1;
      }
      if((opcion < MENOR_OPCION) && (opcion > MAYOR_OPCION)){
        System.out.println("Ingrese una opcion valida.");
      }
    } while ((opcion < MENOR_OPCION) && (opcion > MAYOR_OPCION));
    evaluarMensaje(opcion, establecimiento);
  }

  public static void evaluarMensaje(int opcion, Establecimiento establecimiento){
    switch(opcion){
      case 1:{
        Cancha nueva_cancha_futbol = pedirDatosCanchaFutbol();
        establecimiento.agregarCanchaFutbol(nueva_cancha_futbol);
        ;break;
      } 
      case 2:{
        Cancha nueva_cancha_futbol = pedirDatosCanchaFutbol();
        establecimiento.agregarCanchaFutbol(nueva_cancha_futbol);
        ;break;
      } 
      case 3:{
        Usuario nuevo_usuario = pedirDatosUsuario();
        establecimiento.agregarUsuario(nuevo_usuario);
        ;break;
      } 
      case 4: ;break;
      case 5: ;break;
      case 6: ;break;
      case 7: ;break;
    }

    // Volvemos al "inicio"
    elegirOpcion(establecimiento);
  }

  public static Cancha pedirDatosCanchaFutbol(){
    int numero = 0;
    
    do {
      System.out.print("Ingrese el numero de la cancha: ");
      try{
        numero = Integer.valueOf(entrada.read());
      }catch(Exception e){
        System.out.println(e);
      }
    } while (numero <= 0);
    return new Cancha(numero, CANCHA_FUTBOL);
  }

  public static Cancha pedirDatosCanchaPaddle(){
    int numero = 0;
    
    do {
      System.out.print("Ingrese el numero de la cancha: ");
      try{
        numero = Integer.valueOf(entrada.read());
      }catch(Exception e){
        System.out.println(e);
      }
    } while (numero <= 0);
    return new Cancha(numero, CANCHA_PADDLE);
  }
  public static Usuario pedirDatosUsuario(){
    String nombre = null;

    System.out.print("Ingrese el numero del usuario: ");
    try{
      nombre = entrada.readLine();
    }catch(Exception e){
      System.out.println("Nombre invalido");
    }
    
    return new Usuario(nombre);
  }
}
