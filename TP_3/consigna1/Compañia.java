package TP_3.consigna1;

import java.util.ArrayList;

public class Compañia{
  private ArrayList<EncuestaSinC> encuestas_sin_completar;
  private ArrayList<EncuestaC> encuestas_completadas;
  private ArrayList<Empleado> empleados; // Guarda los dni's de los empleados (No me deja crear un ArrayList de tipo "Long")

  public Compañia(EncuestaSinC[] encuestas_sin_completar, Empleado[] nuevos_empleados){
    // Inicializando los ArrayList
    this.encuestas_sin_completar = new ArrayList<>();
    this.encuestas_completadas = new ArrayList<>();
    this.empleados = new ArrayList<>();

    addEncuestasBase(encuestas_sin_completar);
    addEmpleados(nuevos_empleados);
  }

  /**
   * Dado un array de encuestas base, agrega las encuestas validos (Que no sean null, ni que ya esten presente en la lista de encuestas base)
   * @param encuestas_sin_completar son las encuestas a añadir a la lista de encuestas base.
   */
  public void addEncuestasBase(EncuestaSinC[] encuestas_sin_completar){
    // Se valida que no sea null
    if(encuestas_sin_completar != null){
      // Se valida que el array contenga algun elemento
      if (encuestas_sin_completar.length > 0){
        for (EncuestaSinC nueva_encuesta : encuestas_sin_completar) {
          addNuevaEncuestaBase(nueva_encuesta);
        }
      }
    }
  }

  /**
   * Agrega una encuesta base a la lista (Solo si no es null, ni ya se encuentra cargado en la lista)
   * @param encuesta_a_agregar es la encuesta base a agregar.
   */
  public void addNuevaEncuestaBase(EncuestaSinC encuesta_a_agregar){
    // Se valida que el objeto no sea null, ni que ya se encuentre ese objeto en la lista de empleados (Compara por el id de la encuesta).
    if((encuesta_a_agregar != null) && (!encuestas_sin_completar.contains(encuesta_a_agregar))){
      encuestas_sin_completar.add(encuesta_a_agregar);
    }
  }

  /**
   * Dado un array de empleados, agrega los empleados validos (Que no sean null, ni que ya esten presente en la lista de empleados)
   * @param nuevos_empleados es el array de empleados a agregar.
   */
  public void addEmpleados(Empleado[] nuevos_empleados){
    // Se valida que no sea null
    if(nuevos_empleados != null){
      // Se valida que el array contenga algun elemento
      if (nuevos_empleados.length > 0){
        for (Empleado nuevo_empleado : nuevos_empleados) {
          addEmpleado(nuevo_empleado);
        }
      }
    }
  }

  /**
   * Agrega un empleado a la lista (Solo si no es null, ni ya se encuentra cargado en la lista)
   * @param nuevo_empleado es el empleado a agregar.
   */
  public void addEmpleado(Empleado nuevo_empleado){
    // Se valida que el objeto no sea null, ni que ya se encuentre ese objeto en la lista de empleados (Compara por el DNI).
    if((nuevo_empleado != null) && (!empleados.contains(nuevo_empleado))){
      empleados.add(nuevo_empleado);
    }
  }

  public String verEmpleados(){
    String respuesta = "{Empleados: ";
    Empleado[] empleados_arr = new Empleado[empleados.size()];
    empleados.toArray(empleados_arr);
    for (Empleado empleado_actual : empleados_arr) {
      respuesta+= "{" + empleado_actual + "} ";
    }
    respuesta += "}";

    return respuesta;
  }

  public String verEncuestasSinCompletar(){
    String respuesta = "{Encuestas sin completar (base): ";
    EncuestaSinC[] encuestas_arr = new EncuestaSinC[encuestas_sin_completar.size()];
    encuestas_sin_completar.toArray(encuestas_arr);
    for (EncuestaSinC encuesta_actual : encuestas_arr) {
      respuesta+= "{" + encuesta_actual + "} ";
    }
    respuesta += "}";

    return respuesta;
  }

  public String verEncuestasCompletadas(){
    String respuesta = "{Encuestas completadas: ";
    EncuestaC[] encuestas_arr = new EncuestaC[encuestas_completadas.size()];
    encuestas_completadas.toArray(encuestas_arr);
    for (EncuestaC encuesta_actual : encuestas_arr) {
      respuesta+= "{" + encuesta_actual + "} ";
    }
    respuesta += "}";

    return respuesta;
  }

  /**
   * Dada una encuesta completada, se evalua si se agrega o no a la lista de encuestas completadas
   * @param encuesta_completada_a_agregar es la encuesta completada a añadir a la lista, esta no debe haber sido
   * completada anteriormente por la misma persona (Se verifica por el id de la encuesta y el DNI del encuestado)
   */
  public void registrarEncuesta(EncuestaC encuesta_completada_a_agregar){
    // Validamos que no sea nula
    if(encuesta_completada_a_agregar != null){
      // Se verifica que el encuestado no haya realizado esa encuesta en el pasado.
      if(!encuestas_completadas.contains(encuesta_completada_a_agregar)){
        encuestas_completadas.add(encuesta_completada_a_agregar);
      }
    }
  }
}