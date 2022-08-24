package TP_1.consigna3;

import java.text.DecimalFormat;

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
  private final DecimalFormat FORMATO_DECIMAL = new DecimalFormat("#.00");
  /*
   * Dado un solo punto geometrico, se genera un rectangulo:
   * - Si la distancia en x si es positiva, B estará a la derecha A. 
   * - Si la distancia en x si es negativa, B estará a la izquierda de A.
   * - Si la distancia en y si es positiva, C estará por encima de A.
   * - Si la distancia en x si es negativa, C estará por debajo de A. 
   * - Si A o B es cero, ese valor sera 1 por defecto.
   */
  public Rectangulo(PuntoGeometrico punto_a, float distancia_x, float distancia_y){
    final float DICERNIBLE = 0;
    final float DEFAULT_VALUE = 1; 
    // Validaciones distinto del DICERNIBLE: 
    distancia_x = (distancia_x != DICERNIBLE)? distancia_x : DEFAULT_VALUE;
    distancia_y = (distancia_y != DICERNIBLE)? distancia_y : DEFAULT_VALUE;
    setPunto_a(punto_a);
    setPunto_b(new PuntoGeometrico((punto_a.getCoordenadaX() + distancia_x), punto_a.getCoordenadaY()));
    setPunto_c(new PuntoGeometrico((punto_a.getCoordenadaX()), punto_a.getCoordenadaY() + distancia_y));
    setPunto_d(new PuntoGeometrico(punto_b.getCoordenadaX(), punto_c.getCoordenadaY()));
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

  private float calcularBase(){
    float valor_x_c = this.getPunto_c().getCoordenadaX();
    float valor_x_d = this.getPunto_d().getCoordenadaX();
    
    return (valor_x_c < valor_x_d)? valor_x_d - valor_x_c : valor_x_c - valor_x_d;
  }

  private float calcularAltura(){
    float valor_y_b = this.getPunto_b().getCoordenadaY();
    float valor_y_d = this.getPunto_d().getCoordenadaY();
    
    return (valor_y_d < valor_y_b)? valor_y_b - valor_y_d : valor_y_d - valor_y_b;  
  }

  public float calcularArea(){
    float base = this.calcularBase();
    float altura = this.calcularAltura();

    return Float.parseFloat(FORMATO_DECIMAL.format(base * altura));
  }

  /*
   * Devolver 1 si el rectángulo que invoca el metodo es mayor, 
   * 0 si son iguales y -1 si es menor. 
   * "Se dice que un rectángulo es mayor que otro si el área del 
   * mismo es mayor que la del otro."
   */
  public int esMayor(Rectangulo otroRectangulo){
    return (this.calcularArea() == otroRectangulo.calcularArea()) ? 0 : (this.calcularArea() > otroRectangulo.calcularArea()) ? 1 : -1;
  }
}