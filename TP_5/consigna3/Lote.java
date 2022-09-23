package consigna3;

import java.util.ArrayList;

public class Lote {
  private String nombre;
  protected ArrayList<String> minerales;
  private int superficie; // En hectareas
  protected static String[] minerales_primarios = {"magnesio", "fosforo"};

  /**
   * Instancia un lote
   * @param nombre del lote
   * @param superficie del lote en hectareas
   */
  public Lote(String nombre, int superficie){
    setNombre(nombre);
    setSuperficie(superficie);
    minerales = new ArrayList<>();
  }

  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setSuperficie(int superficie){this.superficie = superficie;}
  // Getters
  public String getNombre(){return nombre;}
  public int getSuperficie(){return superficie;}

  public void agregarMineral(String nuevo_mineral){
    if((nuevo_mineral != null) && !minerales.contains(nuevo_mineral)){
      minerales.add(nuevo_mineral);
    }
  }

  public boolean tieneMineral(String mineral_verificar){
    return minerales.contains(mineral_verificar);
  }

  /**
   * Verifica si el lote posee alguno de los minerales catalogados como "especiales"
   * @return (String) "especial" (en caso de que contenga algun mineral especial) / "comun" (en caso 
   * de que solo contenga minerales comunes)
   */
  public String getCalificacionLote(){
    String caso_positivo = "especial";
    String caso_negativo = "comun";

    for (String material_actual : minerales_primarios) {
      if(tieneMineral(material_actual)){
        return caso_positivo;
      }
    }

    return caso_negativo;
  }

  public String getMinerales() {
    String resultado = "";
    for (String mineral : minerales) {
      resultado += mineral + " - ";
    }

    return resultado;
  }

  @Override
  public boolean equals(Object obj) {
    Lote lote = (Lote)obj;
    return (lote.getNombre() == this.getNombre());
  }
  @Override
  public String toString() {
    return "nombre: " + this.getNombre() + ", hectareas: " + this.getSuperficie() + ", minerales: {" + getMinerales() + "}, calificacion: " + getCalificacionLote();
  }
}
