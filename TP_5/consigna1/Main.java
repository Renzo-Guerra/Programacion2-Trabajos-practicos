package consigna1;

import java.util.ArrayList;

public class Main{
  public static void main(String[] args) {
    ArrayList<Object> testing = new ArrayList<>();
    PilaArrayList pila = new PilaArrayList();

    System.out.println(pila.top());
    System.out.println(pila.pop());
    pila.push("Primer objeto");
    pila.push("Segundo objeto");
    pila.push(3);
    pila.push(4.00);
    System.out.println("El tope es: " + pila.top());
    System.out.println("El objeto que se saco de la pila es: " + pila.pop());
    System.out.println("El tope es: " + pila.top());
    System.out.println("El tamaño de la pila es de: " + pila.size());
    testing = pila.copy();
    System.out.println(testing);
    testing.clear();
    testing = pila.reverse();
    System.out.println(testing);
  }
}