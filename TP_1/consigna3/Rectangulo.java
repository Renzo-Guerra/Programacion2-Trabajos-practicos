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

  // Metodos
  /*
   * Dados unos valores 'x' e 'y', se dezplazaran los 4 vertices 
   * 'i' unidades horizontalmente, y 'j' unidades verticalmente.
   */
  public void desplazarRectanguloEnElPlano(float x, float y){
    this.setPunto_a(desplazarVerticeDelRectanguloEnElPlano(this.getPunto_a(), x, y));
    this.setPunto_b(desplazarVerticeDelRectanguloEnElPlano(this.getPunto_b(), x, y));
    this.setPunto_c(desplazarVerticeDelRectanguloEnElPlano(this.getPunto_c(), x, y));
    this.setPunto_d(desplazarVerticeDelRectanguloEnElPlano(this.getPunto_d(), x, y));
  }

  // Dado un vertice, le suma (o resta) las coordenadas
  private PuntoGeometrico desplazarVerticeDelRectanguloEnElPlano(PuntoGeometrico p, float x, float y){
    // Las coordenas cambian en base a las previas coordenadas y las nuevas. 
    p.setCoordenadaX(p.getCoordenadaX() + x); 
    p.setCoordenadaY(p.getCoordenadaY() + y);
    
    return p;
  } 
  
  public void mostrarCoordenadasDeLosVertices(){
    System.out.println("Vertice A:\t (" + this.getPunto_a().getCoordenadaX() + " ; " + this.getPunto_a().getCoordenadaY() + ")");
    System.out.println("Vertice B:\t (" + this.getPunto_b().getCoordenadaX() + " ; " + this.getPunto_b().getCoordenadaY() + ")");
    System.out.println("Vertice C:\t (" + this.getPunto_c().getCoordenadaX() + " ; " + this.getPunto_c().getCoordenadaY() + ")");
    System.out.println("Vertice D:\t (" + this.getPunto_d().getCoordenadaX() + " ; " + this.getPunto_d().getCoordenadaY() + ")");
  }
  // Valida que los 4 vertices dados puedan conformar un rectangulo.
  public static boolean sonVerticesValidos(PuntoGeometrico a, PuntoGeometrico b, PuntoGeometrico c, PuntoGeometrico d){
    /*
      * Al tener la palabra "static", no es necesario que se haya instanciado un objeto para usarla, 
      * podria decirse que es de ambito ""global"", para usarse poner Rectangulo.sonVerticesValidos(a, b, c, d);
    */
    return (((a.getCoordenadaY() == b.getCoordenadaY()) && 
          (c.getCoordenadaY() == d.getCoordenadaY())) && 
          ((a.getCoordenadaX() == c.getCoordenadaX()) && 
          (b.getCoordenadaX() == d.getCoordenadaX())))? true : false;
  }
}