package TP_2.consigna4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Turno {
  private String tipo_cancha; // futbol / paddle
  private int numero_cancha;  
  private LocalDate fecha;
  private LocalTime horario_inicial;
  private int cant_horas;
  private final int PERIODO_MESES = 2;
  
  public Turno(Cancha cancha, LocalDate fecha, LocalTime horario_inicial, int cant_horas){
    setTipoCancha(cancha.getTipoDeCancha());
    setNumeroCancha(cancha.getNumeroDeCancha());
    setFecha(fecha);
    setHorarioInicial(horario_inicial);
    setCantHoras(cant_horas);
  }
  // Setters
  public void setTipoCancha(String tipo_cancha){this.tipo_cancha = tipo_cancha;}
  public void setNumeroCancha(int numero_cancha){this.numero_cancha = numero_cancha;}
  public void setFecha(LocalDate fecha){this.fecha = fecha;}
  public void setHorarioInicial(LocalTime horario_inicial){this.horario_inicial = horario_inicial;}
  public void setCantHoras(int cant_horas){this.cant_horas = cant_horas;}
  // Getters
  public String getTipoCancha(){return this.tipo_cancha;}
  public int getNumeroCancha(){return this.numero_cancha;}
  public LocalDate getFecha(){return this.fecha;}
  public LocalTime getHorarioInicial(){return this.horario_inicial;}
  public int getCantHoras(){return this.cant_horas;}
  public LocalTime getHorarioFinal(){
    // El metodo plusHours necesita un tipo long
    long cant_horas = Integer.toUnsignedLong(getCantHoras());
    
    return getHorarioInicial().plusHours(cant_horas);
  }
  public int getPeridodoMeses(){return this.PERIODO_MESES;}
  
  // Verifica que el turno este dentro de los ultimos 2 meses.
  public boolean estaDentroDelPeriodo(){
    Period diferencia = Period.between(getFecha(), LocalDate.now());
    return (diferencia.getMonths() <= this.getPeridodoMeses());
  }
}
