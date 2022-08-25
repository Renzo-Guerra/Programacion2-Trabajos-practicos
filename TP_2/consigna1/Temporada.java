package TP_2.consigna1;

import java.text.DecimalFormat;

public class Temporada {
  private Capitulo[] capitulos;
  private final static DecimalFormat FORMATO_DECIMAL = new DecimalFormat("#.00");

  // El constructor es un array de tipo Capitulo, el cual contiene todos los capitulos
  public Temporada(Capitulo[] capitulos){
    // Declaramos que el tamanio de la temporada sea igual que el lenght del array de capitulos
    this.capitulos = new Capitulo[capitulos.length];
    setCapitulos(capitulos);
  }

  // Setter
  public void setCapitulos(Capitulo[] capitulos) {
    for(int i=0; i< capitulos.length;i++){
      this.capitulos[i] = capitulos[i];
    }
  }

  // Getters
  public Capitulo[] getCapitulos(){return this.capitulos;}

  // Metodos
  public int contarCapsVistos(){
    int caps_vistos = 0;
    for (Capitulo capitulo : capitulos) {
      caps_vistos += (capitulo.getVisto())? 1 : 0;
    }

    return caps_vistos;
  }

  // Calcula el promedio de puntuacion de la temporada.
  public float promedioCalificaciones(){
    int caps_vistos = 0, acumulador = 0;
    float promedio;

    for(Capitulo capitulo : capitulos){
      if(capitulo.getVisto()){
        acumulador += capitulo.getCalificaicon();
        caps_vistos++;
      }
    }
    // Se calcula el promedio teniendo en cuenta la division por cero.
    promedio = (caps_vistos == 0) ? 0 : (acumulador / caps_vistos);
    // Se aplica el formato decimal y se retorna.
    return (Float.parseFloat(FORMATO_DECIMAL.format(promedio)));
  }

  // Retorna si se vieron (o no) todos los capitulos de la temporada
  public boolean vioTodosLosCaps(){
    for (Capitulo capitulo : capitulos) {
      if(!capitulo.getVisto()){return false;}
    }

    return true;
  }
}
