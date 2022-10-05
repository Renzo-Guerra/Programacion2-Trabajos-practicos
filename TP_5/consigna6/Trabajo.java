package consigna6;

import java.util.ArrayList;

public class Trabajo {
  private String autor;
  private String categoria;
  protected ArrayList<String> temas_tratados;

  public Trabajo(String autor, String categoria){
    setAutor(autor);
    this.categoria = categoria;
    temas_tratados = new ArrayList<>();
  }

  // Setter
  public void setAutor(String autor){this.autor = autor;}
  
  // Getters
  public String getCategoria(){return categoria;}
  public String getAutor(){return autor;}

  public void agregarTema(String nuevo_tema){
    if((nuevo_tema != null) && ((!temas_tratados.contains(nuevo_tema)))){
      this.temas_tratados.add(nuevo_tema);
    }
  }

  /**
   * Dado un evaluador, verifica que este tenga conocimientos sobre cada tema_tratado en el trabajo.
   * @param evaluador a examinar.
   * @return true / false.
   */
  public boolean elEvaluadorEsApto(Evaluador evaluador){
    return evaluador.conocimientos.containsAll(temas_tratados);
  }

  @Override
  public String toString() {
    return "Categoria: " + getCategoria() + ", autor: " + getAutor() + ", temas tratados: " + this.temas_tratados + "\n";
  }
}
