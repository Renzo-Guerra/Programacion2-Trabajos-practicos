package TP_6.consigna3;

import TP_6.consigna3.colaEspera.ColaDeEspera;

public class Puerto {
  private ColaDeEspera camiones;
  private ColaDeEspera barcos;

  public Puerto(){
    camiones = new ColaDeEspera();
    barcos = new ColaDeEspera();
  }

  public void agregarCamion(Camion nuevoCamion){
    camiones.agregarElemento(nuevoCamion);
  }

  public void agregarBarco(Barco nuevoBarco){
    barcos.agregarElemento(nuevoBarco);
  }

  public ColaDeEspera getBarcos(){return barcos;}
  public ColaDeEspera getCamiones(){return camiones;}

  public void cargarBarco(){
    if(barcos.laColaEstaVacia()){ System.out.println("No hay barcos en la cola."); return;} 
    if(camiones.laColaEstaVacia()){ System.out.println("No hay camiones en la cola."); return;}

    Barco barco = (Barco)barcos.pop();
    Camion camion = (Camion)camiones.pop();

    System.out.println("Al barco {" + barco + "} se le cargó el contenido del camion {" + camion + "}");
  }
}
