package farmacia;

import java.util.ArrayList;

public class Medicamento {
  private String nombre;
  private String laboratorio;
  private double precio;
  private ArrayList<String> sintomas;

  public Medicamento(String nombre, String laboratorio, double precio){
    setNombre(nombre);
    setLaboratorio(laboratorio);
    setPrecio(precio);
    sintomas = new ArrayList<>();
  }

  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setLaboratorio(String laboratorio){this.laboratorio = laboratorio;}
  public void setPrecio(double precio){this.precio = precio;}
  // Getters
  public String getNombre(){return nombre;}
  public String getLaboratorio(){return laboratorio;}
  public double getPrecio(){return precio;}
  public ArrayList<String> getSintomas(){return new ArrayList<>(sintomas);}
  
  public void agregarSintoma(String nuevo_sintoma){
    if((nuevo_sintoma != null) && (!sintomas.contains(nuevo_sintoma))){
      sintomas.add(nuevo_sintoma);
    }
  }

  @Override
  public String toString() {
    return "Medicamento - {nombre: " + getNombre() + ", laboratorio: " + getLaboratorio() + ", precio: " + getPrecio() + ", sintomas: " + getSintomas() + "}\n";
  }
}
