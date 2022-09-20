package TP_4.consigna2;

public class Sensor {
  private String nombre;
  private String ambiente;
  // En vez de generar 1 clase por cada tipo de sensor (de vidrio, de puerta, ventana, etc)
  private boolean existe_irregularidad; 

  public Sensor(String nombre, String ambiente){
    this.nombre = nombre;
    this.ambiente = ambiente;
    this.existe_irregularidad = false;
  }

  public void setNombre(String nombre){this.nombre = nombre;}
  public void setAmbiente(String ambiente){this.ambiente = ambiente;}
  public String getNombre(){return nombre;}
  public String getAmbiente(){return ambiente;}
  public void toggleEstado(){this.existe_irregularidad = (this.existe_irregularidad)? false : true;}

  public boolean getExisteUnaIrregularidad(){return this.existe_irregularidad;}

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + ": {Nombre: " + getNombre() + ", ambiente: " + getAmbiente() + ", existe irregularidad: " + getExisteUnaIrregularidad() + "}";
  }
}
