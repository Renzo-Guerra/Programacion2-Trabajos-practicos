package TP_2.consigna4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Turno {
  private Cancha cancha;
  private Usuario usuario;
  private LocalDateTime inicio_turno;
  private int cant_horas;
  private final int PERIODO_MESES = 2;
  
  public Turno(Cancha cancha, Usuario usuario, LocalDateTime inicio_turno, int cant_horas){
    setCancha(cancha);
    setUsuario(usuario);
    setInicioTurno(inicio_turno);  
    setCantHoras(cant_horas);
  }
  // Setters
  public void setCancha(Cancha cancha){this.cancha = cancha;}
  public void setUsuario(Usuario usuario){this.usuario = usuario;}
  public void setInicioTurno(LocalDateTime inicio_turno){this.inicio_turno = inicio_turno;}
  public void setCantHoras(int cant_horas){this.cant_horas = cant_horas;}
  
  // Getters
  public Cancha getCancha(){return cancha;}
  public Usuario getUsuario(){return usuario;}
  public LocalDateTime getInicioTurno(){return inicio_turno;}
  public int getCantHoras(){return cant_horas;}  
  public double getMontoPagar(){
    // valor = precio de la cancha * cantidad de horas que se reserva.
    double valor = (getCancha().getPrecio()) * getCantHoras();
    // En caso de que sea socio, a valor se le quita el x %, caso que NO sea socio, se le cobrará el precio completo.
    return (getUsuario().esSocio())? (valor - (valor * (Usuario.getDescuentoSocioPorcentaje() / 100))) : valor;
  }

  /**
   * Toma el inicio_turno (LocalDateTime) y le agrega las x horas que 
   * dura el turno.  
   * @return el horario de finalizacion del turno (LocalDateTime)
   */
  public LocalDateTime getHorarioFinal(){
    // El horario final es
    return getInicioTurno().plusHours(Long.valueOf(getCantHoras())).minusSeconds(1); 
  }
  
  public int getPeridodoMeses(){return this.PERIODO_MESES;}
  
  // Verifica que el turno este dentro de los ultimos PERIODO_MESES meses.
  public boolean estaDentroDelPeriodo(){
    // Period.between solo toma valores de tipo LocalDate
    Period diferencia = Period.between(getInicioTurno().toLocalDate(), LocalDate.now());
    
    return (diferencia.getMonths() <= this.getPeridodoMeses());
  }
}
