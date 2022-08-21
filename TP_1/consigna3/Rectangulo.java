package TP_1.consigna3;

/*
*   Ractangulo:
*
*    A-----------------B
*    |                 |
*    |                 | 
*    C-----------------D
*/
public class Rectangulo {
  private PuntoGeometrico punto_a;
  private PuntoGeometrico punto_b;
  private PuntoGeometrico punto_c;
  private PuntoGeometrico punto_d;

  // Valida que los 4 vertices dados puedan conformar un rectangulo.
  public static boolean sonVerticesValidos(PuntoGeometrico a, PuntoGeometrico b, PuntoGeometrico c, PuntoGeometrico d){
    /*
      * Al tener la palabra "static", no es necesario que se haya instanciado un objeto para usarla, 
      * podria decirse que es de ambito ""global"", para usarse poner Rectangulo.sonVerticesValidos(a, b, c, d);
    */
    return (((a.getCoordenadaX() == b.getCoordenadaX()) && 
          (c.getCoordenadaX() == d.getCoordenadaX())) && 
          ((a.getCoordenadaY() == c.getCoordenadaY()) && 
          (b.getCoordenadaY() == d.getCoordenadaY())))? true : false;
  }
}
