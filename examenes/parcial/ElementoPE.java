package examenes.parcial;

import java.util.ArrayList;

public abstract class ElementoPE {
  public abstract String getCategoria();
  public abstract ArrayList<String> getPalabrasClaves();
  public abstract ArrayList<Noticia> getNoticiasWhere(Condicion con);
}
