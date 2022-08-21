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

  // Constructor
  public Rectangulo(PuntoGeometrico a, PuntoGeometrico b, PuntoGeometrico c, PuntoGeometrico d){
    setPunto_a(a);
    setPunto_b(b);
    setPunto_c(c);
    setPunto_d(d);
  }
  
  // Setters
  private void setPunto_a(PuntoGeometrico a){
    this.punto_a = a;
  }
  private void setPunto_b(PuntoGeometrico b){
    this.punto_b = b;
  }
  private void setPunto_c(PuntoGeometrico c){
    this.punto_c = c;
  }
  private void setPunto_d(PuntoGeometrico d){
    this.punto_d = d;
  }

  // Getters
  public PuntoGeometrico getPunto_a(){return this.punto_a;}
  public PuntoGeometrico getPunto_b(){return this.punto_b;}
  public PuntoGeometrico getPunto_c(){return this.punto_c;}
  public PuntoGeometrico getPunto_d(){return this.punto_d;}

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
