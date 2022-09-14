package TP_3.consigna2;

public class Main {
  public static void main(String[] args) {
    Fabrica fabrica = new Fabrica();

    Producto prod1 = new Producto("mesa", 25.7, 2000, "abeto", "blanco", 35);
    Producto prod2 = new Producto("silla", 15.2, 400, "caoba", "marron", 35);
    Producto prod3 = new Producto("banco", 23.5, 1400, "roble", "negro", 35);
    Producto prod4 = new Producto("mesa", 30, 3000, "pino", "blanco", 35);
    Producto prod5 = new Producto("mesa", 30, 3000, "pino", "blanco", 10);

    fabrica.agregarProducto(prod1);
    fabrica.agregarProducto(prod2);
    fabrica.agregarProducto(prod3);
    fabrica.agregarProducto(prod4);
    fabrica.agregarProducto(prod5);

    fabrica.mostrarProductos();
    System.out.println("La suma del costo de fabricacion de todos los productos en stock es: " + fabrica.verCostoFabricacionTotal());
    System.out.println("La suma del precio de venta de todos los productos en stock es: " + fabrica.verPrecioDeVentaTotal());
  }
}
