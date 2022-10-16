package TP_7A.consigna4;

import TP_7A.consigna4.ficha.*;
import TP_7A.consigna4.condicion.condicionalesLogicos.*;
import TP_7A.consigna4.condicion.condicionesEspecificas.espacioOcupa.*;
import TP_7A.consigna4.condicion.condicionesEspecificas.fortaleza.*;
import TP_7A.consigna4.condicion.condicionesEspecificas.poderDestruccion.*;


public class Main {
  public static void main(String[] args) {
    Ficha ficha1 = new Ficha("Chocolate", 1, 10, 2);
    Ficha ficha2 = new Ficha("Piedra", 6, 14, 0);
    Ficha ficha3 = new Ficha("Caramelo a rayas", 1, 1, 10);
    FichaEspecial ficha4 = new FichaEspecial("Caramelo explosivo", 30, 4);
    FichaEspecial ficha5 = new FichaEspecial("Bola disco", 60, 2);

    Tablero tablero = new Tablero();

    tablero.agregarFicha(ficha1);
    tablero.agregarFicha(ficha2);
    tablero.agregarFicha(ficha3);
    tablero.agregarFicha(ficha4);
    tablero.agregarFicha(ficha5);
    
    // ⚡TESTING⚡
    System.out.println("Dificultad del nivel: ");
    System.out.println(tablero.getDificultad());
    System.out.println("");
    System.out.println("Fichas con poder de destruccion mayor a 2: ");
    System.out.println(tablero.getFichasWhere(new CPoderDestruccionMayorA(2)));
    System.out.println("");
    System.out.println("Fichas con poder de destruccion menor a 2: ");
    /**
     * Recuendan en tmc que aprendimos sobre tablas de verdad? 
     * Bueno sirvien para esto:
     * (!destruccionMayorA(2) && !destruccionIgualA(2))
     *  equivale a
     * !(destruccionMayorA(2) || destruccionIgualA(2))
     */
    System.out.println(tablero.getFichasWhere(new CondicionNot(
                                                new CondicionOr(
                                                  new CPoderDestruccionMayorA(2), 
                                                  new CPoderDestruccionIgualA(2)
                                                )
                                              )));
    System.out.println("");
    System.out.println("Fichas con poder de destruccion igual a 2: ");
    System.out.println(tablero.getFichasWhere(new CPoderDestruccionIgualA(2)));
    System.out.println("");
    System.out.println("Fichas que ocupan mas de 4 lugares: ");
    System.out.println(tablero.getFichasWhere(new CEspacioOcupaMayorA(4)));
    System.out.println("");
    System.out.println("Fichas con fortaleza mayor a 4: ");
    System.out.println(tablero.getFichasWhere(new CFortalezaMayorA(4)));
    System.out.println("");
  }
}
