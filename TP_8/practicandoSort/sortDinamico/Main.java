package TP_8.practicandoSort.sortDinamico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import TP_8.practicandoSort.sortDinamico.comparator.ComparatorApellido;
import TP_8.practicandoSort.sortDinamico.comparator.ComparatorEdad;
import TP_8.practicandoSort.sortDinamico.comparator.ComparatorNombre;

public class Main {
  public static void main(String[] args) {
    System.out.println("\n\n\nOrdenamiento en objetos creados por nosotros:");

    // Instanciacion de las personas
    Persona persona1 = new Persona("Juan", "Aguirre", 22);
    Persona persona2 = new Persona("Miguel", "Torres", 45);
    Persona persona3 = new Persona("Pedro", "Gonzales", 44);
    Persona persona4 = new Persona("Agustin", "Villar", 22);
    Persona persona5 = new Persona("Sofia", "Martinez", 21);
    Persona persona6 = new Persona("Andrea", "Rodriguez", 54);
    // Se agregan las personas a la lista
    ArrayList<Persona> personas = new ArrayList<>();
    personas.add(persona1);
    personas.add(persona2);
    personas.add(persona3);
    personas.add(persona4);
    personas.add(persona5);
    personas.add(persona6);

    System.out.println("Personas ordenadas por default: ");
    System.out.println(personas);
    System.out.println("");
    
    /**
     * Se crean los diferentes tipos de comparator
     * (Tranquilamente los podia instancias dentro de "Collections.sort()" pero pintó)
     */
    ComparatorApellido compApellido = new ComparatorApellido();
    ComparatorNombre compNombre = new ComparatorNombre();
    ComparatorEdad compEdad = new ComparatorEdad();

    System.out.println("Personas ordenadas por nombre: ");
    System.out.println(ordenarPor(personas, compNombre));
    System.out.println("");
    
    System.out.println("Personas ordenadas por apellido: ");
    System.out.println(ordenarPor(personas, compApellido));
    System.out.println("");

    System.out.println("Personas ordenadas por edad: ");
    System.out.println(ordenarPor(personas, compEdad));
    System.out.println("");
  }

  /**
   * Dado una lista de personas, las ordenas acorde al comparador pasado por parametro.
   * @param listaOriginal a la cual se copiará para modificarle el orden.
   * @param comparador por el cual se ordenara la lista.
   * @return copia de la lista original organizada en base al comparator pasado como argumento.
   */
  public static ArrayList<Persona> ordenarPor(ArrayList<Persona> listaOriginal, Comparator<Persona> comparador){
    ArrayList<Persona> resultado = new ArrayList<>(listaOriginal);
    Collections.sort(resultado, comparador);
    
    return resultado;
  }
}
