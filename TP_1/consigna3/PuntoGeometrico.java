package TP_1.consigna3;

// Libreria que nos permitira utilizar metodos para calculos.
import java.math.*;

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
}
