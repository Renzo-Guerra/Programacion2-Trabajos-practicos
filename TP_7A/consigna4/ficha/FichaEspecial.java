package TP_7A.consigna4.ficha;

public class FichaEspecial extends Ficha{
  public FichaEspecial(String nombre, int fortaleza, int espacio){
    super(nombre, fortaleza, espacio, 0);
  }
  
  @Override
  public double getPoderDestruccion(){
    // Sino hace la division entre int, dando como resultado un int (En vez de un double)
    return (double)this.getFortaleza() / (double)this.getEspacio();
  }

}
