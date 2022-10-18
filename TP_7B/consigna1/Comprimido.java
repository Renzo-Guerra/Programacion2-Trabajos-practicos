package TP_7B.consigna1;

import TP_7B.consigna1.abstractas.ElementoAlmacena;
import TP_7B.consigna1.abstractas.ElementoSA;

public class Comprimido extends ElementoAlmacena{
  public static int tazaCompresion = 10;

  public Comprimido(String nombre) {
    super(nombre);
  }

  /**
   * Define la taza de compresion para TODOS los archivos comprimidos.
   * Acepta valores(enteros) del 1 al 99.
   * @param tazaCompresion de los archivos.
   */
  public static void setTazaCompresion(int tazaCompresion) {
    int minDefault = 10;
    int maxDefault = 90;
    /**
     * - Si es >= 0 se le asigna minDefault.
     * - En caso de que sea mayor a 0: 
     *   - Se verifica si es >= 100: 
     *     * en caso afirmativo, se asigna maxDefault.
     *     * en caso negativo, se asigna tazaCompresion.
     */

    Comprimido.tazaCompresion = (tazaCompresion <= 0) ? 
                                  minDefault : (tazaCompresion >= 100) ?
                                    maxDefault : tazaCompresion;
  }

  @Override
  public int getPeso() {
    int acumulador = 0;
    for (ElementoSA elementoActual : elementos){
      acumulador += elementoActual.getPeso();
    }
    // Descomentar la linea de abajo para ver que devuelve 0.
    // System.out.println("El acumulador es: " + (acumulador / 100 * tazaCompresion ));
    
    /*
     * NOTA:
     * Al principio habia hecho el calculo:
     *   acumulador / 100 * Comprimido.tazaCompresion
     * y devolvia SIEMPRE 0, cambie el orden de la cuenta y anda.
     */
    // Redondea el valor, deberia devolver un double en realidad.
    return (acumulador * Comprimido.tazaCompresion / 100 );
  }

}
