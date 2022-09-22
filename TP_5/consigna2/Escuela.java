package consigna2;

import java.util.ArrayList;

public class Escuela {
  private String nombre;
  private ArrayList<Casa> casas;

  public Escuela(String nombre_de_la_casa){
    setNombre(nombre_de_la_casa);
    casas = new ArrayList<>();
  }
  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  // Getters
  public String getNombre(){return nombre;}
  
  /**
   * Agrega la casa a la lista de casas que tiene el colegio.
   * Solo se agregaran casas que no esten en la lista de casas de la escuela.
   * Para que 2 casas sean iguales, deben poseer el mismo nombre.
   * @param nueva_casa a agregar
   */
  public void agregarCasa(Casa nueva_casa){
    if((nueva_casa != null) && (!casas.contains(nueva_casa))){
      casas.add(nueva_casa);
    }
  }

  // Mostrar nombres de las casas existentes
  public void verCasas(){
    for (Casa casa : casas) {
      System.out.println(casa);
    }
  }

  public void asignarCasaAleatoriamente(Alumno alumno){
    ArrayList<Casa> casas_disponibles = new ArrayList<>(casas);
    Casa casa_actual;
    System.out.println("");
    System.out.println("--------------------------");
    System.out.println("Asignacion de casa del alumno: " + alumno.getNombre() + " " + alumno.getApellido() + "\n");
    do {
      // Se genera un indice aleatorio de entre las casas almacenadas y no comparadas
      int indice_casa = generarNumeroAleatorio(0, casas_disponibles.size()-1);
      // Removemos el indice de las casas almacenadas
      casa_actual = casas_disponibles.remove(indice_casa);
      // Tratamos de agregar un alumno a la casa
      casa_actual.agregarAlumno(alumno);
      // En caso de que la casa no lo haya tomado, getCasaPerteneciente va a seguir siendo "", por lo tanto volverá a iterar
    } while ((!casas_disponibles.isEmpty()) && (alumno.getCasaPerteneciente() == ""));
    
    if(alumno.getCasaPerteneciente() == ""){
      System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " carece de las cualidades necesarias para acceder a CUALQUIER casa ;-;");
    }else{
      System.out.println("El alumno " + alumno.getNombre() + " " + alumno.getApellido() + " ahora pertenece a la casa '" + alumno.getCasaPerteneciente() + "'.");
    }
    System.out.println("--------------------------");
  }

  private int generarNumeroAleatorio(int min, int max){
    return (int)(Math.random() * (max - min + 1) + min);

  }
}
