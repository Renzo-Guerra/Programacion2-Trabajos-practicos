package consigna4;

public class Pais {
  private String nombre;
  private Provincia[] provincias;

  public Pais(String nombre, Provincia[] provincias){
    setNombre(nombre);
    this.provincias = new Provincia[provincias.length];
    setProvincias(provincias);
  }
  // Setters
  private void setNombre(String nombre) {
    this.nombre = nombre;
  }
  private void setProvincias(Provincia[] provincias){
    for(int i=0;i<provincias.length;i++){
      this.provincias[i] = provincias[i];
    }
  }

  // Getters
  public String getNombre() {
    return nombre;
  }
  public Provincia[] getProvincias() {
    return provincias;
  }

  // Metodos
  public int contarProvincias(){
    return getProvincias().length;
  }

  public String obtenerCiudadesQueGastanMasDeLoQueRecaudan(){
    Provincia[] provincias = getProvincias();
    String ciudades = "";
    for(int i=0; i<contarProvincias();i++){
      ciudades += provincias[i].getNombre() + ": {" + provincias[i].obtenerCiudadesQueGastanMasDeLoQueRecaudan() + "}. ";
    }

    return ciudades;
  }
}