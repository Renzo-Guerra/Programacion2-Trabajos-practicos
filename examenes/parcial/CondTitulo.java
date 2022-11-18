package examenes.parcial;

public class CondTitulo extends Condicion{
  private String busqueda;
  
  public CondTitulo(String b){
    busqueda = b;
  }

  @Override
  public boolean seCumple(Noticia n) {
    return n.getCategoria().contains(busqueda);
  }
}
