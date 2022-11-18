package examenes.parcial;

import java.util.ArrayList;

public class Seccion extends ElementoPE{
  private int posCategoria;
  protected ArrayList<ElementoPE> elementos;
  public static final String error = "Sin definir";

  public Seccion(int posCategoria){
    this.posCategoria = posCategoria;
    this.elementos = new ArrayList<>();
  }

  public void agregar(ElementoPE nuevoElemento){
    if(nuevoElemento != null){
      this.elementos.add(nuevoElemento);
    }
  }

  @Override
  public String getCategoria() {
    if(this.elementos.size() < (posCategoria + 1)){
      return Seccion.error;
    }else{
      return this.elementos.get(posCategoria).getCategoria();
    }
  }

  @Override
  public ArrayList<String> getPalabrasClaves() {
    ArrayList<String> devolver = new ArrayList<>();
    for (ElementoPE elemento : this.elementos) {
      ArrayList<String> aux = elemento.getPalabrasClaves();
      for (String palabra : aux) {
        if(!devolver.contains(palabra)){
          devolver.add(palabra);
        }
      }
    }
    
    return devolver;
  }
  @Override
  public String toString() {
    return "" + this.elementos + "\n";
  }

  @Override
  public ArrayList<Noticia> getNoticiasWhere(Condicion con) {
    ArrayList<Noticia> noticiasQueCumplen = new ArrayList<>();
    for(int i=0;i < this.elementos.size(); i++){
      ArrayList<Noticia> aux = elementos.get(i).getNoticiasWhere(con);
      for (Noticia noticia : aux) {
        if(!noticiasQueCumplen.contains(noticia)){
          noticiasQueCumplen.add(noticia);
        }
      }
    }

    return noticiasQueCumplen;
  }
}
