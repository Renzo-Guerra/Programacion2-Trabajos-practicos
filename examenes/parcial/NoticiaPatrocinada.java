package examenes.parcial;

import java.util.ArrayList;

public class NoticiaPatrocinada extends Noticia{

  public NoticiaPatrocinada(String contenido, String titulo, String autor, String categoria) {
    super(contenido, titulo, autor, categoria);
  }

  @Override
  public ArrayList<Noticia> getNoticiasWhere(Condicion con){
    ArrayList<Noticia> aux = new ArrayList<>();
    aux.add(this);
    
    return aux;
  }
}
