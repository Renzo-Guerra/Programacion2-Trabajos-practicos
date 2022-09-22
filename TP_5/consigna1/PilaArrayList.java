package consigna1;

import java.util.ArrayList;

/*
  * NOTA: 
  * - La pila que voy a implementar es de tipo DINAMICA (ya que no tiene limitantes en capacidad (debido a que voy a usar ArrayList)).
  * - Al usar un vector para almacenar, seria de caracter ESTATICO (Tiene un limite de capacidad).
*/

public class PilaArrayList {
  private ArrayList<Object> elementos;
  /**
   * Instancia una Pila vacia
   */
  public PilaArrayList(){
    elementos = new ArrayList<>();
  }

  /**
   * Agrega un elemento a la pila, como la pila guarda Object, no verifico si es null o si ya esta en la Pila
   * @param nuevo_objeto a agregar a la pila
   */
  public void push(Object nuevo_objeto){
    elementos.add(nuevo_objeto);
  }

  /**
   * En caso de ser posible, devuelve el ultimo elemento agregado y lo elimina de esta
   * @return el ultimo elemento agregado
   */
  public Object pop(){
    // Valiodacion en caso de que la pila este vacia:
    if(size() == 0) return "La pila esta vacia...";

    // Al usar el metodo remove(index) elimina el metodo del ArrayList, pero al mismo tiempo lo "devuelve" (return)
    return elementos.remove(size()-1);
  }

  /**
   * En caso de ser posible, devuelve el ultimo elemento agregado.
   * @return el ultimo elemento agregado
   */
  public Object top(){
    if(size() == 0) return "La pila esta vacia...";
    return elementos.get(size()-1);
  }

  /**
   * 
   * @return cantidad de elementos almacenados
   */
  public int size(){
    return elementos.size();
  }

  /**
   * Retorna una nueva pila con una copia de los elementos de la pila original, en el mismo orden.
   * @return nueva pila identica a la original
   */
  public ArrayList<Object> copy(){
    return new ArrayList<Object>(elementos);
  }
  public ArrayList<Object> reverse(){
    ArrayList<Object> invertida = new ArrayList<>();
    // En caso de que esté vacia
    if(elementos.size()==0) return invertida;

    // Insertamos los valores de los elementos en orden invertido (por eso empezamos desde el final)
    for(int pos_actual = (size()-1);pos_actual >= 0; pos_actual--){
      invertida.add(elementos.get(pos_actual));
    }

    return invertida;
  }
}
