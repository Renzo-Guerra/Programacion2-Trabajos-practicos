package TP_8.consigna1;

import java.time.LocalDate;

public class Turno {
  LocalDate fecha;
  Cancha canchaAlquilada;
  double montoPagado;

  public Turno(LocalDate fecha, Cancha canchaAlquilada){
    setFecha(fecha);
    setCanchaAlquilada(canchaAlquilada);
    setMontoPagado(canchaAlquilada.getPrecio());
  }

  // Setters:
  public void setFecha(LocalDate fecha){this.fecha = fecha;}
  public void setCanchaAlquilada(Cancha canchaAlquilada){this.canchaAlquilada = canchaAlquilada;}
  public void setMontoPagado(double montoPagado){this.montoPagado = montoPagado;}

  // Getters:
  public LocalDate getFecha(){return fecha;}
  public Cancha getCanchaAlquilada(){return canchaAlquilada;}
  public double getMontoPagado(){return montoPagado;}

  @Override
  public String toString() {
    return "Fecha: " + this.getFecha() + 
            ", cancha alquilada: " + this.canchaAlquilada + 
            ", monto pagado: " + this.getMontoPagado() + "\n";
  }
}
