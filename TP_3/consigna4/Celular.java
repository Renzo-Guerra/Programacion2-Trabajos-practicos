package TP_3.consigna4;

import java.util.ArrayList;

public class Celular {
  private ArrayList<Contacto> contactos;

  public Celular(){
    contactos = new ArrayList<>();
  }

  /**
   * Agrega un contacto, sin importar si ya esta agendado en la lista de contactos
   * @param nuevo_contacto a agregar a lista de contactos
   */
  public void agregarContacto(Contacto nuevo_contacto){
    if(nuevo_contacto != null){
      contactos.add(nuevo_contacto);
    }
  }

  /**
   * Lista TODOS los contactos agendados (aunque esten repetidos o tengan el mimso numero de telefono)
   */
  public void listarTodosLosContactos(){
    System.out.println("Contactos: ");
    // Le paso "contactos" para que los imprima (YA SE QUE NO SE VAN A MODIFICAR EN NINGUN ASPECTO, por eso no realizo una copia)
    imprimirArrayList(contactos);
  }

  private void imprimirArrayList(ArrayList<Contacto> contactos){
    for (Contacto contacto : contactos) {
      System.out.println(contacto);
    }
    System.out.println("");
  }

  /**
   * Muestra todos los contactos que esten repetidos en el celular
   */
  public void listarSoloContactosRepetidos(){
    // Se realiza una copia de los contactos (Esto debido a que la vamos a filtrar)
    ArrayList<Contacto> contactos_copia = new ArrayList<>(contactos);

    int indice_actual = 0;
    while(indice_actual < contactos_copia.size()){
      /*
       * Elimina TODOS los contactos que no esten repetidos.
       * Logica: Busca el primer y ultimo indice del objeto, en caso de que coincidan, quiere decir 
       * que solo se encuentra 1 vez, si estos son diferentes, quiere decir que minimo aparece 2 veces.
       * Se aumenta el indice nomas cuando NO se elimina un elemento, ya que al eliminarse un elemento, 
       * el array hace un corrimiento a izquierda, por lo tanto en la posicion actual en la proxima 
       * iteracion va a tener un nuevo elemento.
       * 
       * NOTA: Intenté usar un foreach en vez de un while, el problema? Al usar foreach, el tamaño del 
       * ArrayList sobre el cual se esta iterando, no se modifica al eliminar un elemento, entonces al llegar 
       * al final, intentaremos ingresar en una posicion que no existe dentro del ArrayList...
      */ 

      Contacto contacto_actual = contactos_copia.get(indice_actual);
      if(contactos_copia.indexOf(contacto_actual) == contactos_copia.lastIndexOf(contacto_actual)){
        contactos_copia.remove(contacto_actual);
      }else{
        indice_actual++;
      }
    }

    // Ahora dentro de 'contactos_copia' solo se encuentran contactos repetidos
    System.out.println("Contactos repetidos: ");
    imprimirArrayList(contactos_copia);
  }

  /**
   * Muestra TODOS los contactos que no tengan un numero de telefono 'unico' (que ningun otro contacto tenga)
   */
  public void listarContactosMismoNumTelefonico(){
    // Se realiza una copia de los contactos (Esto debido a que la vamos a filtrar)
    ArrayList<Contacto> contactos_copia = new ArrayList<>(contactos);
    // ArrayList donde se guardaran los contactos repetidos
    ArrayList<Contacto> contactos_numeros_repetidos = new ArrayList<>();

    int indice_actual = 0;
    while(indice_actual < contactos_copia.size()){
      // Seleccionamos de la lista el indice actual que estamos
      Contacto contacto_actual = contactos_copia.get(indice_actual);
      /*
       * Buscamos en las proximas posiciones (por eso 'indice_actual' + 1) a las que actualmente nos encontramos TODOS 
       * los contactos que posean el mismo numero de telefono que el que tenemos, iremos 
       * eliminando y al mismo tiempo guardando todos los repetidos, activando la 'bandera' 
       * 'hay_repetidos' (De esta forma tambien eleminaremos y almacenaremos el contacto de 'indice_actual').
      */
      int indice_restantes = indice_actual + 1;
      boolean hay_repetidos = false;
      while(indice_restantes < contactos_copia.size()){
        Contacto contacto_comparado = contactos_copia.get(indice_restantes);
        if(contacto_comparado.getNumTelefono() == contacto_actual.getNumTelefono()){
          // Activamos el flag para tambien eliminar 'contacto_actual'
          hay_repetidos = true;
          // Eliminamos el contacto por delante de 'contacto_actual' que tenga el mismo 
          // numero y lo agregamos a 'contactos_numeros_repetidos'
          contactos_numeros_repetidos.add(contactos_copia.remove(indice_restantes));
        }else{
          indice_restantes++;
        }
      }

      if(hay_repetidos){
        contactos_numeros_repetidos.add(contactos_copia.remove(indice_actual));
      }else{
        indice_actual++;
      }
    }

    // Se muestran todos los contactos que no tengan un numero de telefono 'unico'.
    System.out.println("Contactos con el mismo numero: ");
    imprimirArrayList(contactos_numeros_repetidos);
  }
}