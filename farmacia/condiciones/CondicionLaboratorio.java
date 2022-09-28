package farmacia.condiciones;

import farmacia.Medicamento;

public class CondicionLaboratorio extends Condicion{
  private String laboratorio;

  public CondicionLaboratorio(String laboratorio){
    this.laboratorio = laboratorio;
  }

  @Override
  public boolean esValida(Medicamento medicamento) {
    return medicamento.getLaboratorio().equals(this.laboratorio);
  }
  
}
