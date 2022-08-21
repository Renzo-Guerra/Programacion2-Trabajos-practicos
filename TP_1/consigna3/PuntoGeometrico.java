package TP_1.consigna3;

// Libreria que nos permitira utilizar metodos para calculos.
import java.math.*;
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
}
