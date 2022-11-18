package examenes.parcial;

public class CondCategoria extends Condicion{
  private String busqueda;
  
  public CondCategoria(String b){
    busqueda = b;
  }

  @Override
  public boolean seCumple(Noticia n) {
    return n.getCategoria().equals(busqueda);
  }
}
