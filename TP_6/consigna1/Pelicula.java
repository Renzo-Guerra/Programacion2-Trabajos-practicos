import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
  private String titulo;
  private String sinopsis;
  private String director;
  private LocalDate fecha_estreno;
  private ArrayList<Copia> copias;

  public Pelicula(String titulo, String sinopsis, String director, LocalDate fecha_estreno){
    setTitulo(titulo);
    setSinopsis(sinopsis);
    setDirector(director);
    setFechaEstreno(fecha_estreno);
    copias = new ArrayList<>();
  }

  // Setters
  public void setTitulo(String titulo){this.titulo = titulo;}
  public void setSinopsis(String sinopsis){this.sinopsis = sinopsis;}
  public void setDirector(String director){this.director = director;}
  public void setFechaEstreno(LocalDate fecha_estreno){this.fecha_estreno = fecha_estreno;}

  // Getters
  public String getTitulo(){return this.titulo;}
  public String getSinopsis(){return this.sinopsis;}
  public String getDirector(){return director;}
  public LocalDate getFechaEstreno(){return this.fecha_estreno;}
  public int getCantCopias(){return this.copias.size();}
  public int getCantCopiasDisponibles(){
    int cant_disponibles = 0;
    for (Copia copia : copias) {
      if(copia.getEstaDisponible()){
        cant_disponibles++;
      }
    }

    return cant_disponibles;
  }

  public Copia getCopiaDisponible(){
    for (Copia copia : copias) {
      if(copia.getEstaDisponible()){
        return copia;
      }
    }

    return null;
  }

  /**
   * Crea y agrega tantas copias de la pelicula indicadas por parametro
   * @param cantidad (int), valor minimo aceptado 1, valor maximo aceptado 10.
   */
  public void agregarCopias(int cantidad){
    final int CANT_MIN = 1;
    final int CANT_MAX = 10;
    if((cantidad >= CANT_MIN) && (cantidad <= CANT_MAX)){
      for(int i = 0; i< cantidad;i++){
        Copia copia = new Copia(this);
        copias.add(copia);
      }
    }
  }

  @Override
  public boolean equals(Object o){
    Pelicula pelicula = (Pelicula) o;
    return (pelicula.titulo == this.titulo) && (pelicula.director == this.director);
  }

  @Override
  public String toString() {
    return "Titulo: " + this.titulo + ", director: " + this.director + ", fecha de estreno: " + this.fecha_estreno + ", copias totales: " + getCantCopias() + ", copias disponibles: " + getCantCopiasDisponibles() + "\n";
  }
}