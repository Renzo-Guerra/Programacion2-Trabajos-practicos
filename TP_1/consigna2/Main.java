package TP_1.consigna2;

public class Main {
  public static void main(String[] args) {
    Electrodomestico producto1 = new Electrodomestico("Licuadora");
    Electrodomestico producto2 = new Electrodomestico("Televisor", 25000, "Negro", 4, 9);

    producto1.mostrarDatos();
    producto2.mostrarDatos();
  }
}
