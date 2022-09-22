package consigna1;

/*
  * NOTA: 
  * - La pila que voy a implementar es de tipo ESTATICA (Tiene un limite de capacidad (Debido a que estoy usando vectores)).
  *
  * - IMPORTANTE: Tecnicamente no se eliminan valores
  *   
  *   ej: si yo tengo esta pila -> 4, 6, 7, 4, null, null, null   
  *   Por defecto, al crear la pila de x elementos, los x elementos creados se le almacenan un null (O valores basura, no recuerdo bien). 
  *
  * El size es de 4, pero yo al usar pop(), se resta 1 al size, pero el 4 sigue existiendo (Solo que no se puede acceder).
  * No me molesta igual, porq cuando agreguen un nuevo Objeto lo va a sobreescribir.
*/

public class PilaVector {
  private Object[] elementos;
  private int cant_elementos_almacenados; // Con arraylist tenemos el metodo size(), aca tenemos que hacerlo a lo rustico (contando)
  /**
   * Instancia una PilaVector
   * @param cant_maxima_elementos que va a almacenar la pila
   */
  public PilaVector(int cant_maxima_elementos){
    elementos = new Object[cant_maxima_elementos]; // Ahora el size es del tamaño especificado por el usuario
    cant_elementos_almacenados = 0;
  }

  /**
   * Agrega un elemento a la pila, como la pila guarda Object, no verifico si es null o si ya esta en la Pila
   * @param nuevo_objeto a agregar a la pila
   */
  public void push(Object nuevo_objeto){
    if(size() < maxCapacidad()){
      elementos[size()] = nuevo_objeto;
      contadorSumar();
    }
  }
  /**
   * La cantidad maxima de elementos que puede almacenar la Pila
   * @return la maxima capacidad de elementos.
   */
  public int maxCapacidad(){return elementos.length;}

  // Incrementar y decrementar el contador de elementos almacenados
  private void contadorSumar(){cant_elementos_almacenados++;}
  private void contadorRestar(){cant_elementos_almacenados--;}

  /**
   * En caso de ser posible, devuelve el ultimo elemento agregado y lo elimina de esta
   * @return el ultimo elemento agregado
   */
  public Object pop(){
    // Valiodacion en caso de que la pila este vacia:
    if(size() == 0) return "La pila esta vacia...";
    // Obtenemos el ultimo elemento
    Object elemento_devolver = top();
    // Disminuimos el contador de elementos
    contadorRestar();
    
    return elemento_devolver;
  }

  /**
   * En caso de ser posible, devuelve el ultimo elemento agregado.
   * @return el ultimo elemento agregado
   */
  public Object top(){
    if(size() == 0) return "La pila esta vacia...";
    Object elemento_devolver = elementos[size()-1];
    return elemento_devolver;
  }

  /**
   * 
   * @return cantidad de elementos almacenados
   */
  public int size(){
    return cant_elementos_almacenados;
  }

  /**
   * Retorna una nueva pila con una copia de los elementos de la pila original, en el mismo orden.
   * @return nueva pila identica a la original
   */
  public PilaVector copy(){
    // Se instancia un vector de la misma capacidad que el original
    PilaVector copia = new PilaVector(maxCapacidad());
    // Copiamos todos los objetos
    for (Object object : elementos) {
      copia.push(object);
    }
    
    return copia;
  }
  public PilaVector reverse(){
    // Se instancia un vector de la misma capacidad que el original
    PilaVector invertida = new PilaVector(maxCapacidad());

    // Insertamos los valores de los elementos en orden invertido (por eso empezamos desde el final)
    for(int pos_actual = (maxCapacidad()-1);pos_actual >= 0; pos_actual--){
      invertida.push(elementos[pos_actual]);
    }

    return invertida;
  }

  /**
   * Imprime todos los elementos de la Pila (Es de demostracion nomas)
   */
  public void verElementos(){
    System.out.println("\nElementos del objeto: ");
    for (Object object : elementos) {
      System.out.println(object);
    }
  }
}