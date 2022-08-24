package TP_1.consigna3;

// Permite aniadir un formato decimal prestablecido (devuelve un tipo String, por eso se usa Float.parseFloat())
import java.text.DecimalFormat;

public class PuntoGeometrico {
  private float coordenada_x;
  private float coordenada_y;
  private static final DecimalFormat FORMATO_DECIMAL = new DecimalFormat("#.00");

  public PuntoGeometrico(){
    this(0, 0);
  }
  public PuntoGeometrico(float x, float y){
    setCoordenadaX(x);
    setCoordenadaY(y);
  }

  // Setters
  public void setCoordenadaX(float x){
    this.coordenada_x = Float.parseFloat(FORMATO_DECIMAL.format(x));
  }

  public void setCoordenadaY(float y){
    this.coordenada_y = Float.parseFloat(FORMATO_DECIMAL.format(y));
  }
  
  // Getters
  public float getCoordenadaX(){return this.coordenada_x;}
  public float getCoordenadaY(){return this.coordenada_y;}

  // Metodos
  public void desplazarPuntoEnElPlano(float x, float y){
    setCoordenadaX(x);
    setCoordenadaY(y);
  }

  public double retornarDistanciaEuclidea(float nueva_coordenada_x, float nueva_coordenada_y){
    return calcularDistanciaEuclidea(nueva_coordenada_x, nueva_coordenada_y);
  }
  public double retornarDistanciaEuclidea(PuntoGeometrico punto){
    return calcularDistanciaEuclidea(punto.getCoordenadaX(), punto.getCoordenadaY());
  }
  // Calcula la distancia euclidea
  private double calcularDistanciaEuclidea(float nuevo_punto_x, float nuevo_punto_y){
    // Para usar Math.pow los valores de las coordenadas deben ser de tipo double
    final double coordenada_x = this.getCoordenadaX();  // Coordenada x del punto viejo
    final double coordenada_y = this.getCoordenadaY();  // Coordenada y del punto viejo
    double distancia;
    // Se les introduce un formato decimal prestablecido.
    double nuevo_punto_x_double = Double.parseDouble(FORMATO_DECIMAL.format(nuevo_punto_x));
    double nuevo_punto_y_double = Double.parseDouble(FORMATO_DECIMAL.format(nuevo_punto_y));
    
    // Calculamos la distancia
    distancia = Math.sqrt((Math.pow((coordenada_x - nuevo_punto_x_double), 2)) + (Math.pow((coordenada_y - nuevo_punto_y_double), 2)));
    
    // Devolvemos la distancia una vez aplicado el formato prestablecido
    return Double.parseDouble(FORMATO_DECIMAL.format(distancia));
  }

  public void mostrarCoordenadasPunto(){
    System.out.println("Valor de x: " + this.getCoordenadaX());
    System.out.println("Valor de y: " + this.getCoordenadaY());
    System.out.println("");
  }
}