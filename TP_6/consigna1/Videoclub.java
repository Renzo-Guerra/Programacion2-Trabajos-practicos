import java.util.ArrayList;

public class Videoclub {
  ArrayList<Pelicula> peliculas;
  ArrayList<Auto> autos;

  public Videoclub(){
    peliculas = new ArrayList<>();
    autos = new ArrayList<>();
  }
  
  public void agregarPelicula(Pelicula nueva_pelicula){
    if((nueva_pelicula != null) && (!peliculas.contains(nueva_pelicula))){
      peliculas.add(nueva_pelicula);
    }
  }

  /**
   * Devuelve un ArrayList con todas las peliculas del negocio.
   * @return (ArrayList<Pelicula>)
   */
  public ArrayList<Pelicula> getTodasLasPeliculas() {return new ArrayList<>(peliculas);}
  
  /**
   * Devuelve un ArrayList con todas las peliculas que tengan almenos 1 copia de la pelicula disponible.
   * @return (ArrayList<Pelicula>)
   */
  public ArrayList<Pelicula> getPeliculasDisponibles() {
    ArrayList<Pelicula> peliculas_devolver = new ArrayList<>();
    for (Pelicula pelicula : peliculas) {
      if(pelicula.getCantCopiasDisponibles() > 0)
      peliculas_devolver.add(pelicula);
    }
    return peliculas_devolver;
  }

  public void agregarAuto(Auto nuevo_auto){
    if((nuevo_auto != null) && (!autos.contains(nuevo_auto))){
      autos.add(nuevo_auto);
    }
  }

  public ArrayList<Auto> getTodosLosAutos() {return new ArrayList<>(autos);}
  
  public ArrayList<Auto> getAutosDisponibles() {
    ArrayList<Auto> autos_devolver = new ArrayList<>();
    for (Auto auto : autos) {
      if(auto.getDisponible())
        autos_devolver.add(auto);
    }
    return autos_devolver;
  }

}
