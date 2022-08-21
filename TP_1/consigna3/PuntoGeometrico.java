package TP_1.consigna3;

// Permite aniadir un formato decimal prestablecido (devuelve un tipo String, por eso se usa Float.parseFloat())
import java.text.DecimalFormat;

public class PuntoGeometrico {
  private float coordenada_x;
  private float coordenada_y;

  public PuntoGeometrico(){
    this(0, 0);
  }
  public PuntoGeometrico(float x, float y){
    setCoordenadaX(x);
    setCoordenadaY(y);
  }

  // Setters
  public void setCoordenadaX(float x){
    final DecimalFormat formato1 = new DecimalFormat("#.00");
    this.coordenada_x = Float.parseFloat(formato1.format(x));
  }

  public void setCoordenadaY(float y){
    final DecimalFormat formato1 = new DecimalFormat("#.00");
    this.coordenada_y = Float.parseFloat(formato1.format(y));
  }
  
  // Getters
  public float getCoordenadaX(){return this.coordenada_x;}
  public float getCoordenadaY(){return this.coordenada_y;}

  // Metodos
  public void desplazarPuntoEnElPlano(float x, float y){
    setCoordenadaX(x);
    setCoordenadaY(y);
  }

  public double calcularDistanciaEuclidea(Double nuevo_punto_x, Double nuevo_punto_y){
    final DecimalFormat formato1 = new DecimalFormat("#.00");
    final double coordenada_x = this.getCoordenadaX();
    final double coordenada_y = this.getCoordenadaY();
    double distancia;
    /*
     * - Se les introduce un formato decimal prestablecido.
     * - Se utilizan datos de tipo "double" para poder utilizar el metodo "pow" de la clase Math
    */
    nuevo_punto_x = Double.parseDouble(formato1.format(nuevo_punto_x));
    nuevo_punto_y = Double.parseDouble(formato1.format(nuevo_punto_y));
    // Calculamos la distancia
    distancia = Math.sqrt((Math.pow((coordenada_x - nuevo_punto_x), 2)) + (Math.pow((coordenada_y - nuevo_punto_y), 2)));
    
    // Devolvemos la distancia una vez aplicado el formato prestablecido
    return Double.parseDouble(formato1.format(distancia));
  }
   public double calcularDistanciaEuclidea(PuntoGeometrico punto){
    final DecimalFormat formato1 = new DecimalFormat("#.00");
    final double coordenada_x = this.getCoordenadaX();
    final double coordenada_y = this.getCoordenadaY();
    double distancia;
    // "Destructuramos" las coordenadas y las asignamos a variables. 
    double nuevo_punto_x = punto.getCoordenadaX();
    double nuevo_punto_y = punto.getCoordenadaY();

    // Calculamos la distancia
    distancia = Math.sqrt((Math.pow((coordenada_x - nuevo_punto_x), 2)) + (Math.pow((coordenada_y - nuevo_punto_y), 2)));
    // Devolvemos la distancia una vez aplicado el formato prestablecido
    return Double.parseDouble(formato1.format(distancia));
   }

  public void mostrarCoordenadasPunto(){
    System.out.println("Valor de x: " + this.getCoordenadaX());
    System.out.println("Valor de y: " + this.getCoordenadaY());
    System.out.println("");
  }
}
