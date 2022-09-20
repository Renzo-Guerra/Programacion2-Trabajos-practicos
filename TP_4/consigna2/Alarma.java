package TP_4.consigna2;

import java.util.ArrayList;

public class Alarma{
  ArrayList<Sensor> sensores;
  protected Timbre timbre; // Al hacerlo protected, la AlarmaLuminoza tambien puede usar un Timbre

  public int cantidadSensores(){
    return this.sensores.size();
  }

  /**
   * Instancia una alarma con un arraylist de sensores (vacio) y crea un timbre (el cual sonará 
   * si hay alguna irregularidad con algun sensor)
   */
  public Alarma(){
    sensores = new ArrayList<>();
    timbre = new Timbre();
  }
  
  /**
   * Agrega un nuevo sensor a la alarma (de forma que si el sensor tiene una irregularidad 
   * accionará el timbre)
   * @param nuevo_sensor a agregar
   */
  public void agregarSensor(Sensor nuevo_sensor){
    if(nuevo_sensor != null){
      sensores.add(nuevo_sensor);
    }
  }

  public ArrayList<Sensor> obtenerSensoresIrregulares(){
    ArrayList<Sensor> sensores_con_alertas = new ArrayList<>();

    for (Sensor sensor : sensores) {
      if(sensor.getExisteUnaIrregularidad()){
        sensores_con_alertas.add(sensor);
      }
    }

    return sensores_con_alertas;
  }

  /**
   * Comprueba que todos los sensores no tengan ninguna irregularidad, 
   * caso contrario, imprimirá todos los sensores con irregularidades.
   */
  public void comprobar(){
    ArrayList<Sensor> sensores_con_alertas = new ArrayList<>(obtenerSensoresIrregulares());

    if(sensores_con_alertas.size() == 0){
      System.out.println("No hay ninguna irregularidad :D !!!\n");
    }else{
      this.timbre.hacerSonar();
      System.out.println("Sensores con irregularidades: ");
      imprimirSensores(sensores_con_alertas);
    }
  }

  protected void imprimirSensores(ArrayList<Sensor> sensores){
    for (Sensor sensor : sensores) {
      System.out.println(sensor);
    }
  }

  /**
   * Imprime por pantalla todos los sensores de la alarma
   */
  public void imprimirTodosLosSensores(){
    imprimirSensores(new ArrayList<>(sensores));
  }

  public void desactivarAlarma(){
    if(timbre.getEstaSonandoElTimbre()){
      timbre.dejarDeSonar();
    }else{
      System.out.println("La alarma ya esta apagada, no puede apagarse");
    }
  }
}