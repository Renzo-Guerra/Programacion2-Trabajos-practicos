package TP_7B.consigna2;

public class Paquete extends Envio{
  private Persona destinatario;
  private Persona remitente;
  private boolean retiroPorSucursal;
  private double peso; // En kilogramos

  public Paquete(long idTracking, Persona destinatario, Persona remitente, double peso) {
    this(idTracking, destinatario, remitente, peso, true);
  }

  public Paquete(long idTracking, Persona destinatario, Persona remitente, double peso, boolean retiroPorSucursal) {
    super(idTracking);
    this.destinatario = destinatario;
    this.remitente = remitente;
    this.peso = peso;
    this.retiroPorSucursal = retiroPorSucursal;
  }

  // Setters
  public void setDestinatario(Persona destinatario){this.destinatario = destinatario;}
  public void setRemitente(Persona remitente){this.remitente = remitente;}
  public void setPeso(double peso){this.peso = peso;}

  // Getters
  @Override
  public Persona getDestinatario(){return destinatario;}
  @Override
  public Persona getRemitente(){return remitente;}
  @Override
  public double getPeso(){return peso;}

  public boolean seRetiraPorSucursal(){return this.retiroPorSucursal;}

  @Override
  public String toString() {
    return "Id: " + this.getIdTracking() + ", remitente: " + this.remitente + ", destinatario: " + this.destinatario + ", peso: " + this.peso + "\n";
  }
}
