package consigna6;

public class Main {
  public static void main(String[] args) {
    /*--------- Instanciacion y agregado de "conocimientos" a los evaluadores ---------*/
    Evaluador evaluador1 = new Evaluador("Miguel", "Torres", 8223334);
    evaluador1.agregarConocimiento("algoritmos");
    evaluador1.agregarConocimiento("lenguajes de programacion");
    evaluador1.agregarConocimiento("sumas binarias");
    
    Evaluador evaluador2 = new Evaluador("Agustina", "Perez", 14544455);
    evaluador2.agregarConocimiento("agentes");
    evaluador2.agregarConocimiento("visualizacion");
    evaluador2.agregarConocimiento("redes de comunicacion");
    evaluador2.agregarConocimiento("algoritmos");
    
    /*--------- Instanciacion y agregado de "temas" a los trabajos ---------*/
    // Articulo 
    Trabajo trabajo1 = new Trabajo("Milagros Peña", "articulo");
    trabajo1.agregarTema("algoritmos");
    trabajo1.agregarTema("sumas binarias");
    // En caso de agregar ese tema, ya no se le asigna el trabajo1 al evaluador1 (descomentar y ejecutar para comprobar)
    // trabajo1.agregarTema("diseño web");
    
    // Poster
    Poster poster1 = new Poster("Marley Perez");
    poster1.agregarTema("arte");
    poster1.agregarTema("perspectiva");
    poster1.agregarTema("algoritmos");

    /*--------- Instanciacion y agregado de evaluadores al comité ---------*/
    Comite comite = new Comite();
    comite.agregarEvaluador(evaluador1);
    comite.agregarEvaluador(evaluador2);
    System.out.println("Lista de evaluadores: ");
    System.out.println(comite.getEvaluadores());
    System.out.print("\nPosibles evaluadores para el trabajo: " + trabajo1);
    System.out.println(comite.posiblesEvaluadores(trabajo1));

    System.out.print("\nPosibles evaluadores para el trabajo: " + poster1);
    System.out.println(comite.posiblesEvaluadores(poster1));
    // Agregando los trabajos al evaluador1
    evaluador1.agregarTrabajo(trabajo1);
    evaluador1.agregarTrabajo(poster1);
    System.out.println("");
    System.out.println("La cantidad de trabajos asignados que tiene " + evaluador1.getNombre() + " " + evaluador1.getApellido() + "es de " + evaluador1.getCantidadTrabajosAsignados());
    System.out.println("La cantidad de trabajos asignados que tiene " + evaluador2.getNombre() + " " + evaluador2.getApellido() + "es de " + evaluador2.getCantidadTrabajosAsignados());
    System.out.println("El evaluador " + evaluador1.getNombre() + " " + evaluador1.getApellido() + " es: " + evaluador1.getCalificacion());
    System.out.println("La evaluadora " + evaluador2.getNombre() + " " + evaluador2.getApellido() + " es: " + evaluador2.getCalificacion());
  }
}
