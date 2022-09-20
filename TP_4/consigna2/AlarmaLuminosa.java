package TP_4.consigna2;

import java.util.ArrayList;

public class AlarmaLuminosa extends Alarma{
  private Luz luz;

  public AlarmaLuminosa(){
    super();
    this.luz = new Luz();
  }

  /**
   * Verifica que los vidrios esten sanos, que las puertas y ventanas esten bloqueadas y que no haya 
   * movimiento en la casa, en el caso de que haya algo irregular el timbre sonará y la luz se encenderá
   */
  @Override
  public void comprobar(){
    ArrayList<Sensor> sensores_con_alertas = new ArrayList<>(obtenerSensoresIrregulares());

    if(sensores_con_alertas.size() == 0){
      System.out.println("No hay ninguna irregularidad :D !!!");
    }else{
      this.timbre.hacerSonar();
      this.luz.encender();
      this.luz.imprimirEstadoDeLaLuz();
      System.out.println("Sensores con irregularidades: ");
      imprimirSensores(sensores_con_alertas);
    }
  }
}
