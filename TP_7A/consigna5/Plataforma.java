package TP_7A.consigna5;

import java.util.ArrayList;

import TP_7A.consigna5.condicion.abstractas.Condicion;
import TP_7A.consigna5.condicion.condicionesEspecificas.duracion.CDuracionMayorA;

public class Plataforma {
  private ArrayList<Pelicula> peliculas;
  private Condicion rentabilidad; // Que una pelicula sea "rentable" puede cambiar en plena ejecucion

  public Plataforma(Condicion rentabilidad){
    peliculas = new ArrayList<>();
    setRentabilidad(rentabilidad);
  }

  // Setters
  public void setRentabilidad(Condicion rentabilidad){
    // En caso de pasarle null, tiene una condicion por defecto...
    this.rentabilidad = (rentabilidad == null) ? new CDuracionMayorA(0) : rentabilidad;
  }

  public void agregarPelicula(Pelicula nuevaPelicula){
    if((nuevaPelicula != null) && (!peliculas.contains(nuevaPelicula))){
      peliculas.add(nuevaPelicula);
    }
  }

  public boolean laPeliculaSeraRentable(Pelicula peliculaVerificar){
    return this.rentabilidad.cumple(peliculaVerificar);
  }

    /**
   * Dada una condicion, devuelve todas las peliculas que cumplan la/s condicion/es.
   * @param condicion a cumplir.
   * @return (ArrayList<Pelicula>).
   */
  public ArrayList<Pelicula> getPeliculasWhere(Condicion condicion){
    ArrayList<Pelicula> resultados = new ArrayList<>();
    for (Pelicula pelicula : peliculas) {
      if(condicion.cumple(pelicula))
        resultados.add(pelicula);
    }

    return resultados;
  }

  public ArrayList<Pelicula> getAllPeliculas(){
    return new ArrayList<>(peliculas);
  }
}
