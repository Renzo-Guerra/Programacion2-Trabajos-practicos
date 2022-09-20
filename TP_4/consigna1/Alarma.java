package TP_4.consigna1;

public class Alarma{
  private boolean vidrios_sanos;
  private boolean entradas_cerradas;
  private boolean movimiento_en_casa;
  protected Timbre timbre; // Al hacerlo protected, la AlarmaLuminoza tambien puede usar un Timbre

  public Alarma(){
    this.vidrios_sanos = true;
    this.entradas_cerradas = true; // Consta tanto para las puertas como las ventanas
    this.movimiento_en_casa = false;
    timbre = new Timbre();
  }

  /*
   * Las pongo en protected porque la idea seria que el main esté en otro paquete, cosa que no pueda 
   * acceder a estas funciones (Ya tiene el toString para ver el estado de los atributos de esta alarma)
  */ 
  protected boolean getEstanSanosLosVidrios(){return this.vidrios_sanos;}
  protected boolean getEstanBloqueadasLasEntradas(){return this.entradas_cerradas;}
  protected boolean getMovimientoEnCasa(){return this.movimiento_en_casa;}  

  // Solo estan para manejo facil en los testing
  public void toogleEstanSanosLosVidrios(){this.vidrios_sanos = (getEstanSanosLosVidrios())? false : true;}
  public void toogleEstanBloqueadasLasEntradas(){this.entradas_cerradas = (getEstanBloqueadasLasEntradas())? false : true;}
  public void toogleMovimientoEnCasa(){this.movimiento_en_casa = (getMovimientoEnCasa())? false : true;}

  /**
   * Verifica que los vidrios esten sanos, que las puertas y ventanas esten bloqueadas y que no haya 
   * movimiento en la casa, en el caso de que haya algo irregular el timbre sonará
   */
  public void comprobar(){
    if (!getEstanSanosLosVidrios() || !getEstanBloqueadasLasEntradas() || getMovimientoEnCasa()){
      this.timbre.hacerSonar();
    }
    System.out.println(this);
  }

  public void desactivarAlarma(){
    if(timbre.getEstaSonandoElTimbre()){
      timbre.dejarDeSonar();
    }else{
      System.out.println("La alarma ya esta apagada, no puede apagarse");
    }
  }

  public String toString(){
    // this.getClass().getSimpleName() devuelve el nombre de la clase
    return this.getClass().getSimpleName() + ": {vidrios sanos: " + getEstanSanosLosVidrios() + ", entradas bloqueadas: " + getEstanBloqueadasLasEntradas() + ", hay movimiento en casa: " + getMovimientoEnCasa() + ", sonando: " + this.timbre.getEstaSonandoElTimbre() + "}";
  }
}