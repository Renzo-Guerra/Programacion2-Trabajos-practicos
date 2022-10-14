package TP_6.consigna4.ejercicio2;

import TP_6.consigna4.colaEspera.ColaDeEspera;

public class CentroComputo {
  private ColaDeEspera computadoras;
  private ColaDeEspera procesos;

  public CentroComputo(){
    computadoras = new ColaDeEspera();
    procesos = new ColaDeEspera();
  }

  /**
   * Agrega una nueva computadora a la cola de espera
   * @param nueva_computadora a agregar
   */
  public void agregarComputadora(Computadora nueva_computadora){
    if(nueva_computadora != null){
      computadoras.agregarElemento(nueva_computadora);
      if(!procesos.laColaEstaVacia()){
        Proceso proceso = (Proceso) procesos.pop();
        Computadora computadora = (Computadora) computadoras.pop();
        System.out.println("La computadora '" + computadora.getNombre() + "' empezó a ejecutar un proceso.");
        computadora.ejecutarProceso(proceso);
        // Una vez termina de ejecutar el proceso, lo agrega a la cola 
        // (El unico problema de hacerlo asi, es que no se hace de forma asincrona, siempre ejecuta la misma pc por decirlo así)
        computadoras.agregarElemento(computadora);
      }
    }
  }

  /**
   * Agrega un nuevo proceso a la cola de espera
   * @param nuevo_proceso a agregar
   */
  public void agregarProceso(Proceso nuevo_proceso){
    if(nuevo_proceso != null){
      if(!computadoras.laColaEstaVacia()){
        Computadora compu = (Computadora) computadoras.pop();
        System.out.println("La computadora '" + compu.getNombre() + "' empezó a ejecutar un proceso.");
        compu.ejecutarProceso(nuevo_proceso);
        // Cuando la computadora termina de ejecutar el proceso lo vuelve a agregar a la cola de computadoras
        computadoras.agregarElemento(compu);
      }else{
        // En caso de que no haya computadoras disponibles, se almacenan los procesos en una cola.
        procesos.agregarElemento(nuevo_proceso);
      }
    }
  }

  /**
   * Devuelve la siguiente computadora de la cola.
   * @return (ElementoCola) computadoras.pop() devuelve un "ElementoCola", por eso lo parseamos.
   */
  public Computadora getSiguienteComputadora(){
    return (Computadora) computadoras.pop();
  }

  /**
   * Devuelve el siguiente proceso de la cola.
   * @return (ElementoCola) procesos.pop() devuelve un "ElementoCola", por eso lo parseamos.
   */
  public Proceso getSiguienteProceso(){
    return (Proceso) procesos.pop();
  }
}
