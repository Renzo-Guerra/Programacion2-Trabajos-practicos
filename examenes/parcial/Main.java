package examenes.parcial;

public class Main {
  public static void main(String[] args) {
    Portal portal = new Portal();

    NoticiaPatrocinada np1 = new NoticiaPatrocinada("asd", "noticiaPatrocinada1", "luis", "comedia");
    np1.agregarPalabra("audio");
    np1.agregarPalabra("milagro");
    np1.agregarPalabra("cielo");
    np1.agregarPalabra("peligro");
    np1.agregarPalabra("abundante");

    System.out.println("Palabras claves de noticia: ");
    System.out.println(np1.getPalabrasClaves());
    System.out.println("");
    NoticiaPatrocinada np2 = new NoticiaPatrocinada("qwe", "noticiaPatrocinada2", "miguel", "terror");
    np2.agregarPalabra("filo");
    np2.agregarPalabra("teclado");
    np2.agregarPalabra("mesa");
    NoticiaPatrocinada np3 = new NoticiaPatrocinada("tyu", "noticiaPatrocinada3", "luis", "fantacia");
    np3.agregarPalabra("silla");
    np3.agregarPalabra("filo");
    np3.agregarPalabra("tecla");
    NoticiaPatrocinada np4 = new NoticiaPatrocinada("hjk", "noticiaPatrocinada4", "pedro", "realismo magico");
    np4.agregarPalabra("escritorio");
    np4.agregarPalabra("monte");
    np4.agregarPalabra("hoja");

    Noticia n1 = new Noticia("qw", "titulo1", "pedro", "suspenso");
    n1.agregarPalabra("libro");
    n1.agregarPalabra("libreria");
    n1.agregarPalabra("libro");
    Noticia n2 = new Noticia("rt", "titulo2", "luis", "terror");
    n2.agregarPalabra("casi");
    n2.agregarPalabra("hogera");
    n2.agregarPalabra("jugo");
    Noticia n3 = new Noticia("ty", "titulo3", "francisco", "drama");
    n3.agregarPalabra("fuego");
    n3.agregarPalabra("hielo");
    n3.agregarPalabra("elementos");
    n3.agregarPalabra("tierra");
    Noticia n4 = new Noticia("yu", "titulo4", "miguel", "comedia");
    n4.agregarPalabra("saco");
    n4.agregarPalabra("boxeo");
    n4.agregarPalabra("inspiracion");
    Noticia n5 = new Noticia("ii", "titulo5", "luis", "comedia");
    n5.agregarPalabra("dedicacion");
    n5.agregarPalabra("constancia");
    n5.agregarPalabra("esfuerzo");

    Seccion s1 = new Seccion(2);
    Seccion s2 = new Seccion(3);
    s1.agregar(n1);
    s1.agregar(n2);
    s1.agregar(n4);
    s1.agregar(s2);
    s1.agregar(np1);
    s1.agregar(np4);
    s1.agregar(np3);

    System.out.println("Palabras claves de seccion 1: ");
    System.out.println(s1.getPalabrasClaves());
    System.out.println("");
    System.out.println("Categoria de seccion 1: " + s1.getCategoria());
    System.out.println("");

    s2.agregar(n2);
    s2.agregar(n3);
    s2.agregar(n4);
    s2.agregar(n1);
    s2.agregar(n2);

    SeccionPrimeras sp1 = new SeccionPrimeras(3, "humor");
    sp1.agregar(n2);
    sp1.agregar(n4);
    sp1.agregar(s1);
    SeccionPrimeras sp2 = new SeccionPrimeras(2, "terror");
    sp2.agregar(sp1);
    sp2.agregar(n2);
    sp2.agregar(s2);
    sp2.agregar(s1);

    portal.agregar(n1);
    portal.agregar(np3);
    portal.agregar(sp1);
    portal.agregar(sp2);
    portal.agregar(s2);

    System.out.println("Noticias del portal donde la categoria es comedia: ");
    System.out.println(portal.getNoticiasWhere(new CondCategoria("comedia")));
  }
}
