import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Pelicula pelicula1 = new Pelicula("Shrek", "Un ogro llamado Shrek vive en su pantano, pero su preciada soledad se ve súbitamente interrumpida por la invasión de los ruidosos personajes de los cuentos de hadas. Todos fueron expulsados de sus reinos por el malvado Lord Farquaad. Decidido a salvar su hogar, Shrek hace un trato con Farquaad y se prepara para rescatar a la princesa Fiona, quien será la esposa de Farquaad.", "Andrew Adamson", LocalDate.of(2001, 6, 19));
    Pelicula pelicula2 = new Pelicula("Cuestion de tiempo", "Cuando Tim Lake cumple 21 años, su padre le dice un secreto: los hombres de su familia pueden viajar por el tiempo. A pesar de que él no puede cambiar la historia, Tim decide mejorar su vida buscando una novia. Él conoce a Mary, se enamora y finalmente se gana su corazón con los viajes en el tiempo y un poco de astucia. Sin embargo, mientras su inusual vida progresa, Tim descubre que su habilidad especial no puede protegerlos de los problemas diarios de la vida.", "Richard Curtis", LocalDate.of(2013, 11, 7));
    
    Videoclub negocio = new Videoclub();
    System.out.println("Se agregaron las peliculas, pero todavia no se settearon las copias");
    negocio.agregarPelicula(pelicula1);
    negocio.agregarPelicula(pelicula2);
    System.out.println("Peliculas del negocio: ");
    System.out.println(negocio.getTodasLasPeliculas());
    System.out.println("Peliculas del negocio con copias disponibles: ");
    System.out.println(negocio.getPeliculasDisponibles());
    System.out.println("Se crearon las copias de las peliculas");
    pelicula1.agregarCopias(5);
    pelicula2.agregarCopias(1);
    System.out.println("Peliculas del negocio: ");
    System.out.println(negocio.getTodasLasPeliculas());
    System.out.println("Peliculas del negocio con copias disponibles: ");
    System.out.println(negocio.getPeliculasDisponibles());
    
    Cliente cliente1 = new Cliente("Miguel", "Garcia", "2262445566", 22333223);
    cliente1.alquilarCopiaPelicula(pelicula1, 4);
    cliente1.alquilarCopiaPelicula(pelicula2, 4);
    System.out.println("Peliculas a disposicion de " + cliente1.getNombre() + " " + cliente1.getApellido() + ": ");
    System.out.println(cliente1.getCopiasADisposicion());
    System.out.println("Peliculas a disposicion de " + cliente1.getNombre() + " " + cliente1.getApellido() + " vencidas: ");
    System.out.println(cliente1.getCopiasVencidas());
    
    System.out.println("Peliculas del negocio: ");
    System.out.println(negocio.getTodasLasPeliculas());
    System.out.println("Peliculas del negocio con copias disponibles: ");
    System.out.println(negocio.getPeliculasDisponibles());
    System.out.println("El cliente " + cliente1.getNombre() + " " + cliente1.getApellido() + " devuelve la copia de la pelicula " + pelicula1.getTitulo());
    cliente1.devolverCopiaPelicula(0);

    System.out.println("Peliculas del negocio: ");
    System.out.println(negocio.getTodasLasPeliculas());
    System.out.println("Peliculas del negocio con copias disponibles: ");
    System.out.println(negocio.getPeliculasDisponibles());
  }
}
