package TP_1.consigna3;

public class Main {
  public static void main(String[] args) {
    PuntoGeometrico punto_a = new PuntoGeometrico();
    PuntoGeometrico punto_b = new PuntoGeometrico(4.32f, 2.41f);
    PuntoGeometrico punto_c = new PuntoGeometrico(7, 8);

    System.out.println("Coordenadas del punto_a: ");
    punto_a.mostrarCoordenadasPunto();
    punto_a.desplazarPuntoEnElPlano(2, 5);
    System.out.println("Coordenadas del punto_a: ");
    punto_a.mostrarCoordenadasPunto();
    System.out.println("Coordenadas del punto_b: ");
    punto_b.mostrarCoordenadasPunto();
    System.out.println("Coordenadas del punto_c: ");
    punto_c.mostrarCoordenadasPunto();
    System.out.println("La distancia euclidea es de: " + punto_a.calcularDistanciaEuclidea(3.2, 6.3));;
    System.out.println("Dado los 2 puntos instanciados, la distancia euclidea es de: " + punto_a.calcularDistanciaEuclidea(punto_c));
  }
}
