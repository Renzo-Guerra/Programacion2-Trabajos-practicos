package TP_7A.consigna3;

import TP_7A.consigna3.condicion.condicionesCombinadas.*;
import TP_7A.consigna3.condicion.condicionesUnicas.*;
import TP_7A.consigna3.condicion.condicionesUnicas.condicionRiego.*;
import TP_7A.consigna3.condicion.condicionesUnicas.condicionSol.*;

/**
 * Falta el filtro de familia y calificacion superior
 */

public class Main {
  public static void main(String[] args) {
    Planta planta1 = new Planta("Epipremnum aureum", "Epipremnum", "Araceae", "Monocotyledoneae", "exterior", 4, 5);
    planta1.agregarNombreBulgar("potus");
    planta1.agregarNombreBulgar("pothos");
    planta1.agregarNombreBulgar("potos");
    
    Planta planta2 = new Planta("Epipremnum pinnatum", "Epipremnum", "Araceae", "Monocotyledoneae", "exterior", 7, 6);
    planta2.agregarNombreBulgar("potus");
    planta2.agregarNombreBulgar("pothos");
    planta2.agregarNombreBulgar("ciempiés");
    planta2.agregarNombreBulgar("vid de tonga");
    planta2.agregarNombreBulgar("planta de cola de dragón");

    Planta planta3 = new Planta("Philodendron", "Fanerógamas", "Araceae", "Liliopsida", "interior", 2, 9);
    Planta planta4 = new Planta("Philodendron xanadu", "Philodendron", "Araceae", "Alismatales", "interior", 8, 3);
    // Como veran me dio fiaca...
    Planta planta5 = new Planta("planta5", "calificacion4", "familia1", "clase2", "exterior", 7, 7);
    planta5.agregarNombreBulgar("nombreVulgar1");
    planta5.agregarNombreBulgar("nombreVulgar2");
    planta5.agregarNombreBulgar("nombreVulgar7");
    Planta planta6 = new Planta("planta6", "calificacion4", "familia1", "clase1", "interior", 2, 6);
    planta6.agregarNombreBulgar("nombreVulgar1");
    planta6.agregarNombreBulgar("nombreVulgar8");
    planta6.agregarNombreBulgar("nombreVulgar5");
    planta6.agregarNombreBulgar("nombreVulgar0");
    Planta planta7 = new Planta("planta7", "calificacion1", "familia7", "clase2", "interior", 1, 5);
    planta7.agregarNombreBulgar("nombreVulgar2");
    planta7.agregarNombreBulgar("nombreVulgar1");
    Planta planta8 = new Planta("planta8", "calificacion1", "familia1", "clase6", "exterior", 7, 8);
    planta8.agregarNombreBulgar("nombreVulgar8");
    planta8.agregarNombreBulgar("nombreVulgar2");
    planta8.agregarNombreBulgar("nombreVulgar7");
    Planta planta9 = new Planta("planta9", "calificacion4", "familia4", "clase6", "interior", 8, 5);
    planta9.agregarNombreBulgar("nombreVulgar3");

    Vivero vivero = new Vivero();

    vivero.agregarPlanta(planta1);
    vivero.agregarPlanta(planta2);
    vivero.agregarPlanta(planta3);
    vivero.agregarPlanta(planta4);
    vivero.agregarPlanta(planta5);
    vivero.agregarPlanta(planta6);
    vivero.agregarPlanta(planta7);
    vivero.agregarPlanta(planta8);
    vivero.agregarPlanta(planta9);

    // ⚡TESTING⚡
    System.out.println("Todas las plantas: ");
    System.out.println(vivero.getTodasLasPlantas());
    System.out.println("");
    System.out.println("Todas las plantas cuyo nombre científico incluya la palabra 'aureum': ");
    System.out.println(vivero.getPlantasWhere(new CondicionNomCienContiene("aureum")));
    System.out.println("");
    System.out.println("Todas las plantas a las que se conozca vulgarmente como 'nombreVulgar2': ");
    System.out.println(vivero.getPlantasWhere(new CondicionConocidaVulgarmente("nombreVulgar2")));
    System.out.println("");
    System.out.println("Todas las plantas cuya clasificación sea 'Monocotyledoneae': ");
    System.out.println(vivero.getPlantasWhere(new CondicionClasificacion("Monocotyledoneae")));
    System.out.println("");
    System.out.println("Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3: ");
    System.out.println(vivero.getPlantasWhere(new CondicionAnd(
                                                new CondicionSolMayorA(5), 
                                                new CondicionRiegoMenorA(3)
                                                )));
    System.out.println("");
    System.out.println("Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4: ");
    System.out.println(vivero.getPlantasWhere(new CondicionAnd(
                                                new CondicionSolMenorA(4), 
                                                new CondicionRiegoMayorA(4)
                                                )));
    System.out.println("");
    System.out.println("Todas las plantas de interior que necesiten poco riego (inferior a 3): ");
    System.out.println(vivero.getPlantasWhere(new CondicionAnd(new CondicionTipo("interior"), new CondicionRiegoMenorA(3))));
    System.out.println("");
  }
}
