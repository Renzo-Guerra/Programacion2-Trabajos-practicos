package TP_7A.consigna1.filtro;

import TP_7A.consigna1.Enfermedad;
import TP_7A.consigna1.ProductoQuimico;

public class CondicionTrataEnfermedad extends Condicion{
  private Enfermedad enfermedad;

  public CondicionTrataEnfermedad(Enfermedad enfermedad){
    this.enfermedad = enfermedad;
  }

  @Override
  public boolean esValido(ProductoQuimico productoQuimico) {
    return productoQuimico.puedeTratarEnfermedad(enfermedad);
  }
}
