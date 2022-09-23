package consigna3;

import java.util.ArrayList;

/*
 * Notas: 
 *  - Lo mismo que en el anterior, probar y sale todo.
 *    - se puede modificar la cantidad de minerales que tiene cada Cereal y Lote (cambiarle la cantidad a [agregarMineralesRandomLote() / agregarMineralesRandomLote()])
 *    - se puede hacer que haya mas probabilidades que un lote sea especial o no (midificando cuales minerales son los que hace que un Lote sea "especial" (Esta antes del constructor de la clase Lote)))
 *
 * Hay 3 tipos de cereales: 
 *  - Granos de cosecha gruesa.
 *  - Granos de cosecha fina.
 *  - Pasturas 
 *
 *  IMPORTANTE: Los minerales que catalogan un Lote como "especial" estan declarados en la clase Lote
 *  
 *  - Para que un cereal pueda ser plantado en un lote, el lote debe 
 *    contener TODOS los minerales del cereal en cuestion.
 *  - Las pasturas ademas, no pueden sembrarse en lotes menores a una 
 *    superficie de 50 hectareas.
 *  
 *  - Tipos de lotes: 
 *    - "especiales": "cuando contienen ciertos minerales de interés primario para la cooperativa"
 *    - "comunes": "cuando contienen sólo minerales secundarios en la composición de la tierra"
 */

public class Main {
  public static void main(String[] args) {
    // Se crea la cooperativa
    Cooperativa cooperativa = new Cooperativa();
    // Se crean los lotes y se les asignan minerales aleatorios
    Lote lote1 = new Lote("AAA", 45);
    agregarMineralesRandomLote(lote1, 5);
    Lote lote2 = new Lote("BBB", 104);
    agregarMineralesRandomLote(lote2, 7);
    Lote lote3 = new Lote("CCC", 65);
    agregarMineralesRandomLote(lote3, 6);
    Lote lote4 = new Lote("DDD", 40);
    agregarMineralesRandomLote(lote4, 8);
    Lote lote5 = new Lote("EEE", 35);
    agregarMineralesRandomLote(lote5, 4);
    Lote lote6 = new Lote("FFF", 20);
    agregarMineralesRandomLote(lote6, 3);

    // Se crean los cereales y se les asignan minerales aleatorios
    Cereal cereal1 = new Cereal("Girasol");
    agregarMineralesRandomCereal(cereal1, 3);
    Cereal cereal2 = new Cereal("Maiz");
    agregarMineralesRandomCereal(cereal2, 4);
    Cereal cereal3 = new Cereal("trigo");
    agregarMineralesRandomCereal(cereal3, 3);
    Cereal cereal4 = new Cereal("avena");
    agregarMineralesRandomCereal(cereal4, 4);
    CerealPastura cereal5 = new CerealPastura("alfalfa");
    agregarMineralesRandomCereal(cereal5, 5);
    CerealPastura cereal6 = new CerealPastura("trebol subterraneo");
    agregarMineralesRandomCereal(cereal6, 4);

    // Agregamos los lotes a la cooperativa
    cooperativa.agregarLote(lote1);
    cooperativa.agregarLote(lote2);
    cooperativa.agregarLote(lote3);
    cooperativa.agregarLote(lote4);
    cooperativa.agregarLote(lote5);
    cooperativa.agregarLote(lote6);

    // Agregamos los cereales a la cooperativa
    cooperativa.agregarCereal(cereal1);
    cooperativa.agregarCereal(cereal2);
    cooperativa.agregarCereal(cereal3);
    cooperativa.agregarCereal(cereal4);
    cooperativa.agregarCereal(cereal5);
    cooperativa.agregarCereal(cereal6);

    // Testing
    cooperativa.imprimirLotes();
    System.out.println("");
    cooperativa.imprimirCereales();
    System.out.println("");
    cooperativa.cerealesSembrablesEnLote(lote2);
    System.out.println("");
    cooperativa.cerealesSembrablesEnLote(lote5);
    System.out.println("");
    cooperativa.cualesLotesSonAptos(cereal2);
    System.out.println("");
    cooperativa.cualesLotesSonAptos(cereal3);
    System.out.println("");
    cooperativa.cualesLotesSonAptos(cereal5);
    System.out.println("");
  }

  /**
   * Carga el lote con minerales aleatorios
   * @param cereal a agregarle los minerales
   * @param cant_minerales a añadir
   */
  public static void agregarMineralesRandomCereal(Cereal cereal, int cant_minerales){
    ArrayList<String> minerales_disponibles = new ArrayList<>();
    // Se cargan minerales automaticamente
    cargarMinerales(minerales_disponibles);
    int random;
    int MIN_POSIBLE = 0;  // menor indice posible de minerales_disponibles
    int MAX_POSIBLE;  
    do {
      MAX_POSIBLE = minerales_disponibles.size()-1;  // mayor indice posible de minerales_disponibles

      random = (int)(Math.random() * (MAX_POSIBLE - MIN_POSIBLE + 1) + MIN_POSIBLE); // Genero un numero random entre el menor indice y el mayor (incluyendo los extremos)
      // Elimino y asigno un String random de "minerales_disponibles"
      cereal.agregarMineral(minerales_disponibles.remove(random));
    } while (!minerales_disponibles.isEmpty() && (cereal.minerales.size() < cant_minerales));
  }

  /**
   * Carga el lote con minerales aleatorios
   * @param lote a agregarle los minerales
   * @param cant_minerales a añadir
   */
  public static void agregarMineralesRandomLote(Lote lote, int cant_minerales){
    ArrayList<String> minerales_disponibles = new ArrayList<>();
    // Se cargan minerales automaticamente
    cargarMinerales(minerales_disponibles);
    int random;
    int MIN_POSIBLE = 0;  // menor indice posible de minerales_disponibles
    int MAX_POSIBLE;  
    do {
      MAX_POSIBLE = minerales_disponibles.size()-1;  // mayor indice posible de minerales_disponibles

      random = (int)(Math.random() * (MAX_POSIBLE - MIN_POSIBLE + 1) + MIN_POSIBLE); // Genero un numero random entre el menor indice y el mayor (incluyendo los extremos)
      // Elimino y asigno un String random de "minerales_disponibles"
      lote.agregarMineral(minerales_disponibles.remove(random));
    } while (!minerales_disponibles.isEmpty() && (lote.minerales.size() < cant_minerales));
  }

  public static void cargarMinerales(ArrayList<String> arraylist){
    arraylist.add("yodo");
    arraylist.add("magnesio");
    arraylist.add("cobalto");
    arraylist.add("cobre");
    arraylist.add("zinc");
    arraylist.add("manganeso");
    arraylist.add("fosforo");
    arraylist.add("vitamina E");
    arraylist.add("hierro");
    arraylist.add("fluor");
    arraylist.add("selenio");
    arraylist.add("potasio");
    arraylist.add("sulfuro");
    arraylist.add("cromo");
  }
}
