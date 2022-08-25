package TP_2.consigna1;

public class Capitulo {
  private String titulo;
  private String descripcion;
  private boolean visto;
  private int calificacion;
  private final static String DEFAULT_TITULO = "Titulo sin asignar";
  private final static String DEFAULT_DESCRIPCION = "Descripcion sin asignar";
  private final static int DEFAULT_CALIFICACION_NO_VISTO = -1;
  private final static int MENOR_CALIFICACION_POSIBLE = 1;
  private final static int MAYOR_CALIFICACION_POSIBLE = 5;

  public Capitulo(String titulo, String descripcion, int calificacion, boolean visto){
    setTitulo(titulo);
    setDescripcion(descripcion);
    setVisto(visto);
    setCalificacion(calificacion);
  }
  // Setters
  public void setTitulo(String titulo){this.titulo = (titulo != null)? titulo : DEFAULT_TITULO;}
  public void setDescripcion(String descripcion){this.descripcion = (descripcion != null)? descripcion : DEFAULT_DESCRIPCION;}
  public void setVisto(boolean visto){this.visto = (visto);}
  public void setCalificacion(int calificacion){
    // Si el capitulo fue visto, se checkea si se puede o no asignar la calificacion
    if(this.getVisto()){
      if((calificacion >= MENOR_CALIFICACION_POSIBLE) && (calificacion <= MAYOR_CALIFICACION_POSIBLE)){
        this.calificacion = calificacion;
      }else{
        // Por default se asigna el valor de cota mas cercana (El mayor puntaje o el menor puntaje)
        System.out.println("Error: La calificacion ingresada fue de [" + calificacion + "]. Valor minimo: " + MENOR_CALIFICACION_POSIBLE + " | Valor maximo: " + MAYOR_CALIFICACION_POSIBLE);  
        this.calificacion = (calificacion < MENOR_CALIFICACION_POSIBLE)? MENOR_CALIFICACION_POSIBLE : MAYOR_CALIFICACION_POSIBLE;
      }
    }else{
      System.out.println("Para poder asignarle una puntuacion, primero debe ver el capitulo.");
      this.calificacion = DEFAULT_CALIFICACION_NO_VISTO;
    }
  }
  
  // Getters
  public String getTitulo(){return this.titulo;}
  public String getDescripcion(){return this.descripcion;}
  public boolean getVisto(){return this.visto;}
  public int getCalificaicon(){return this.calificacion;}
  public int getDefaultCalificacion(){return DEFAULT_CALIFICACION_NO_VISTO;}
}