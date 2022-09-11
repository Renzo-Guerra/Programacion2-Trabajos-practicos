package TP_3.consigna1;

public class EncuestaC {
  private EncuestaSinC encuesta_respondida;
  private Empleado empleado;
  private long dni_encuestado;
  
  public EncuestaC(EncuestaSinC encuesta_respondida, long dni_encuestado, Empleado empleado){
    this.encuesta_respondida = encuesta_respondida;
    this.dni_encuestado = dni_encuestado;
    this.empleado = empleado;
  }

  // Getters
  public int getEncuestaRespondida(){return encuesta_respondida.getId();}
  public long getDniEncuestado(){return dni_encuestado;}
  public Empleado getEmpleado(){return empleado;}

  @Override
  public boolean equals(Object encuesta_comparar){
    EncuestaC encuesta = (EncuestaC)encuesta_comparar;
    // Si el DNI y el id de la encuesta coinciden, son iguales
    return ((encuesta.getEncuestaRespondida() == this.getEncuestaRespondida()) && (encuesta.getDniEncuestado() == this.getDniEncuestado()));
  }

  @Override
  public String toString(){
    return "{Id encuesta: " + getEncuestaRespondida() + ", empleado: [" + getEmpleado() + "], dni del encuestado: " + getDniEncuestado() + "}";
  }
}