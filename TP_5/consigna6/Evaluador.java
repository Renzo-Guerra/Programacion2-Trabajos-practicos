package consigna6;

import java.util.ArrayList;

public class Evaluador {
  private String nombre;
  private String apellido;
  private long dni;
  protected ArrayList<String> conocimientos;
  private ArrayList<Trabajo> trabajos;
  // Caracteristicas x que te clasifican como un "experto"
  private String[] conocimientos_especificos = {"agentes", "visualizacion", "redes de comunicacion", "POO", "IA"};

  public Evaluador(String nombre, String apellido, long dni){
    setNombre(nombre);
    setApellido(apellido);
    setDni(dni);
    conocimientos = new ArrayList<>();
    trabajos = new ArrayList<>();
  }
  
  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setApellido(String apellido){this.apellido = apellido;}
  public void setDni(long dni){this.dni = dni;}
  
  // Getters
  public String getNombre(){return nombre;}
  public String getApellido(){return apellido;}
  public long getDni(){return dni;}

  public void agregarConocimiento(String nuevo_conocimiento){
    if((nuevo_conocimiento != null) && ((!conocimientos.contains(nuevo_conocimiento)))){
      this.conocimientos.add(nuevo_conocimiento);
    }
  }

  public void agregarTrabajo(Trabajo nuevo_trabajo){
    if((nuevo_trabajo != null) && ((!trabajos.contains(nuevo_trabajo)))){
      // Solo permite agregarlo si el evaluador es apto
      if(nuevo_trabajo.elEvaluadorEsApto(this)){
        this.trabajos.add(nuevo_trabajo);
      }else{
        System.out.println("No se agrego el trabajo, el evaluador no es apto.");
      }
    }
  }

  public int getCantidadTrabajosAsignados(){
    return this.trabajos.size();
  }

  /**
   * Determina si un evaluador es experto o no, con tener uno de los conocimientos
   * especificados, ya cuenta como "experto".
   * @return "experto" / "general".
   */
  public String getCalificacion(){
    for (String conocimiento_especifico : conocimientos_especificos) {
      if(conocimientos.contains(conocimiento_especifico))
        return "experto";
    }

    return "general";
  }

  @Override
  public String toString() {
    return "Nombre: " + getNombre() + ", apellido: " + getApellido() + ", dni: " + getDni() + ", conocimientos: " + this.conocimientos + "\n";
  }
}
