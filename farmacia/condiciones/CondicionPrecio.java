package farmacia.condiciones;

import farmacia.Medicamento;

public class CondicionPrecio extends Condicion{
  private double precio;

  public CondicionPrecio(double precio){
    this.precio = precio;
  }
  @Override
  public boolean esValida(Medicamento medicamento){
    return medicamento.getPrecio() == precio;
  }
}
