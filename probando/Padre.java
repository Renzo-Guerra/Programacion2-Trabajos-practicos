package probando;

public class Padre {
  protected int valor;

  public Padre(int valor){
    setValor(valor);
  } 
  protected void setValor(int valor){
    this.valor = valor;
  }

  protected int getValor(){
    return this.valor;
  }
}
