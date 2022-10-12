import java.time.LocalDate;

public class Copia {
  private Pelicula pelicula;
  LocalDate fecha_devolucion;

  public Copia(Pelicula pelicula){
    this.pelicula = pelicula;
    setEstaDisponible();
  }

  // Getters
  public String getTitulo(){return pelicula.getTitulo();}
  public String getSinopsis(){return pelicula.getSinopsis();}
  public LocalDate getFechaEstreno(){return pelicula.getFechaEstreno();}
  public LocalDate getFechaDevolucion(){return fecha_devolucion;}
  public boolean getEstaDisponible(){return (fecha_devolucion == null);}

  // Setters
  public void setFechaDevolucionPorDias(int dias_alquilado) {
    this.fecha_devolucion = LocalDate.now().plusDays(dias_alquilado);
  }
  public void setEstaDisponible(){this.fecha_devolucion = null;}

  /**
   * Evalua:
   * - Si la copia esta alquilada.
   * - Si la fecha de devolucion es anterior a la fecha actual.
   * 
   * @return true / false.
   */
  public boolean seVencioElAlquiler(){
    return (getEstaDisponible() && (getFechaDevolucion().isBefore(LocalDate.now())));
  }

  @Override
  public String toString() {
    return "Titulo: " + this.pelicula.getTitulo() + ", director: " + this.pelicula.getDirector() + ", fecha de estreno: " + this.pelicula.getFechaEstreno() + ", fecha devolucion: " + this.fecha_devolucion + "\n";
  }
}
