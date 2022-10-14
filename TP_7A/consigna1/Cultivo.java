package TP_7A.consigna1;

import java.util.ArrayList;

public class Cultivo {
  private String nombre;
  private ArrayList<Enfermedad> enfermedadesFrecuentes;

  public Cultivo(String nombre){
    setNombre(nombre);
    enfermedadesFrecuentes = new ArrayList<>();
  }

  // Setters
  public void setNombre(String nombre) {this.nombre = nombre;}
  
  // Getters
  public String getNombre() {return nombre;}
  public ArrayList<Enfermedad> getEnfermedadesFrecuentes() {return new ArrayList<>(enfermedadesFrecuentes);}

  public void agregarEnfermedad(Enfermedad nuevaEnfermedad){
    // Validacion
    if((nuevaEnfermedad == null) || enfermedadesFrecuentes.contains(nuevaEnfermedad)) return;
    enfermedadesFrecuentes.add(nuevaEnfermedad);
  }

  /**
   * Dado un "ProductoQuimico", se evalua si el quimico se puede utilizar 
   * en el cultivo, ademas de verificar que el quimico sea eficaz contra 
   * alguna de las enfermedades recurrentes de la planta.
   * @param productoQuimico a evaluar.
   * @return true / false.
   */
  public boolean puedeSerDeUtilidad(ProductoQuimico productoQuimico){
    return (productoQuimico.sePuedeAplicar(this) && productoQuimico.trataAlgunaEnfermedadFrecuente(this.getEnfermedadesFrecuentes()));
  }

  @Override
  public String toString() {
    return "Nombre: " + this.nombre;
  }
}
