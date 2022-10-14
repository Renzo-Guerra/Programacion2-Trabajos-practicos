package TP_7A.consigna1;

import TP_7A.consigna1.filtro.CondicionAnd;
import TP_7A.consigna1.filtro.CondicionCultivo;
import TP_7A.consigna1.filtro.CondicionTrataEnfermedad;

/**
 * Notas:
 * - Debido a que pide lo de buscar, realicé los filtros correspondientes.
 * - Tanto los nombres de las enfermedades, como el de los cultivos y los productos quimicos 
 *   los deje simples (nombreClase + numero) cosa de simplicidad al debugear en la consola y 
 *   verificar que efectivamente excluye en el condicional doble los cultivos desaconsejables.
 */

public class Main {
  public static void main(String[] args) {
    Empresa empresa = new Empresa();
    // Instanciacion de Enfermedades
    Enfermedad enfermedad1 = new Enfermedad("enfermedad1");
    enfermedad1.agregarEstadoPatologico("destruccion de plantas");
    Enfermedad enfermedad2 = new Enfermedad("enfermedad2");
    enfermedad2.agregarEstadoPatologico("pudriciones de raíz");
    enfermedad2.agregarEstadoPatologico("muerte de plántulas");
    Enfermedad enfermedad3 = new Enfermedad("enfermedad3");
    enfermedad3.agregarEstadoPatologico("pudriciones de raíz");
    Enfermedad enfermedad4 = new Enfermedad("enfermedad4");
    enfermedad4.agregarEstadoPatologico("hojas carcomidas");
    Enfermedad enfermedad5 = new Enfermedad("enfermedad5");
    enfermedad5.agregarEstadoPatologico("hojas carcomidas");
    Enfermedad enfermedad6 = new Enfermedad("enfermedad6");
    enfermedad6.agregarEstadoPatologico("destruccion de plantas");
    enfermedad6.agregarEstadoPatologico("muerte de plántulas");
    Enfermedad enfermedad7 = new Enfermedad("enfermedad7");
    enfermedad7.agregarEstadoPatologico("destruccion de plantas");
    enfermedad7.agregarEstadoPatologico("hojas carcomidas");
    enfermedad7.agregarEstadoPatologico("pudriciones de raíz");
    Enfermedad enfermedad8 = new Enfermedad("enfermedad8");
    enfermedad8.agregarEstadoPatologico("muerte de plántulas");
    enfermedad8.agregarEstadoPatologico("pudriciones de raíz");
    Enfermedad enfermedad9 = new Enfermedad("enfermedad9");
    enfermedad9.agregarEstadoPatologico("hojas carcomidas");

    // Instanciacion de cultivos
    Cultivo cultivo1 = new Cultivo("cultivo1");
    cultivo1.agregarEnfermedad(enfermedad1);
    cultivo1.agregarEnfermedad(enfermedad4);
    Cultivo cultivo2 = new Cultivo("cultivo2");
    cultivo2.agregarEnfermedad(enfermedad2);
    cultivo2.agregarEnfermedad(enfermedad5);
    Cultivo cultivo3 = new Cultivo("cultivo3");
    cultivo3.agregarEnfermedad(enfermedad1);
    cultivo3.agregarEnfermedad(enfermedad3);
    Cultivo cultivo4 = new Cultivo("cultivo4");
    cultivo4.agregarEnfermedad(enfermedad9);
    cultivo4.agregarEnfermedad(enfermedad8);
    Cultivo cultivo5 = new Cultivo("cultivo5");
    cultivo5.agregarEnfermedad(enfermedad7);
    cultivo5.agregarEnfermedad(enfermedad6);
    Cultivo cultivo6 = new Cultivo("cultivo6");
    cultivo6.agregarEnfermedad(enfermedad2);
    cultivo6.agregarEnfermedad(enfermedad7);

    // Instanciacion de productos quimicos
    ProductoQuimico productoQuimico1 = new ProductoQuimico("producto 1");
    productoQuimico1.agregarEstadoPatologico("destruccion de plantas");
    productoQuimico1.agregarEstadoPatologico("pudriciones de raíz");
    productoQuimico1.agregarCultivoDesaconsejado(cultivo1);
    productoQuimico1.agregarCultivoDesaconsejado(cultivo3);
    productoQuimico1.agregarCultivoDesaconsejado(cultivo6);
    
    ProductoQuimico productoQuimico2 = new ProductoQuimico("producto 2");
    productoQuimico2.agregarEstadoPatologico("destruccion de plantas");
    productoQuimico2.agregarCultivoDesaconsejado(cultivo2);
    productoQuimico2.agregarCultivoDesaconsejado(cultivo3);
    
    ProductoQuimico productoQuimico3 = new ProductoQuimico("producto 3");
    productoQuimico3.agregarEstadoPatologico("muerte de plántulas");
    productoQuimico3.agregarEstadoPatologico("pudriciones de raíz");
    productoQuimico3.agregarEstadoPatologico("hojas carcomidas");
    productoQuimico3.agregarCultivoDesaconsejado(cultivo5);
    productoQuimico3.agregarCultivoDesaconsejado(cultivo4);
    
    ProductoQuimico productoQuimico4 = new ProductoQuimico("producto 4");
    productoQuimico4.agregarEstadoPatologico("hojas carcomidas");
    productoQuimico4.agregarEstadoPatologico("muerte de plántulas");
    productoQuimico4.agregarCultivoDesaconsejado(cultivo2);
    productoQuimico4.agregarCultivoDesaconsejado(cultivo4);
    
    ProductoQuimico productoQuimico5 = new ProductoQuimico("producto 5");
    productoQuimico5.agregarEstadoPatologico("destruccion de plantas");
    productoQuimico5.agregarEstadoPatologico("pudriciones de raíz");
    
    ProductoQuimico productoQuimico6 = new ProductoQuimico("producto 6");
    productoQuimico6.agregarEstadoPatologico("muerte de plántulas");
    productoQuimico6.agregarCultivoDesaconsejado(cultivo5);
    
    ProductoQuimico productoQuimico7 = new ProductoQuimico("producto 7");
    productoQuimico7.agregarEstadoPatologico("hojas carcomidas");
    productoQuimico7.agregarEstadoPatologico("pudriciones de raíz");
    productoQuimico7.agregarEstadoPatologico("muerte de plántulas");

    empresa.agregarProducto(productoQuimico1);
    empresa.agregarProducto(productoQuimico2);
    empresa.agregarProducto(productoQuimico3);
    empresa.agregarProducto(productoQuimico4);
    empresa.agregarProducto(productoQuimico5);
    empresa.agregarProducto(productoQuimico6);
    empresa.agregarProducto(productoQuimico7);

    // ⚡ Testing ⚡  
    System.out.println("Testeando condicion enfermedad: ");
    System.out.println("Productos que pueden tratar la enfermedad " + enfermedad2.getNombre() + ": ");
    System.out.println(empresa.getAgroquimicos(new CondicionTrataEnfermedad(enfermedad2)));
    System.out.println("");
    System.out.println("Productos que pueden tratar la enfermedad " + enfermedad5.getNombre() + ": ");
    System.out.println(empresa.getAgroquimicos(new CondicionTrataEnfermedad(enfermedad5)));
    System.out.println("");
    System.out.println("\nTesteando condicion doble (cultivo y enfermedad): ");
    System.out.println("Productos que pueden tratar la enfermedad " + enfermedad9.getNombre() + " sobre el cultivo " + cultivo2.getNombre() + ": ");
    System.out.println(empresa.getAgroquimicos(new CondicionAnd(new CondicionCultivo(cultivo2), new CondicionTrataEnfermedad(enfermedad9))));
    System.out.println("");
    System.out.println("Productos que pueden tratar la enfermedad " + enfermedad2.getNombre() + " sobre el cultivo " + cultivo4.getNombre() + ": ");
    System.out.println(empresa.getAgroquimicos(new CondicionAnd(new CondicionCultivo(cultivo4), new CondicionTrataEnfermedad(enfermedad2))));
    // En el ultimo caso, debería haber agregado el producto 3 tambien, pero debido a que estaba en la lista de "desaconsejados" no se mostró por pantalla.
  }
}
