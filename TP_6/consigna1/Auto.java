public class Auto {
  private String marca;
  private long kilometraje;
  private String patente;
  private String tipo;
  private boolean disponible;

  public Auto(String marca, long kilometraje, String patente){
    setMarca(marca);
    setKilometraje(kilometraje);
    setPatente(patente);
    disponible = false;
  }

  // Setters
  public void setMarca(String marca){this.marca = marca;}
  public void setKilometraje(long kilometraje){this.kilometraje = kilometraje;}
  public void setPatente(String patente){this.patente = patente;}
  public void setTipo(String tipo) {
    if((tipo != null) && ((tipo == "electrico") || (tipo == "magnetico") || (tipo == "diesel"))){
      this.tipo = tipo;
    }else{
      this.tipo = "diesel";
    }
  }
  /**
   * Si esta disponible = true, lo pone en disponible = false, y visceversa
   */
  public void toggleDisponible() {
    this.disponible = (this.disponible)? false : true;
  }

  // Getters
  public String getMarca(){return marca;}
  public long getKilometraje(){return kilometraje;}
  public String getPatente(){return patente;}
  public String getTipo(){return tipo;}
  public boolean getDisponible(){return disponible;}

  @Override
  public boolean equals(Object obj) {
    Auto auto = (Auto) obj;
    return (auto.patente == this.patente);
  }

  @Override
  public String toString() {
    return "Patente: " + this.patente + ", kilometraje: " + this.kilometraje + ", marca: " + this.marca + ", tipo: " + this.tipo;
  }
}
