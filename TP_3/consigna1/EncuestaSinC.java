package TP_3.consigna1;

import java.util.ArrayList;

public class EncuestaSinC {
  private static int menor_encuesta = 1;
  private static int mayor_encuesta = 5;
  private int id;
  private ArrayList<String> preguntas;

  public EncuestaSinC(int id_encuesta, String[] preguntas_a_insertar){
    setIdEncuesta(id_encuesta);
    this.preguntas = new ArrayList<>();
    agregarPreguntas(preguntas_a_insertar);
  }

  /**
   * Setea el id de la encuesta, en caso de que el id este fuera del rango permitido, 
   * se eligira la encuesta valida mas proxima a la ingresada.
   * @param id de la encuesta a crear
   */
  private void setIdEncuesta(int id){
    if((id >= menor_encuesta) && (id <= mayor_encuesta)){
      this.id = id;
    }else{
      this.id = (id > mayor_encuesta)? mayor_encuesta : menor_encuesta;
    }
  }

  private void agregarPreguntas(String[] preguntasAI){
    // Se valida que el array no sea null
    if(preguntasAI.length > 0){
      for (String pregunta : preguntasAI) {
        // Se valida que la pregunta no sea ni null ni " "
        if((!pregunta.isEmpty()) && (!pregunta.isBlank())){
          preguntas.add(pregunta);
        }
      }
    }
  }

  public int getId(){return id;}

  /**
   * 
   * @return un arreglo de Strings, cada indice contiene una pregunta del ArrayList
   */
  public String[] getPreguntasArray(){
    // Creamos un arreglo de tamaño igual al size de "preguntas"
    String[] preguntas_array = new String[preguntas.size()];
    // Creamos una copia de los datos de "preguntas" y los asignamos en preguntas_array
    preguntas.toArray(preguntas_array);

    return preguntas_array;
  }

  /**
   * Devuelve todas las preguntas de la encuesta
   * @return Todas las preguntas en una sola String
   */
  public String getPreguntas() {
    // Creamos un arreglo con las preguntas.
    String[] preguntas_array = getPreguntasArray();
    
    String cadena_devolver = "";
    // Iteramos el array para crear una cadena con todas las preguntas
    for (String pregunta : preguntas_array) {
      cadena_devolver+=pregunta + " ";
    }
    cadena_devolver += "";
    return cadena_devolver;
  }

  @Override
  public String toString(){
    return "{id: " + getId() + ", preguntas: (" + getPreguntas() + ")}";
  }

  @Override
  public boolean equals(Object encuesta_comparada) {
    EncuestaSinC encuesta = (EncuestaSinC) encuesta_comparada;

    return (encuesta.getId() == this.getId()); 
  }
}
