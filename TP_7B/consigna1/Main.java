package TP_7B.consigna1;

public class Main {
  public static void main(String[] args) {
    Directorio directorioMaestro = new Directorio("Master");
    // ⚡TESTING⚡
    System.out.print("Cantidad de elementos que tiene '" + directorioMaestro.getNombre() + "': ");
    System.out.println(directorioMaestro.getCantidadElementos());
    System.out.print("'" + directorioMaestro.getNombre() + "' pesa: ");
    System.out.println(directorioMaestro.getPeso() + " Kb.");

    // Instanciacion de archivos
    Archivo archivo1 = new Archivo("archivo1", 30);
    Archivo archivo2 = new Archivo("archivo2", 20);
    Archivo archivo3 = new Archivo("archivo3", 60);

    // Instanciacion de un directorio
    Directorio directorio1 = new Directorio("directorio1");
    // Agregando Elementos a 'directorio1'
    directorio1.agregarElemento(archivo1);
    directorio1.agregarElemento(archivo2);

    // Instanciacion de un comprimido
    Comprimido comprimido1 = new Comprimido("comprimido1");
    // Agregando Elementos a 'directorio1'
    comprimido1.agregarElemento(directorio1);
    comprimido1.agregarElemento(archivo2);

    // Instanciacion de un Link
    Link link1 = new Link(directorio1);
  
    // Agregando Elementos al directorio 'Master'
    directorioMaestro.agregarElemento(archivo3);
    directorioMaestro.agregarElemento(directorio1);
    directorioMaestro.agregarElemento(comprimido1);
    directorioMaestro.agregarElemento(link1);
    
    System.out.println("\nYa se agregaron cosas al directorio '" + directorioMaestro.getNombre() + "'.\n");
    
    System.out.print("Cantidad de elementos que tiene '" + directorioMaestro.getNombre() + "': ");
    System.out.println(directorioMaestro.getCantidadElementos());
    System.out.print("'" + directorioMaestro.getNombre() + "' pesa: ");
    System.out.println(directorioMaestro.getPeso() + " Kb.");    
  }
}
