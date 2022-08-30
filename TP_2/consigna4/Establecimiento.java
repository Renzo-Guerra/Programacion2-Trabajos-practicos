package TP_2.consigna4;

import java.util.ArrayList;

public class Establecimiento {
  private int precio_x_hora_cancha_futbol;
  private int precio_x_hora_cancha_paddle;
  public static final String CANCHA_FUTBOL = "futbol";
  public static final String CANCHA_PADDLE = "paddle";

  private ArrayList<Usuario> usuarios = new ArrayList<>();
  private ArrayList<Usuario> socios = new ArrayList<>();
  private ArrayList<Cancha> canchas_de_futbol = new ArrayList<>();
  private ArrayList<Cancha> canchas_de_paddle = new ArrayList<>();
  
  // Constructor
  public Establecimiento(Cancha[] canchas_de_futbol, Cancha[] canchas_de_paddle){
    this.precio_x_hora_cancha_futbol = 400;
    this.precio_x_hora_cancha_paddle = 100;
    setCanchasDeFutbol(canchas_de_futbol);
    setCanchasDePaddle(canchas_de_paddle);
  }

  // Setters
  private void setCanchasDeFutbol(Cancha[] canchas_de_futbol) {
    for (Cancha cancha : canchas_de_futbol) {
      agregarCanchaFutbol(cancha);
    }
  }
  private void setCanchasDePaddle(Cancha[] canchas_de_paddle) {
    for (Cancha cancha : canchas_de_paddle) {
      agregarCanchaPaddle(cancha);
    }
  }

  // Getters
  public int getPrecioFutbol(){return this.precio_x_hora_cancha_futbol;}
  public int getPrecioPaddle(){return this.precio_x_hora_cancha_paddle;}
  
  // Metodos varios
  public void agregarCanchaFutbol(Cancha cancha_futbol){
    if(cancha_futbol.getTipoDeCancha() == CANCHA_FUTBOL){
      canchas_de_futbol.add(cancha_futbol);
    }else{
      System.out.println("Error: Solo se pueden agregar canchas de futbol");
    }
  }
  public void agregarCanchaPaddle(Cancha cancha_paddle){
    if(cancha_paddle.getTipoDeCancha() == CANCHA_PADDLE){
      canchas_de_paddle.add(cancha_paddle);
    }else{
      System.out.println("Error: Solo se pueden agregar canchas de paddle");
    }
  }
  public void agregarUsuario(Usuario usuario){
    if(usuario != null){
      usuarios.add(usuario);
    }
  }
  public void mostrarUsuarios(){
    String resultado = "";

    if((usuarios.isEmpty()) || usuarios.size() == 0){
      System.out.println("La lista esta vacia.");
    }else{      
      for (Usuario usuario : usuarios) {
        resultado += "{" + usuario.mostrarInfo() + "}";
      }

      System.out.println(resultado);
    }
  }
  public Cancha elegirCanchaFutbol(int numero){
    // Verificamos que la lista no este vacia.
    if(!canchas_de_futbol.isEmpty()){
      // Recorremos la lista
      for (Cancha cancha : canchas_de_futbol) {
        // En caso que encontremos la cancha de futbol con ese numero de cancha, la devolvemos
        if(cancha.getNumeroDeCancha() == numero){
          return cancha;
        }
      }
    }
    // En caso que la lista este vacia, y/o que no se encuentre dicho numero de cancha, se devolvera null.
    return null;
  }

  public Cancha elegirCanchaPaddle(int numero){
    // Verificamos que la lista no este vacia.
    if(!canchas_de_paddle.isEmpty()){
      // Recorremos la lista
      for (Cancha cancha : canchas_de_paddle) {
        // En caso que encontremos la cancha de paddle con ese numero de cancha, la devolvemos
        if(cancha.getNumeroDeCancha() == numero){
          return cancha;
        }
      }
    }
    // En caso que la lista este vacia, y/o que no se encuentre dicho numero de cancha, se devolvera null.
    return null;
  }
}
