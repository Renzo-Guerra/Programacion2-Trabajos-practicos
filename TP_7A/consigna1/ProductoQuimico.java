package TP_7A.consigna1;

import java.util.ArrayList;

public class ProductoQuimico {
  private String nombre;
  private ArrayList<Cultivo> cultivosDesaconsejados;
  private ArrayList<String> estadosPatologicos;

  public ProductoQuimico(String nombre_producto_quimico){
    setNombre(nombre_producto_quimico);
    cultivosDesaconsejados = new ArrayList<>();
    estadosPatologicos = new ArrayList<>();
  }

  public void agregarCultivoDesaconsejado(Cultivo nuevoCultivoDesaconsejado){
    if((nuevoCultivoDesaconsejado != null) && !cultivosDesaconsejados.contains(nuevoCultivoDesaconsejado)){
      cultivosDesaconsejados.add(nuevoCultivoDesaconsejado);
    }
  }

  public void agregarEstadoPatologico(String nuevoEstadoPatologico){
    if((nuevoEstadoPatologico != null) && !estadosPatologicos.contains(nuevoEstadoPatologico)){
      estadosPatologicos.add(nuevoEstadoPatologico);
    }
  }

  // Setters
  public void setNombre(String nombre) {this.nombre = nombre;}

  // Getters
  public String getNombre() {return nombre;}

  /**
   * Verifica que el producto quimico sea capaz de tratar todos los estados patologicos de la enfermedad
   * @param enfermedad a verificar sus estados patologicos
   * @return true / false
   */
  public boolean puedeTratarEnfermedad(Enfermedad enfermedad){
    return estadosPatologicos.containsAll(enfermedad.getEstadosPatologicos());
  }

  /**
   * Verifica que el cultivo NO esté dentro de los cultivos desaconsejados del producto químico.
   * @param cultivo a verificar.
   * @return true / false.
   */
  public boolean sePuedeAplicar(Cultivo cultivo){
    return !cultivosDesaconsejados.contains(cultivo);
  }

  /**
   * Dado un ArrayList De enfermedades, verifica si el producto quimico es 
   * eficaz contra almenos 1 de las enfermedades frecuentes.
   * @param enfermedadesFrecuentes a evaluar.
   * @return true / false.
   */
  public boolean trataAlgunaEnfermedadFrecuente(ArrayList<Enfermedad> enfermedadesFrecuentes){
    for (Enfermedad enfermedadActual : enfermedadesFrecuentes) {
      if(puedeTratarEnfermedad(enfermedadActual))
        return true;
    }

    return false;
  }

  @Override
  public String toString() {
    return "Nombre: " + this.nombre + ", cultivos desaconsejados: " + this.cultivosDesaconsejados + ", estados patologicos: " + this.estadosPatologicos + "\n";
  }
}
