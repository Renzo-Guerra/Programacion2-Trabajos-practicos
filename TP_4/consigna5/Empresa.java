package TP_4.consigna5;

import java.util.ArrayList;

import TP_4.consigna5.producto.*;

public class Empresa {
  ArrayList<ProductoFresco> productos;

  public Empresa(){
    productos = new ArrayList<>();
  }

  public void agregarProducto(ProductoFresco nuevo_producto){
    if(nuevo_producto != null){
      productos.add(nuevo_producto);
    }  
  }

  public void mostrarTodosLosProductos(){
    if(productos.isEmpty()){
      System.out.println("No existe ningun producto.");
    }else{
      System.out.println("Productos:");
      for (ProductoFresco producto_actual : productos) {
        System.out.println(producto_actual);
      }
    }
  }

  public void imprimirEtiquetaDeProducto(ProductoFresco producto){
    System.out.println("");
    System.out.println("Especificaciones de " + producto.getNombre() + ": ");
    System.out.println(producto);
    System.out.println("");
  }
}
