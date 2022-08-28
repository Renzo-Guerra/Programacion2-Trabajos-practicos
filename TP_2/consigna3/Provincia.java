package TP_2.consigna3;

public class Provincia {
  private String nombre;
  private Ciudad[] ciudades;
  
  public Provincia(String nombre, Ciudad[] ciudades){
    setNombre(nombre);
    this.ciudades = new Ciudad[ciudades.length];
    setCiudades(ciudades);
  }

  // Setters
  private void setNombre(String nombre) {
    this.nombre = nombre;
  }
  private void setCiudades(Ciudad[] ciudades) {
    for(int i=0;i<ciudades.length;i++){
      this.ciudades[i] = ciudades[i];
    }
  }

  // Getters
  public String getNombre() {
    return nombre;
  }
  public Ciudad[] getCiudades() {
    return ciudades;
  }

  public int contarCiudades(){
    return getCiudades().length;
  }

  public boolean tieneMasDeLaMitadEnDeficit(){
    Ciudad[] ciudades = getCiudades();
    int contador = 0;
    for(int i=0;i<contarCiudades();i++){
      if(ciudades[i].gastaMasDeLoQueRecauda()){
        contador++;
      }
    }

    return (contador == 0)? false : ((contarCiudades() / 2) <= contador);
  }

  public String obtenerCiudadesQueGastanMasDeLoQueRecaudan(){
    Ciudad[] ciudades = getCiudades();
    String nombres = "";
    
    for(int i=0; i<contarCiudades();i++){
      if(ciudades[i].gastaMasDeLoQueRecauda()){
        nombres += ciudades[i].getNombre() + " - ";
      }
    }
    return (nombres == "")? "Ninguna ciudad gasta mas de lo que recauda.": nombres;
  }
  
  public String obtenerNombresDeLasCiudades(){
    Ciudad[] ciudades = getCiudades();
    String nombres = "";
    
    for(int i=0; i<contarCiudades();i++){
      nombres += ciudades[i].getNombre() + " - ";
    }
    
    return nombres;
  }
}
