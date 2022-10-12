import java.util.ArrayList;

public class Cliente {
  private ArrayList<Copia> copias_a_disposicion;
  private String nombre, apellido, celular;
  private long dni;

  public Cliente(String nombre, String apellido, String celular, long dni){
    setNombre(nombre);
    setApellido(apellido);
    setCelular(celular);
    setDni(dni);
    copias_a_disposicion = new ArrayList<>();
  }

  // Setters
  public void setNombre(String nombre){this.nombre = nombre;}
  public void setApellido(String apellido){this.apellido = apellido;}
  public void setCelular(String celular){this.celular = celular;}
  public void setDni(long dni){this.dni = dni;}

  // Getters
  public String getNombre(){return nombre;}
  public String getApellido(){return apellido;}
  public String getCelular(){return celular;}
  public long getDni(){return dni;}
  
  /**
   * Devuelve un ArrayList con todas las copias de peliculas que posee el cliente 
   * @return ArrayList<Copia>
   */
  public ArrayList<Copia> getCopiasADisposicion() {
    return new ArrayList<>(copias_a_disposicion);
  }
  
  /**
   * Devuelve un ArrayList con todas las copias de peliculas que posee el cliente donde el plazo de alquiler se venció y todavia no devolvio
   * @return ArrayList<Copia>
   */
  public ArrayList<Copia> getCopiasVencidas() {
    ArrayList<Copia> copias_vencidas = new ArrayList<>();
    for (Copia copia : copias_a_disposicion) {
      if(copia.seVencioElAlquiler())
        copias_vencidas.add(copia);
    }
    return copias_vencidas;
  }

  public void alquilarCopiaPelicula(Pelicula pelicula_deseada, int cantidad_dias){
    Copia copia = pelicula_deseada.getCopiaDisponible();
    if(copia == null){System.out.println("No queda ninguna copia de '" + pelicula_deseada.getTitulo() + "'");}
    copia.setFechaDevolucionPorDias(cantidad_dias);
    copias_a_disposicion.add(copia);
  }

  /**
   * Dado un indice, devuelve la copia con ese indice de las copias del cliente
   * @param indice de la copia a obtener
   * @return La copia deseada
   */
  public Copia getCopiaPorIndice(int indice){
    return (indiceCopiaValido(indice))? copias_a_disposicion.get(indice) : null;
  }

  private boolean indiceCopiaValido(int indice){
    return (indice >= 0 && indice <= copias_a_disposicion.size());
  }

  public void devolverCopiaPelicula(int indice){
    // Validamos que el indice sea valido
    if(getCopiaPorIndice(indice) != null){
      Copia copia = copias_a_disposicion.get(indice);
      // Ponemos la fecha de devolucion en null, para dar a entender que no está alquilada
      copia.setEstaDisponible();
    }
  }
}
