package consigna1;

import java.util.ArrayList;

public class Main{
  public static void main(String[] args) {
    ArrayList<Object> testing = new ArrayList<>();
    PilaArrayList pila = new PilaArrayList();
    System.out.println("Testeando PilaArrayList: ");
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
    testing = pila.reverse();
    System.out.println(testing);


    PilaVector pila2 = new PilaVector(4);
    // Creamos una PilaVector para testear (de la misma capacidad que pila2)
    PilaVector testing2 = new PilaVector(pila2.maxCapacidad());
    System.out.println("\n\nTesteando PilaVector: ");
    System.out.println(pila2.top());
    System.out.println(pila2.pop());
    pila2.push("Primer objeto");
    pila2.push("Segundo objeto");
    pila2.push(3);
    pila2.push(4.00);
    System.out.println("El tope es: " + pila2.top());
    System.out.println("El objeto que se saco de la pila es: " + pila2.pop());
    System.out.println("El tope es: " + pila2.top());
    System.out.println("El tamaño de la pila es de: " + pila2.size());
    testing2 = pila2.copy();
    testing2.verElementos(); 
    testing2 = pila2.reverse();
    testing2.verElementos(); 
  }
}