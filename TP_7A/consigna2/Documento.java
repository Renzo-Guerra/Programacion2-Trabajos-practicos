package TP_7A.consigna2;

import java.util.ArrayList;

public class Documento {
  private String titulo, contenidoTextual;
  private ArrayList<String> autores, palabrasClaves;

  public Documento(String titulo, String contenidoTextual){
    setTitulo(titulo);
    setContenidoTextual(contenidoTextual);
    autores = new ArrayList<>();
    palabrasClaves = new ArrayList<>();
  }

  // Setters
  public void setTitulo(String titulo){this.titulo = titulo;}
  public void setContenidoTextual(String contenidoTextual){this.contenidoTextual = contenidoTextual;}

  // Getters
  public String getTitulo(){return titulo;}
  public String getContenidoTextual(){return contenidoTextual;}

  public void agregarAutor(String nuevoAutor){
    if((nuevoAutor != null) && !autores.contains(nuevoAutor)){
      autores.add(nuevoAutor);
    }
  }

  public void agregarPalabraClave(String nuevaPalabraClave){
    if((nuevaPalabraClave != null) && !palabrasClaves.contains(nuevaPalabraClave)){
      palabrasClaves.add(nuevaPalabraClave);
    }
  }

  public boolean contienePalabraClave(String palabraClaveBuscar){
    return palabrasClaves.contains(palabraClaveBuscar);
  }

  public boolean contieneAutor(String autorBuscar){
    return autores.contains(autorBuscar);
  }

  @Override
  public String toString() {
    return "Titulo: " + this.titulo + ", contenido: " + this.contenidoTextual + ", autores: " + this.autores + ", palabras claves: " + this.palabrasClaves + "\n";
  }

  @Override
  public boolean equals(Object obj) {
    Documento doc = (Documento)obj;
    return (doc.getTitulo() == this.getTitulo() && (this.autores.containsAll(doc.autores)));
  }
}
