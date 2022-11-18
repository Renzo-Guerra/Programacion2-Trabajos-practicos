package examenes.parcial;

import java.util.ArrayList;
import java.util.Collections;

public class SeccionPrimeras extends Seccion{
  private int cantDevolver;
  private String categoria;

  public SeccionPrimeras(int cantDevolver, String categoria) {
    super(0);
    setCantDevolver(cantDevolver);
    setCategoria(categoria);  
  }

  public void setCategoria(String categoria){this.categoria = categoria;}
  public void setCantDevolver(int cantDevolver){this.cantDevolver = cantDevolver;}

  @Override
  public String getCategoria(){
    return this.categoria;
  }

  @Override
  public ArrayList<String> getPalabrasClaves(){
    ArrayList<String> palabras = super.getPalabrasClaves();
    Collections.sort(palabras);
    
    ArrayList<String> devolver = new ArrayList<>();

    int i = 0;
    while(i < cantDevolver && devolver.size() <= (i+1)){
      devolver.add(palabras.get(i));
      i++;
    }

    return devolver;
  }
}
