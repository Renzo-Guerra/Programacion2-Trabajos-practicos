package consigna2;

public class CasaSangrePura extends Casa{

  public CasaSangrePura(String nombre_de_la_casa, int capacidad_maxima_alumnos) {
    super(nombre_de_la_casa, capacidad_maxima_alumnos);
  }
  
  /**
   * Agrega un alumno a los alumnos de la casa
   * @param nuevo_alumno a agregar a la casa
   */
  public void agregarAlumno(Alumno nuevo_alumno){
    // Valido que haya espacio en la casa.
    if(casaLlena()){System.out.println("La casa " + this.getNombre() + " ya esta llena."); return;}
    if(nuevo_alumno.getCasaPerteneciente() != ""){System.out.println(nuevo_alumno.getNombre() + " ya pertenece a la casa: " + nuevo_alumno.getCasaPerteneciente());}
    // Valido que el alumno tenga todas las cualidades requeridas que pide la casa.
    if(!estaCalificado(nuevo_alumno)){
      System.out.println(nuevo_alumno.getNombre() + " no posee con todas las cualidades de la casa " + this.getNombre()); 
      this.imprimirCualidades();
      nuevo_alumno.imprimirCualidades();
      return;
    }
    // Valido que un familiar del alumno este en la lista de alumnos de la casa.
    if(!tieneFamiliarEnLaCasa(nuevo_alumno)){System.out.println(nuevo_alumno.getNombre() + " no posee ningun familiar en la casa " + this.getNombre()); return;}

    // En caso de que las validaciones no salten, lo agrego a la lista de alumnos de la casa
    nuevo_alumno.setCasaPerteneciente(this.getNombre());
    alumnos.add(nuevo_alumno);
  }

  /**
   * Verifica que un familiar del alumno este en la lista de alumnos de la casa.
   * NO se verifica al revez (que uno de la lista de alumnos de la casa tenga el mismo nombre y apellido que un familiar del alumno) porque 
   * podria pasar que el alumno tenga un familiar con el mismo nombre y apellido de la lista de alumnos de esta casa PERO que pertenezca a otra casa.
   * @param alumno_comprobar los familiares pertenecientes a la casa
   * @return true / false
   */
  public boolean tieneFamiliarEnLaCasa(Alumno alumno_comprobar){
    // Recorro todos los 
    for (Alumno familiar_alumno_actual : alumno_comprobar.familiares_concurrentes) {
      if(alumnos.contains(familiar_alumno_actual)){
        return true;
      }
    }

    return false;
  }

  /**
   * Debido a que se verifica si ya tiene un familiar anotado en esa casa, YA DEBE  de existir alguno anotado, y nunca va a pasar amenos que 
   * se tengan registros anteriores que al implementar el sistema. Esta funcion "simula" hermanos mayores que ya hayan pasado por la prueba 
   * (teniendo un lineaje completo)
   */
  public void agregarFamiliarHARDCODEADO(Alumno alumno_hardcodeado){
    if(alumno_hardcodeado != null){
      alumnos.add(alumno_hardcodeado);
    }
  }
}
