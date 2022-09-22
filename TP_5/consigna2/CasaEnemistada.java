package consigna2;

import java.util.ArrayList;

public class CasaEnemistada extends Casa{
  private ArrayList<Casa> casas_enemigas;

  public CasaEnemistada(String nombre_de_la_casa, int capacidad_maxima_alumnos) {
    super(nombre_de_la_casa, capacidad_maxima_alumnos);
    casas_enemigas = new ArrayList<>();
  }

  public void agregarCasaEnemiga(Casa casa_nueva){
    if((casa_nueva != null) && (!casas_enemigas.contains(casa_nueva))){
      casas_enemigas.add(casa_nueva);
    }
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
    if(puedeEnlistarseEnCasaEnemiga(nuevo_alumno)){System.out.println(nuevo_alumno.getNombre() + " puede enlistarse en una de las casas enemigas..."); return;}
    
    // En caso de que las validaciones no salten, lo agrego a la lista de alumnos de la casa
    nuevo_alumno.setCasaPerteneciente(this.getNombre());
    alumnos.add(nuevo_alumno);
  }

  /**
   * Verifica que un alumno no posea todas las cualidades para "enlistarse" en una casa enemiga
   * @param alumno_evaluar 
   * @return true (Puede enlistarse en una casa enemiga)/ false (NO Puede enlistarse en una casa enemiga)
   */
  public boolean puedeEnlistarseEnCasaEnemiga(Alumno alumno_evaluar){
    for (Casa casa_actual : casas_enemigas) {
      if(casa_actual.estaCalificado(alumno_evaluar)){
        return true;
      }
    }

    return false;
  }
}
