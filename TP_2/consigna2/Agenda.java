package TP_2.consigna2;

public class Agenda {
  private Usuario duenio;
  private Reunion[] reuniones; // array de reuniones

  public Agenda(Usuario duenio, Reunion[] reuniones){
    setDuenio(duenio);
    setReuniones(reuniones);
  } 

  // Setters
  public void setDuenio(Usuario duenio){
    if(duenio != null){
      this.duenio = duenio;
    }
  }
  public void setReuniones(Reunion[] reuniones) {
    if (reuniones != null){
      for (int i=0; i<reuniones.length;i++) {
        this.reuniones[i] = reuniones[i];
      }
    }
  }

  // Getters
  public Usuario getDuenio() {
    return this.duenio;
  }
  public Reunion[] getReuniones() {
    return this.reuniones;
  }
}
