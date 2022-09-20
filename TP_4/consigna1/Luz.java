package TP_4.consigna1;

public class Luz {
  private boolean luces_apagadas;

  public Luz(){
    this.luces_apagadas = true;
  }

  public boolean getEstanLucesApagadas(){return this.luces_apagadas;}

  public void apagar(){this.luces_apagadas = false;}
  public void encender(){this.luces_apagadas = true;}
}
