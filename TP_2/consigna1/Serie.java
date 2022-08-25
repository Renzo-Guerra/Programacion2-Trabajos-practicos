package TP_2.consigna1;

import java.text.DecimalFormat;

public class Serie {
  private String titulo;
  private String descripcion;
  private String genero;
  private Temporada[] temporadas;
  private String creador;
  private final static String DEFAULT_TITULO = "Titulo de serie no asignado";
  private final static String DEFAULT_DESCRIPCION = "Descripcion de serie no asignada";
  private final static String DEFAULT_GENERO = "Sin genero asignado";
  private final static String DEFAULT_CREADOR = "Sin creador asignado";
  private final static DecimalFormat FORMATO_DECIMAL = new DecimalFormat("#.00");

  public Serie(String titulo, String descripcion, Temporada[] temporadas, String genero, String creador){
    setTitulo(titulo);
    setDescripcion(descripcion);
    // Declaramos que el tamanio de la serie sea igual que el lenght del array de temporadas
    this.temporadas = new Temporada[temporadas.length];
    setTemporadas(temporadas);
    setGenero(genero);
    setCreador(creador);
  }

  // Setters
  public void setTitulo(String titulo) {
    this.titulo  = (titulo != null) ? titulo : DEFAULT_TITULO;
  }
  public void setDescripcion(String descripcion){
    this.descripcion = (descripcion != null) ? descripcion : DEFAULT_DESCRIPCION;
  }
  public void setTemporadas(Temporada[] temporadas){
    if(temporadas.length > 0){
      for(int i=0; i< temporadas.length;i++){
        this.temporadas[i] = temporadas[i];
      }
    }
  }

  public void setGenero(String genero) {
    this.genero = (genero != null) ? DEFAULT_GENERO : genero;
  }
  public void setCreador(String creador) {
    this.creador = (creador != null) ? DEFAULT_CREADOR : creador;
  }

  // Getters
  public String getTitulo(){return this.titulo;}
  public String getDescripcion(){return this.descripcion;}
  public String getGenero(){return this.genero;}
  public Temporada[] getTemporadas(){return this.temporadas;}
  public String getCreador(){return this.creador;}

  // Metodos
  public int contarCapsVistos(){
    int caps_vistos = 0;
    for (Temporada temporada : temporadas) {
      caps_vistos += temporada.contarCapsVistos();
    }

    return caps_vistos;
  }

  // Calcula el promedio de puntuacion de la serie
  public float calcularPromedio(){
    float acumulador = 0;
    for (Temporada temporada : temporadas) {
      acumulador += temporada.promedioCalificaciones();
    }

    // Retorna el promedio de calificacion x temporada (una vez aplicado el formato decimal);
    return Float.parseFloat(FORMATO_DECIMAL.format(acumulador / temporadas.length));
  }

  // Retorna si se vieron (o no) todos los caps de la serie
  public boolean vioTodosLosCaps(){
    for(Temporada temporada : temporadas){
      if(!temporada.vioTodosLosCaps()){return false;}
    }

    return true;
  }
}