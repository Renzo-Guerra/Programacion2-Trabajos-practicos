package TP_7A.consigna1.filtro;

import TP_7A.consigna1.Cultivo;
import TP_7A.consigna1.ProductoQuimico;

public class CondicionCultivo extends Condicion{
  private Cultivo cultivo;

  public CondicionCultivo(Cultivo cultivo){
    this.cultivo = cultivo;
  }

  @Override
  public boolean esValido(ProductoQuimico productoQuimico) {
    return productoQuimico.sePuedeAplicar(cultivo);
  }
  
}
