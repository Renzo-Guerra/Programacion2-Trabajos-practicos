package probando;

public class Main {
  public static void main(String[] args) {
    Padre padre = new Padre(10);
    System.out.println("Valor del padre: " + padre.getValor());
    Hijo hijo = new Hijo(5);
    System.out.println("Valor del hijo: " + hijo.getValor());
    System.out.println("Valor del padre: " + padre.getValor());

  }
}
