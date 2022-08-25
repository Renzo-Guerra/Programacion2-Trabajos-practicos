package TP_2.consigna1;

public class Main {
  public static void main(String[] args) {
    // Caps de la primera temporada
    Capitulo cap_1 = new Capitulo("Nombre del cap 1", "Descripcion cap 1", 4, false);
    Capitulo cap_2 = new Capitulo("Nombre del cap 2", "Descripcion cap 2", 2, true);
    Capitulo cap_3 = new Capitulo("Nombre del cap 3", "Descripcion cap 3", 7, true);
    // Caps de la segunda temporada
    Capitulo otro_cap_1 = new Capitulo("Nombre del capitulo 1", "Descripcion capitulo 1", 2, true);
    Capitulo otro_cap_2 = new Capitulo("Nombre del capitulo 2", "Descripcion capitulo 2", 1, true);
    // Creo un array para poder crear el objeto temp_1
    Capitulo[] capitulos_temp1 = {cap_1, cap_2, cap_3};
    // Creo un array para poder crear el objeto temp_2
    Capitulo[] capitulos_temp2 = {otro_cap_1, otro_cap_2};
    //Creacion de los objetos de tipo Temporada
    Temporada temp_1 = new Temporada(capitulos_temp1);
    Temporada temp_2 = new Temporada(capitulos_temp2);
    // Creo un array para poder crear el objeto serie_prueba;
    Temporada[] serie = {temp_1, temp_2};
    // Instanciacion de la serie.
    Serie serie_prueba = new Serie("Breaking bad", "Descripcion de la serie en profundidad", serie, "Accion", "Vince Gilligan");

    // Ahora al poner esta linea, la temporada marcara que NO se vieron todos los capitulos, por lo tanto, tampoco se vieron todos los capitulos de la serie
    cap_1.setVisto(false);

    // Mostramos pruebas de los metodos
    System.out.println("Info del cap_1: ");
    mostrarInfoDelCap(cap_1);
    System.out.println("Info del cap_3: ");
    mostrarInfoDelCap(cap_3);
    System.out.println("Info de la temp_1: ");
    mostrarInfoDeLaTemp(temp_1);
    System.out.println("Info de la temp_2: ");
    mostrarInfoDeLaTemp(temp_2);
    System.out.println("La cantidad de caps que se vieron de la serie es de: " + serie_prueba.contarCapsVistos());
    System.out.println("El promedio asignado de todos los caps vistos de la serie es de: " + serie_prueba.calcularPromedio());
    System.out.println("Se vieron todos los capitulos de la serie: " + serie_prueba.vioTodosLosCaps());
  }

  public static void mostrarInfoDelCap(Capitulo cap){
    System.out.println("El titulo del cap es: " + cap.getTitulo());
    System.out.println("La descripcion del cap es: " + cap.getDescripcion());
    System.out.println("El cap fue visto: " + cap.getVisto());
    System.out.println("La calificacion del cap es: " + cap.getCalificaicon());
    System.out.println("");
  }
  public static void mostrarInfoDeLaTemp(Temporada temp){
    System.out.println("Cantidad de capitulos vistos de la temporada: " + temp.contarCapsVistos());
    System.out.println("El promedio de calificacion de los caps vistos de la temporada es: " + temp.promedioCalificaciones());
    System.out.println("Vio todos los capitulos de la temporada: " + temp.vioTodosLosCaps());
    System.out.println("");
  }
}
