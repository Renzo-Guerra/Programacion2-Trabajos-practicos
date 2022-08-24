package TP_1.consigna3;

public class Main {
  public static void main(String[] args) {
    // Testing metodos de la clase PuntoGeometrico
    // PuntoGeometrico punto_a = new PuntoGeometrico();
    // PuntoGeometrico punto_b = new PuntoGeometrico(4.32f, 2.41f);
    // PuntoGeometrico punto_c = new PuntoGeometrico(7, 8);

    // System.out.println("Coordenadas del punto_a: ");
    // punto_a.mostrarCoordenadasPunto();
    // punto_a.desplazarPuntoEnElPlano(2, 5);
    // System.out.println("Coordenadas del punto_a: ");
    // punto_a.mostrarCoordenadasPunto();
    // System.out.println("Coordenadas del punto_b: ");
    // punto_b.mostrarCoordenadasPunto();
    // System.out.println("Coordenadas del punto_c: ");
    // punto_c.mostrarCoordenadasPunto();
    // System.out.println("La distancia euclidea es de: " + punto_a.calcularDistanciaEuclidea(3.2, 6.3));;
    // System.out.println("Dado los 2 puntos instanciados, la distancia euclidea es de: " + punto_a.calcularDistanciaEuclidea(punto_c));

    PuntoGeometrico punto_a = new PuntoGeometrico(3, 6);
    PuntoGeometrico punto_b = new PuntoGeometrico(0, 0);
    Rectangulo rectangulo_1, rectangulo_2;
    float distancia_xa = 13, distancia_ya = 7;
    float distancia_xb = 13, distancia_yb = 7;

    rectangulo_1 = new Rectangulo(punto_a, distancia_xa, distancia_ya);
    rectangulo_2 = new Rectangulo(punto_b, distancia_xb, distancia_yb);
    // Realizar validaciones de metodos
    System.out.println("Coordenadas de los vertices del rectangulo_1: ");
    rectangulo_1.mostrarCoordenadasDeLosVertices();
    System.out.println("\nCoordenadas de los vertices del rectangulo_2: ");
    rectangulo_2.mostrarCoordenadasDeLosVertices();
    System.out.println("Base del rectangulo_2: " + rectangulo_2.calcularBase());
    System.out.println("Altura del rectangulo_2: " + rectangulo_2.calcularAltura());
    System.out.println("\nNuevas coordenadas de los vertices del rectangulo_1: ");
    rectangulo_1.desplazarRectanguloEnElPlano(10, 10);
    rectangulo_1.mostrarCoordenadasDeLosVertices();
    System.out.println("Base del rectangulo_1: " + rectangulo_1.calcularBase());
    System.out.println("Altura del rectangulo_1: " + rectangulo_1.calcularAltura());
    System.out.println("\nEl rectangulo_1 es mayor al rectangulo_2: " + rectangulo_1.esMayor(rectangulo_2));
    System.out.println("El rectangulo_2 es un cuadrado: " + rectangulo_2.esUnCuadrado());
    System.out.println("El rectangulo_2 esta acostado: " + rectangulo_2.estaAcostado());
  }
}