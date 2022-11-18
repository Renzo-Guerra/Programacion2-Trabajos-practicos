package examenes.parcial;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Noticia extends ElementoPE{
  private String contenido, titulo, autor, categoria;
  protected ArrayList<String> palabrasClaves;
  
  public Noticia(String contenido, String titulo, String autor, String categoria){
    setContenido(contenido);
    setTitulo(titulo);
    setAutor(autor);
    setCategoria(categoria);
    palabrasClaves = new ArrayList<>();
  }

  public void setContenido(String contenido){this.contenido = contenido;}
  public void setTitulo(String titulo){this.titulo = titulo;}
  public void setAutor(String autor){this.autor = autor;}
  public void setCategoria(String categoria){this.categoria = categoria;}

  public String getTitulo(){return this.titulo;}
  public String getAutor(){return this.autor;}
  public String getContenido(){return this.contenido;}  

  public void agregarPalabra(String nuevaPalabra){
    if(nuevaPalabra != null && !this.palabrasClaves.contains(nuevaPalabra)){
      this.palabrasClaves.add(nuevaPalabra);
    }
  }

  @Override
  public String getCategoria() {
    return this.categoria;
  }

  @Override
  public ArrayList<String> getPalabrasClaves() {
    return new ArrayList<>(this.palabrasClaves);
  }

  public ArrayList<Noticia> getNoticiasWhere(Condicion con){
    ArrayList<Noticia> aux = new ArrayList<>();
    if(con.seCumple(this)){
      aux.add(this);
    }

    return aux;
  }
  
  @Override
  public String toString() {
    return "Titulo: " + this.titulo + ", contenido: " + this.contenido + ", autor: " + this.autor + ", categoria: " + this.categoria + "\n";
  }
  
  @Override
  public boolean equals(Object obj) {
    Noticia noticia = (Noticia)obj;
    return ((noticia.getTitulo() == this.getTitulo()) && (noticia.getAutor() == this.getAutor()) && (noticia.getCategoria() == this.getCategoria()) && (noticia.getContenido() == this.getContenido()));
  }
}
