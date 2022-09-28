package consigna4;

import java.util.ArrayList;

public class Provincia {
  private String nombre;
  private ArrayList<Ciudad> ciudades;
  
  public Provincia(String nombre){
    setNombre(nombre);
    ciudades = new ArrayList<>();
  }

  // Setters
  private void setNombre(String nombre) {this.nombre = nombre;}
  
  public void agregarCiudad(Ciudad ciudad_agregar){
    if((ciudad_agregar != null) && (!ciudades.contains(ciudad_agregar))){
      ciudades.add(ciudad_agregar);
    }
  }

  // Getters
  public String getNombre() {return nombre;}

  public int getCantidadCiudades(){return ciudades.size();}

  public boolean tieneMasDeLaMitadEnDeficit(){
    int contador = 0;
    for(int i=0;i<getCantidadCiudades();i++){
      if(ciudades.get(i).gastaMasDeLoQueRecauda()){
        contador++;
      }
    }

    return (contador == 0)? false : ((getCantidadCiudades() / 2) <= contador);
  }

  public String obtenerCiudadesQueGastanMasDeLoQueRecaudan(){
    String nombres = "";
    
    for(int i=0; i<getCantidadCiudades();i++){
      if(ciudades.get(i).gastaMasDeLoQueRecauda()){
        nombres += ciudades.get(i).getNombre() + " - ";
      }
    }
    return (nombres == "")? "Ninguna ciudad gasta mas de lo que recauda.": nombres;
  }
  
  public String obtenerNombresDeLasCiudades(){
    String nombres = "";
    
    for(int i=0; i<getCantidadCiudades();i++){
      nombres += ciudades.get(i).getNombre() + " - ";
    }
    
    return nombres;
  }

  @Override
  public String toString() {
    return "nombre: " + this.getNombre() + ", ciudades: " + obtenerNombresDeLasCiudades();
  }
  @Override
  public boolean equals(Object obj) {
    Provincia provincia = (Provincia)obj;
    return (provincia.getNombre() == this.getNombre());
  }
}
