package consigna4;

import java.util.ArrayList;

public class Ciudad {
  private String nombre;
  private ArrayList<Contribuyente> contribuyentes;
  private long gastos_realizados;

  public Ciudad(String nombre, long gastos_realizados){
    setNombre(nombre);
    setGastosRealizados(gastos_realizados);
  }

  // Setters
  /*
   * - La mayoria de setters son privados, sino se podria restar al monto ya acumulado... 
   * - El nombre una vez setteado no se puede cambiar!!!
  */
  private void setNombre(String nombre){this.nombre = nombre;}
  private void setGastosRealizados(long gastos_realizados) {this.gastos_realizados = Math.abs(gastos_realizados);}

  // Getters
  public long getCantHabitantes(){return contribuyentes.size();}
  public long getGastosRealizados(){return gastos_realizados;}
  public String getNombre(){return nombre;}

  // Metodos
  /*
   * Estos son los metodos publicos que devuelven informacion relevante. 
   * 
  */
  
  public void agregarDineroAGastosRealizados(long dinero){
    if(dinero >= 0){
      this.gastos_realizados += dinero;
    }
  }
  public double sumaTotalDeImpuestos(){
    double total_impuestos = 0;
    for (Contribuyente contribuyente : contribuyentes) {
      total_impuestos += contribuyente.getMontoTotalPagar();
    }

    return total_impuestos;
  }
  public boolean gastaMasDeLoQueRecauda(){
    return (getGastosRealizados() > sumaTotalDeImpuestos());
  }
}