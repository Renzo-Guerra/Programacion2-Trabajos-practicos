package farmacia;

import java.util.ArrayList;

import farmacia.condiciones.Condicion;

public class Farmacia{
  private String nombre;
  private ArrayList<Medicamento> medicamentos;

  public Farmacia(String nombre){
    medicamentos = new ArrayList<>();
    setNombre(nombre);
  }
  public void setNombre(String nombre) {this.nombre = nombre;}
  public String getNombre() {return nombre;}

  /**
   * Agrega un medicamento a la lista de medicamentos de la farmacia.
   * @param nuevo_medicamento (Medicamento) a añadir.
   */
  public void agregarMedicamento(Medicamento nuevo_medicamento){
    if((nuevo_medicamento != null) && (!medicamentos.contains(nuevo_medicamento))){
      medicamentos.add(nuevo_medicamento);
    }
  }

  public ArrayList<Medicamento> getMedicamentos(Condicion condicion) {
    ArrayList<Medicamento> resultados = new ArrayList<>();
    for (Medicamento medicamento : medicamentos) {
      if(condicion.esValida(medicamento)){
        resultados.add(medicamento);
      }
    }

    return resultados;
  }
}