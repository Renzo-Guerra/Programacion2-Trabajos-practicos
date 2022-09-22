package consigna2;

import java.util.ArrayList;

public class Casa {
  private String nombre;
  private int max_capacidad;
  private ArrayList<String> cualidades;
  protected ArrayList<Alumno> alumnos;

  /**
   * Instancia una nueva Casa, esta posee un ArrayList de alumnos y otro de cualidades (Ambos vacios)
   * @param nombre_de_la_casa
   * @param capacidad_maxima_alumnos
   */
  public Casa(String nombre_de_la_casa, int capacidad_maxima_alumnos){
    setNombre(nombre_de_la_casa);
    setMaxCapacidad(capacidad_maxima_alumnos);
    cualidades = new ArrayList<>();
    alumnos = new ArrayList<>();
  }
  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setMaxCapacidad(int max_capacidad){this.max_capacidad = max_capacidad;}
  // Getters
  public String getNombre(){return nombre;}
  public int getCantAlumnosPertenecientes(){return this.alumnos.size();}
  public int getMaxCapacidad(){return max_capacidad;}

  /**
   * En caso de que no exista la cualidad en la lista de cualidades y que no sea null, 
   * agrega una cualidad.
   * @param nueva_cualidad a agregar a la lista de cualidades.
   */
  public void agregarCualidad(String nueva_cualidad){
    if((cualidades != null) && (!poseeCualidad(nueva_cualidad))){
      cualidades.add(nueva_cualidad);
    }
  }
  /**
   * Dada una cualidad, verifica si posee esta cualidad en la lista de cualidades
   * @param cualidad_a_comprobar si ya esta registrada en la lista de cualidades
   * @return true (contiene la cualidad) / false (NO contiene la cualidad)
   */
  private boolean poseeCualidad(String cualidad_a_comprobar){
    return (cualidades.contains(cualidad_a_comprobar));
  }
  /**
   * Dada una cualidad (en caso de que exista en la lista de cualidades) la elimina
   * @param cualidad_a_eliminar de la lista de cualidades
   */
  public void eliminarCualidad(String cualidad_a_eliminar){
    cualidades.remove(cualidad_a_eliminar);
  }

  /**
   * Agrega un alumno a los alumnos de la casa
   * @param nuevo_alumno a agregar a la casa
   */
  public void agregarAlumno(Alumno nuevo_alumno){
    // Valido que haya espacio en la casa
    if(casaLlena()){System.out.println("La casa " + this.getNombre() + " ya esta llena."); return;}
    if(nuevo_alumno.getCasaPerteneciente() != ""){System.out.println(nuevo_alumno.getNombre() + " ya pertenece a la casa: " + nuevo_alumno.getCasaPerteneciente());}
    // Valido que el alumno tenga todas las cualidades requeridas que pide la casa
    if(!estaCalificado(nuevo_alumno)){
      System.out.println(nuevo_alumno.getNombre() + " no posee con todas las cualidades de la casa " + this.getNombre()); 
      this.imprimirCualidades();
      nuevo_alumno.imprimirCualidades();
      return;
    }
    
    /**
     * Acabo de aprender que podes usar el return en un metodo void, sirve para las validaciones, para que quede mas "limpio" 
     * (separa los casos indeseables(lo de arriba) de los deseables(lo de abajo)).
     */

    // En caso de que las validaciones no salten, lo agrego a la lista de alumnos de la casa
    nuevo_alumno.setCasaPerteneciente(this.getNombre());
    alumnos.add(nuevo_alumno);
  }
  /**
   * Retorna si la casa esta llena o no
   * @return true / false
   */
  public boolean casaLlena(){
    return (this.alumnos.size() >= this.getMaxCapacidad());
  }
  /**
   * Recorre todas las cualidades de la casa y verifica que el alumno posea cada una de estas.
   * @param alumno_a_evaluar cualidades.
   * @return true (tiene todas las cualidades) / false (NO tiene todas las cualidades)
   */
  public boolean estaCalificado(Alumno alumno_a_evaluar){
    for (String cualidad : cualidades) {
      if(!alumno_a_evaluar.poseeCualidad(cualidad)){
        return false;
      }
    }

    return true;
  }

  /**
   * imprime las cualidades del alumno
   */
  public void imprimirCualidades(){
    System.out.print("Cualidades de la casa " + this.getNombre() + ": ");
    for (String cualidad : cualidades) {
      System.out.print(cualidad + " . ");
    }
    System.out.println("");
  }

  /**
   * 2 casas son iguales cuando tienen el mismo nombre
   */
  @Override
  public boolean equals(Object obj) {
    Casa casa = (Casa)obj;
    return (casa.getNombre() == this.getNombre());
  }

  @Override
  public String toString() {
    return (this.getClass().getSimpleName() + " - Nombre: " + this.getNombre() + ", maxima capacidad: " + this.getMaxCapacidad() + ", cantidad alumnos anotados: " + this.getCantAlumnosPertenecientes());
  }
}
