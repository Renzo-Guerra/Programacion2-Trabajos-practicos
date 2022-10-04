package farmacia.condiciones;

import farmacia.Medicamento;

public class CondicionPrecioMaximoPagar extends Condicion{
  private double precio;

  public CondicionPrecioMaximoPagar(double precio){
    this.precio = precio;
  }
  @Override
  public boolean esValida(Medicamento medicamento){
    return medicamento.getPrecio() <= precio;
  }
}
