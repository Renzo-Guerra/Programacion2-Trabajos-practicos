package TP_7A.consigna1;

import java.util.ArrayList;

import TP_7A.consigna1.filtro.Condicion;

public class Empresa {
  private ArrayList<ProductoQuimico> productos;

  public Empresa(){
    productos = new ArrayList<>();
  }

  public void agregarProducto(ProductoQuimico nuevoProducto){
    if((nuevoProducto == null) || productos.contains(nuevoProducto)) return;
    productos.add(nuevoProducto);
  }

  /**
   * Dada una condicion, devuelve todos los agroquimicos que la cumplan 
   * (Notece que esta condicion puede ser multiple)
   * @param condicion a cumplir
   * @return (ArrayList<ProductoAgroquimico> con todos los productos que cumplen la condicion)
   */
  public ArrayList<ProductoQuimico> getAgroquimicos(Condicion condicion){
    ArrayList<ProductoQuimico> productosQuimicosValidos = new ArrayList<>();
    for (ProductoQuimico productoActual : productos) {
      if(condicion.esValido(productoActual))
        productosQuimicosValidos.add(productoActual);
    }

    return productosQuimicosValidos;
  }
}
