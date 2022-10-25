package TP_8.consigna1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Socio {
  private String nombre, apellido;
  private int edad;
  private boolean ultimaCuotaPagada;
  private ArrayList<Turno> turnos;

  public Socio(String nombre, String apellido, int edad){
    setNombre(nombre);
    setApellido(apellido);
    setEdad(edad);
    this.ultimaCuotaPagada = true; // Solo se puede crear un usuario una vez haya pagado
    turnos = new ArrayList<>();
  }
  
  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setApellido(String apellido){this.apellido = apellido;}
  public void setEdad(int edad){this.edad = edad;}
  public void setUltimaCuotaPagada(){this.ultimaCuotaPagada = (this.ultimaCuotaPagada) ? true : false;}

  // Getters
  public String getNombre(){return nombre;}
  public String getApellido(){return apellido;}
  public int getEdad(){return edad;}
  public boolean getUltimaCuotaPagada(){return this.ultimaCuotaPagada;}

  /**
   * Dada una cancha, y una fecha, se instancia un turno y se lo agrega a la lista de turnos
   * @param canchaAAlquilar
   * @param fechaTurno
   */
  public void alquilarCancha(Cancha canchaAAlquilar, LocalDate fechaTurno){
    if((this.getUltimaCuotaPagada()) && (canchaAAlquilar != null) && (fechaTurno != null))
      // Se crea el turno aca mismo
      turnos.add(new Turno(fechaTurno, canchaAAlquilar));
  }

  public boolean alquiloLaCancha(Cancha canchaVerificar){
    for (Turno turnoActual : turnos) {
      if(turnoActual.getCanchaAlquilada().equals(canchaVerificar))
        return true;
    }

    return false;
  }

  public int getCantidadDeVecesQueAlquiloLaCancha(Cancha cancha){
    int cantidad = 0;
    for (Turno turnoActual : turnos) {
      if(turnoActual.getCanchaAlquilada().equals(cancha))
        cantidad++;
    }

    return cantidad;
  }

  public boolean contieneAlquileresPorUnMontoMayorA(double montoMinimo){
    for (Turno turno : turnos) {
      if(turno.getMontoPagado() > montoMinimo)
        return true;
    }

    return false;
  }

  @Override
  public String toString() {
    return "Nombre: " + this.getNombre() + 
            ", apellido: " + this.getApellido() + 
            ", edad: " + this.getEdad() + 
            ", ultima cuota pagada: " + this.getUltimaCuotaPagada() + 
            ", turnos: \n" + this.turnos + "\n";
  }
  @Override
  public boolean equals(Object obj) {
    Socio socio = (Socio)obj;
    return ((socio.getNombre() == this.getNombre()) && 
            (socio.getApellido() == this.getApellido()) &&
            (socio.getEdad() == this.getEdad()));
  }
}
