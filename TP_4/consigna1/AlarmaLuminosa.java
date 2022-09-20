package TP_4.consigna1;

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
    if (!getEstanSanosLosVidrios() || !getEstanBloqueadasLasEntradas() || getMovimientoEnCasa()){
      this.timbre.hacerSonar();
      this.luz.encender();
    }
    System.out.println(this);
  }

}
