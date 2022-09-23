package consigna4;

import java.util.ArrayList;

public class Pais {
  private String nombre;
  private ArrayList<Provincia> provincias;

  public Pais(String nombre){
    setNombre(nombre);
    provincias = new ArrayList<>();
  }
  // Setters
  private void setNombre(String nombre){this.nombre = nombre;}

  // Getters
  public String getNombre(){return nombre;}

  // Metodos
  public int contarProvincias(){return provincias.size();}

  public String obtenerCiudadesQueGastanMasDeLoQueRecaudan(){
    String ciudades = "";
    for(int i=0; i<contarProvincias();i++){
      ciudades += provincias.get(i).getNombre() + ": {" + provincias.get(i).obtenerCiudadesQueGastanMasDeLoQueRecaudan() + "}. ";
    }

    return ciudades;
  }
}