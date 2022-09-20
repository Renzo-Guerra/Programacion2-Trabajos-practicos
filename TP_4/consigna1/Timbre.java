package TP_4.consigna1;

public class Timbre {
  private boolean sonando;

  public Timbre(){
    this.sonando = false;
  }

  public boolean getEstaSonandoElTimbre(){return this.sonando;}

  private void encenderTimbre(){this.sonando = true;}
  private void apagarTimbre(){this.sonando = false;}

  /**
   * Hace sonar el pitido del timbre
   */
  public void hacerSonar(){
    encenderTimbre();
    System.out.println("PIIIIIIIIIIIIIIII!!!!");
  }

  
  /**
   * Detiene el pitido del timbre
   */
  public void dejarDeSonar(){
    apagarTimbre();
    System.out.println("El timbre dejó de sonar");
  }
}
