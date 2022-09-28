package farmacia.condiciones;

import farmacia.Medicamento;

public class CondicionNombre extends Condicion{
  private String nombre;

  public CondicionNombre(String nombre){
    this.nombre = nombre;
  }

  @Override
  public boolean esValida(Medicamento medicamento) {  
    return medicamento.getNombre() == this.nombre;
  }
}
