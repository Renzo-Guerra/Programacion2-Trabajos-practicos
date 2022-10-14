package TP_7A.consigna1.filtro;

import TP_7A.consigna1.ProductoQuimico;

public class CondicionAnd extends Condicion{
  private Condicion c1;
  private Condicion c2;

  public CondicionAnd(Condicion c1, Condicion c2){
    this.c1 = c1;
    this.c2 = c2;
  }

	@Override
	public boolean esValido(ProductoQuimico productoQuimico) {
		return c1.esValido(productoQuimico) && c2.esValido(productoQuimico);
	}
}
