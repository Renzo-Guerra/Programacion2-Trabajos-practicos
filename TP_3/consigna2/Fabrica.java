package TP_3.consigna2;

import java.util.ArrayList;

public class Fabrica {
  ArrayList<Producto> productos_disponibles;

  public Fabrica(){
    productos_disponibles = new ArrayList<>();
  }

  public void agregarProducto(Producto prod_agregar){
    if(prod_agregar != null){
      productos_disponibles.add(prod_agregar);
    }
  }

  public void eliminarProducto(Producto prod_eliminar){
    productos_disponibles.remove(prod_eliminar);
  }

  public void mostrarProductos(){
    Producto[] productos = new Producto[productos_disponibles.size()];
    productos_disponibles.toArray(productos);
    for (Producto producto : productos) {
      System.out.println("{" + producto + "}");
    }
  }

  public double verCostoFabricacionTotal(){
    double acum = 0;
    
    Producto[] productos = new Producto[productos_disponibles.size()];
    productos_disponibles.toArray(productos);
    for (Producto producto : productos) {
      acum += producto.getCostoFab();
    }

    return acum;
  }

  public double verPrecioDeVentaTotal(){
    double acum = 0;
    
    Producto[] productos = new Producto[productos_disponibles.size()];
    productos_disponibles.toArray(productos);
    for (Producto producto : productos) {
      acum += producto.getPrecio();
    }

    return acum;
  }
}
