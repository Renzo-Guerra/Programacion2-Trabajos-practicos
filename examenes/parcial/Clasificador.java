package examenes.parcial;

import java.util.ArrayList;

public class Clasificador {
  private ArrayList<String> palabras;
  private Condicion condicion;

  public Clasificador(Condicion condicion, ArrayList<String> palabras){
    setCondicion(condicion);
    agregarPalabras(palabras);
  }

  public void setCondicion(Condicion condicion) {
    this.condicion = condicion;
  }

  private void agregarPalabras(ArrayList<String> palabras){
    for (String palabra : palabras) {
      if(palabra != null && !palabras.contains(palabra)){
        palabras.add(palabra);
      }
    }
  }

  public void clasificar(Noticia noticia){
    if(this.condicion.seCumple(noticia)){
      for (String palabra : this.palabras) {
        noticia.agregarPalabra(palabra);
      }
    }
  }
}
