package TP_2.consigna2;

import java.time.LocalDateTime;

public class Reunion {
  private Usuario[] participantes;
  private Usuario[] asistentes;
  private String lugar;
  private String tema_tratar;
  private LocalDateTime inicio_reunion;
  private LocalDateTime fin_reunion;

  public Reunion(String lugar, String tema_tratar, LocalDateTime inicio_reunion, LocalDateTime fin_reunion, Usuario[] participantes, Usuario[] asistentes){
    this.participantes = new Usuario[participantes.length];
    setParticipantes(participantes);
    this.asistentes = new Usuario[asistentes.length];
    setAsistentes(asistentes);
    setLugar(lugar);
    setTemaTratar(tema_tratar);
    setInicioReunion(inicio_reunion);
    setFinReunion(fin_reunion);
  }
  // Setters
  public void setLugar(String lugar) {
    this.lugar = lugar;
  }
  public void setTemaTratar(String tema_tratar) {
    this.tema_tratar = tema_tratar;
  }

  // Validaciones para settear el inicio de reunion (No se verifica que la reunion sea antes que la fecha y horario actual)
  public void setInicioReunion(LocalDateTime inicio_reunion) {
    if(inicio_reunion != null){
      if(getFin_reunion() != null){
        if(getFin_reunion().isAfter(inicio_reunion)){
          this.inicio_reunion = inicio_reunion;
        }
      }else{
        this.inicio_reunion = inicio_reunion;
      }
    }
  }

  // Validaciones para settear el fin de la reunion
  public void setFinReunion(LocalDateTime fin_reunion) {
    if(fin_reunion != null){
      if((this.getInicio_reunion() != null) && (this.getInicio_reunion().isBefore(fin_reunion))){
        this.fin_reunion = fin_reunion;
      }
    }
  }

  // Setteo de participantes
  public void setParticipantes(Usuario[] participantes) {
    if((participantes != null) && (participantes.length > 0)){
      for(int i = 0; i<participantes.length;i++){
        this.participantes[i] = participantes[i];
      }
    }
  }

  public void setAsistentes(Usuario[] asistentes) {
    if((asistentes != null) && (asistentes.length > 0)){
      for(int i = 0; i<asistentes.length;i++){
        this.asistentes[i] = asistentes[i];
      }
    }
    
  }
  // Getters
  public Usuario[] getParticipantes(){return this.participantes;}
  public Usuario[] getAsistentes(){return this.asistentes;}
  public String getTema_tratar(){return this.tema_tratar;}
  public LocalDateTime getInicio_reunion() {return this.inicio_reunion;}
  public LocalDateTime getFin_reunion() {return this.fin_reunion;}
  public String getLugar(){return this.lugar;}
  public String getDuracion(){
    int anios, meses, dias, horas, minutos;
    LocalDateTime inicio, fin;

    if((getInicio_reunion() != null) && (getFin_reunion() != null)){
      inicio = getInicio_reunion();
      fin = getFin_reunion();
      
      anios = Math.abs(inicio.getYear() - fin.getYear());
      meses = Math.abs(inicio.getMonthValue() - fin.getMonthValue());
      dias = Math.abs(inicio.getDayOfMonth() - fin.getDayOfMonth());
      horas = Math.abs(inicio.getHour() - fin.getHour());
      minutos = Math.abs(inicio.getMinute() - fin.getMinute());
      System.out.println("Entro");
      return "La reunion dura " + anios + " anios, " + meses + " meses, " + dias + " dias, " + horas + " horas y " + minutos + " minutos.";
    }
    System.out.println("Error al calcular el tiempo de duracion.");
    return null;
  }
}