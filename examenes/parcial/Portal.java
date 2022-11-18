package examenes.parcial;

import java.util.ArrayList;

public class Portal {
  private ArrayList<ElementoPE> elementos;
  private ArrayList<Clasificador> clasificadores;
  public Portal(){
    this.elementos = new ArrayList<>();
  }

  public void agregar(ElementoPE nuevoElemento){
    if(nuevoElemento != null){
      elementos.add(nuevoElemento);
    }
  }

  public void agregarClasificador(Clasificador nuevoClasificador){
    if(nuevoClasificador != null){
      clasificadores.add(nuevoClasificador);
    }
  }
  public ArrayList<Noticia> getNoticiasWhere(Condicion condicion){
    ArrayList<Noticia> noticiasQueCumplen = new ArrayList<>();
    for(int i=0;i<this.elementos.size();i++){
      ArrayList<Noticia> aux = elementos.get(i).getNoticiasWhere(condicion);
      for (Noticia noticia : aux) {
        if(!noticiasQueCumplen.contains(noticia)){
          noticiasQueCumplen.add(noticia);
        }
      }
    }

    return noticiasQueCumplen;
  }

  public void clasificarNoticia(Noticia noticia){
    for (Clasificador clasificador : clasificadores) {
      clasificador.clasificar(noticia);
    }
  }
}
