package TP_7A.consigna5;

import java.util.ArrayList;

public class Pelicula {
  private String titulo, sinopsis, director;
  private ArrayList<String> generos, actores;
  private int anioEstreno, duracionPelicula, edadMinimaRequerida; // La duracion de la pelicula es en minutos

  public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, int duracionPelicula, int edadMinimaRequerida){
    setTitulo(titulo);
    setSinopsis(sinopsis);
    setDirector(director);
    setAnioEstreno(anioEstreno);
    setDuracionPelicula(duracionPelicula);
    setEdadMinimaRequerida(edadMinimaRequerida);
    generos = new ArrayList<>();
    actores = new ArrayList<>();
  }

  // Setters
  public void setTitulo(String titulo) {this.titulo = titulo;}
  public void setSinopsis(String sinopsis){this.sinopsis = sinopsis;}
  public void setDirector(String director){this.director = director;}
  public void setAnioEstreno(int anioEstreno) {this.anioEstreno = anioEstreno;}
  public void setDuracionPelicula(int duracionPelicula){this.duracionPelicula = duracionPelicula;}
  public void setEdadMinimaRequerida(int edadMinimaRequerida){this.edadMinimaRequerida = edadMinimaRequerida;}

  // Getters
  public String getTitulo(){return this.titulo;}
  public String getSinopsis(){return this.sinopsis;}
  public String getDirector(){return this.director;}
  public int getAnioEstreno(){return this.anioEstreno;}
  public int getDuracionPelicula(){return this.duracionPelicula;}
  public int getEdadMinimaRequerida(){return this.edadMinimaRequerida;}

  public void agregarGenero(String nuevoGenero){
    if((nuevoGenero != null) && (!generos.contains(nuevoGenero))){
      generos.add(nuevoGenero);
    }
  }

  public void agregarActor(String nuevoActor){
    if((nuevoActor != null) && (!actores.contains(nuevoActor))){
      actores.add(nuevoActor);
    }
  }

  /**
   * Dado un genero de pelicula, devuelve si es o no si la pelicula es de ese genero.
   * @param generoConsultar de la pelicula.
   * @return true / false (boolean).
   */
  public boolean contieneGenero(String generoConsultar){
    return generos.contains(generoConsultar);
  }

  /**
   * Dado el nombre de un actor, devuelve si actuó o no en la pelicula.
   * @param actorConsultar participacion en la pelicula.
   * @return true / false (boolean).
   */
  public boolean contieneActor(String actorConsultar){
    return actores.contains(actorConsultar);
  }

  @Override
  public String toString() {
    return "Titulo: " + this.titulo + ", Sinopsis: " + this.sinopsis + ", Director: " + this.director +
    ", Año de estreno: " + this.anioEstreno + ", duracion: " + this.duracionPelicula + " minutos.\nGeneros: " +
    this.generos + "\nActores: " + this.actores + "\n";
  }

  @Override
  public boolean equals(Object obj) {
    Pelicula pelicula = (Pelicula)obj;
    return ((pelicula.getTitulo() == this.getTitulo()) && 
            (pelicula.getDirector() == this.getDirector()) &&
            (pelicula.getAnioEstreno() == this.getAnioEstreno()));
  }
}
