package TP_4.consigna2;

public class Luz {
  private boolean luces_prendidas;

  public Luz(){
    this.luces_prendidas = false;
  }

  public boolean getEstanLucesPrendidas(){return this.luces_prendidas;}
  /**
   * Imprime por consola si las luces estan prendidas o apagadas
   */
  public void imprimirEstadoDeLaLuz(){System.out.println((getEstanLucesPrendidas())? "Las luces estan prendidas": "Las luces estan apagadas");}
  public void apagar(){this.luces_prendidas = false;}
  public void encender(){this.luces_prendidas = true;}
}
