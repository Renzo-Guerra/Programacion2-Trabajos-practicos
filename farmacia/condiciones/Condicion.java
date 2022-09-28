package farmacia.condiciones;

import farmacia.Medicamento;

public abstract class Condicion {
  public abstract boolean esValida(Medicamento medicamento);
}
