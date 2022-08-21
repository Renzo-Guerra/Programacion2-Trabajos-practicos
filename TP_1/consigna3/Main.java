package TP_1.consigna3;

public class Main {
  public static void main(String[] args) {
    PuntoGeometrico punto_a = new PuntoGeometrico();
    PuntoGeometrico punto_b = new PuntoGeometrico(4.32f, 2.41f);

    punto_a.mostrarCoordenadasPunto();
    punto_b.mostrarCoordenadasPunto();
    System.out.println("La distancia euclidea es de: " + punto_a.calcularDistanciaEuclidea(3.2, 6.3));;
  }
}
