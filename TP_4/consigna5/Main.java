package TP_4.consigna5;

import java.time.LocalDate;

import TP_4.consigna5.producto.*;

/**
 * 
 * ductos llevan esta * información común: fecha de vencimiento y número de lote.
 *  A su vez, cada tipo de producto lleva alguna información específica. Los productos frescos deben llevar la fecha 
 * de envasado y la granja de origen. Los productos refrigerados deben llevar el código del organismo de supervisión 
 * alimentaria, la fecha de envasado, la temperatura de mantenimiento recomendada y la granja de origen. 
 * 
 * NOTAS:
 *  - La ProductoFresco es la clase "padre", de ProductoRefrigerado.
 *  - Dentro de "informacion especifica" estaban los atributos "fecha envasado" y "granja", entonces los movi como "informacion comun" 
 *  (Todas las clases los necesitaban, entonces directamente "subi(jerarquicamente)" esos 2 atributos) 
 *  - La clase ProductoRefrigerado es la clase "padre" de "productoCongeladoAgua", "productoCongeladoAire" y de "productoCongeladoNitrogeno"
 */

public class Main {
  public static void main(String[] args) {
    // Productos frescos
    ProductoFresco producto1 = new ProductoFresco("tomate", LocalDate.of(2022, 9, 18), LocalDate.of(2022, 9, 30), "el tomaco", 24);
    ProductoFresco producto2 = new ProductoFresco("lechuga de manteca", LocalDate.of(2022, 9, 18), LocalDate.of(2022, 9, 28), "el lechugon", 22);
    ProductoFresco producto3 = new ProductoFresco("salmon", LocalDate.of(2022, 9, 20), LocalDate.of(2022, 9, 24), "el bagre feliz", 26);
    ProductoFresco producto4 = new ProductoFresco("manzana", LocalDate.of(2022, 9, 21), LocalDate.of(2022, 9, 25), "mas sanita", 13);
    // Productos Refrigerados
    ProductoRefrigerado producto5 = new ProductoRefrigerado("leche", LocalDate.of(2022, 6, 14), LocalDate.of(2024, 2, 23), "el granjero Barry", 22, "AAASDWS", 14);
    ProductoRefrigerado producto6 = new ProductoRefrigerado("queso", LocalDate.of(2022, 4, 22), LocalDate.of(2022, 12, 12), "el granjero Barry", 22, "BBBSE2", 14);
    ProductoRefrigerado producto7 = new ProductoRefrigerado("mayonesa", LocalDate.of(2022, 5, 13), LocalDate.of(2024, 11, 20), "Hellmanns", 13, "RRRTR", 16);
    ProductoRefrigerado producto8 = new ProductoRefrigerado("mostaza", LocalDate.of(2022, 5, 22), LocalDate.of(2024, 11, 1), "savora", 30, "RRRTR", 15);
    // Productos congelados agua
    ProductoCongeladoAgua producto9 = new ProductoCongeladoAgua("palito agua frutilla", LocalDate.of(2022, 5, 22), LocalDate.of(2022, 9, 22), "granja de helados??", 12, "NNJNN", -14, 0.3);
    ProductoCongeladoAgua producto10 = new ProductoCongeladoAgua("palito de naranja", LocalDate.of(2022, 5, 22), LocalDate.of(2022, 9, 22), "granja de helados??", 12, "NNJNN", -14, 0.3);
    // Productos congelados aire
    ProductoCongeladoAire producto11 = new ProductoCongeladoAire("patamuslo", LocalDate.of(2022, 9, 20), LocalDate.of(2022, 11, 22), "el granjero Barry", 56, "LLLOOO", -12, 23, 14, 30, 33);
    ProductoCongeladoAire producto12 = new ProductoCongeladoAire("patamuslo deshuesada", LocalDate.of(2022, 9, 20), LocalDate.of(2022, 11, 22), "el granjero Barry", 56, "LLLOOO", -12, 23, 14, 33, 30);
    // Productos congelados nitrogeno
    ProductoCongeladoNitrogeno producto13 = new ProductoCongeladoNitrogeno("falda", LocalDate.of(2022, 9, 20), LocalDate.of(2023, 1, 20), "el granjero Barry", 22, "LLLOOO", -13, "metodo A", 14);
    ProductoCongeladoNitrogeno producto14 = new ProductoCongeladoNitrogeno("vacio", LocalDate.of(2022, 9, 20), LocalDate.of(2023, 2, 23), "el granjero Barry", 22, "LLLOOO", -13, "metodo B", 8);

    Empresa empresa = new Empresa();
    
    empresa.agregarProducto(producto1);
    empresa.agregarProducto(producto2);
    empresa.agregarProducto(producto3);
    empresa.agregarProducto(producto4);
    empresa.agregarProducto(producto5);
    empresa.agregarProducto(producto6);
    empresa.agregarProducto(producto7);
    empresa.agregarProducto(producto8);
    empresa.agregarProducto(producto9);
    empresa.agregarProducto(producto10);
    empresa.agregarProducto(producto11);
    empresa.agregarProducto(producto12);
    empresa.agregarProducto(producto13);
    empresa.agregarProducto(producto14);

    empresa.mostrarTodosLosProductos();
    empresa.imprimirEtiquetaDeProducto(producto12);
  }
}
