package TP_3.consigna1;

public class Main {
  public static void main(String[] args) {
    // Se crean las preguntas de las encuestas "base" (Las que no estan completadas)
    String[] preguntas_encuesta_1 = {"¿Dónde cree que debería realizarse el próximo festival de folclore?", "¿Cómo haría usted una selección de personal?", "¿Qué deportes son más saludables y por qué?"};
    String[] preguntas_encuesta_2 = {"¿Tiene garantía?", "¿Realmente necesito este producto o servicio?", "¿Cuánto dinero cuesta la adquisición de este producto?", "¿Cómo empiezo?"};
    
    // Se crean las encuestas "base"
    EncuestaSinC encuesta1SC = new EncuestaSinC(1, preguntas_encuesta_1);
    EncuestaSinC encuesta2SC = new EncuestaSinC(2, preguntas_encuesta_2);
    EncuestaSinC[] encuestas_base = {encuesta1SC, encuesta2SC};

    // Se testean los metodos de la clase EncuestaSinC.
    mostrarInfoEncuestaSinC(encuesta1SC);

    // Se crean los empleados
    Empleado[] empleados = {new Empleado(12345654, "Raul"), new Empleado(34652456, "Flavio")};
    
    // Se crea la compañia
    Compañia comp = new Compañia(encuestas_base, empleados);
    
    // Se testean los metodos de la clase Compañia
    mostrarInfoCompañia(comp);

    /*
     * Se crean encuestas completadas (Para que se añadan las encuestas a la lista, deben de tener una encuesta base 
     * existente en la lista de encuestas base, el dni del encuestado no debe aparecer en la lista de encuestas completadas con la 
     * misma encuesta YA completada, el empleado debe existir en la lista de empleados)
    */
    EncuestaC encuesta1C = new EncuestaC(encuesta1SC, 23444555, new Empleado(34652456, "Flavio"));
    EncuestaC otra_vez_encuesta1C = new EncuestaC(encuesta1SC, 23444555, new Empleado(34652456, "Flavio"));

    // Se testean los metodos de la clase EncuestaC.
    mostrarInfoEncuestaC(encuesta1C);
    // Se añade la encuesta encuesta1C a la lista de encuestas completadas, ya que es valida
    comp.registrarEncuesta(encuesta1C);
    // Se intenta agregar, pero como ya hay una encuesta con el mismo id y mismo DNI, no se agrega.
    comp.registrarEncuesta(otra_vez_encuesta1C); 
    // Se muestran las encuestas completadas.
    System.out.println("- " + comp.verEncuestasCompletadas());
  }

  public static void mostrarInfoEncuestaSinC(EncuestaSinC encuesta){
    System.out.println("Probando metodos de EncuestaSinC: ");
    System.out.println("- Toda la info de la encuesta es: " + encuesta);
    System.out.println("- El id de la encuesta es: " + encuesta.getId());
    System.out.println("- Las preguntas de la encuesta son: " + encuesta.getPreguntas());
    System.out.println("");
  }

  public static void mostrarInfoEncuestaC(EncuestaC encuesta){
    System.out.println("Probando encuestaC: ");
    System.out.println("- Dni del encuestado: " + encuesta.getDniEncuestado());
    System.out.println("- Empleado que realizo la encuesta: " + encuesta.getEmpleado());
    System.out.println("- Id de la encuesta respondida: " + encuesta.getEncuestaRespondida());
    System.out.println("");
  }

  public static void mostrarInfoCompañia(Compañia compañia){
    System.out.println("Probando compañia: ");
    System.out.println("- " + compañia.verEmpleados());
    compañia.addEmpleado(new Empleado(34652456, "Diego")); // A este no lo agrega porq ya hay un empleado con ese DNI
    compañia.addEmpleado(new Empleado(12432555, "Diego"));
    compañia.addEmpleado(new Empleado(12432666, "Diego")); // Agregue 2 empleados llamados Diego, no hay problema porq compara por DNI
    System.out.println("- " + compañia.verEmpleados());
    System.out.println("- " + compañia.verEncuestasSinCompletar());
    System.out.println("- " + compañia.verEncuestasCompletadas()); // No va a mostrar nada porq por el momento no hay ninguna añadida
    System.out.println("");
  }
}
