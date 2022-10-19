package TP_7B.consigna2;

public abstract class Envio {
  private long idTracking;

  public Envio(long idTracking){
    setIdTracking(idTracking);
  }
  // Setters
  public void setIdTracking(long idTracking){this.idTracking = idTracking;}
  // Getters
  public long getIdTracking(){return idTracking;}

  public String getCiudadDestino(){
    return this.getDestinatario().getCiudad();
  }

  public abstract Persona getDestinatario();
  public abstract Persona getRemitente();
  public abstract double getPeso();

}
