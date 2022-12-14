package TP_1.consigna2;

// Permite especificar la cantidad de decimales en un float
import java.text.DecimalFormat;

public class Electrodomestico{
  private String nombre;
  private float precio_base;
  private String color;
  private float consumo_energetico; // Medido en Kw
  private float peso;

  // Constructores
  public Electrodomestico(String nombre){
    this(nombre, 0, "", 0, 0);
  }
  public Electrodomestico(String nombre, float precio_base){
    this(nombre, precio_base, "", 0, 0);
  }
  public Electrodomestico(String nombre, float precio_base, String color){
    this(nombre, precio_base, color, 0, 0);
  }
  public Electrodomestico(String nombre, float precio_base, String color, float consumo_energetico){
    this(nombre, precio_base, color, consumo_energetico, 0);
  }
  public Electrodomestico(String nombre, float precio_base, String color, float consumo_energetico, float peso){
    setNombre(nombre);
    setPrecioBase(precio_base);
    setColor(color);
    setConsumoEnergetico(consumo_energetico);
    setPeso(peso);
  }

  // Setters
  public void setNombre(String nombre){
    final String default_nombre = "sin nombre asignado";
    if(nombre.equals("") || nombre.equals(" ")){
      System.out.println("ADVERTENCIA: Nombre vacio!!!");
      this.nombre = default_nombre;
    }else{
      this.nombre = nombre;
    } 
  }

  public void setPrecioBase(float precio_base){
    final DecimalFormat formato1 = new DecimalFormat("#.00");
    final float default_precio_base = Float.parseFloat(formato1.format(100));

    if((precio_base <= 0)){
      System.out.println("ADVERTENCIA: precio_base incoherente !");
      this.precio_base = default_precio_base;
    }else{
      /*
      * - Agregamos el formato prestablecido.
      * - Usamos el Float.parseFloat porque al prestablecerle un formato, devuelve un String
      */ 
      precio_base = Float.parseFloat(formato1.format(precio_base));
      this.precio_base = precio_base;
    } 
  }

  public void setColor(String color){
    final String default_color = "gris plata";

    if((color.equals("")) || (color.equals(" "))){
      System.out.println("ADVERTENCIA: color vacio !!!");
      this.color = default_color;
    }else{
      this.color = color;
    }
  }
  
  public void setConsumoEnergetico(float consumo_energetico){
    final DecimalFormat formato1 = new DecimalFormat("#.00");
    final float default_consumo_energetico = Float.parseFloat(formato1.format(10));
    
    if(consumo_energetico <= 0){
      System.out.println("ADVERTENCIA: consumo_electrico = 0 !");
      this.consumo_energetico = default_consumo_energetico;
    }else{
      consumo_energetico = Float.parseFloat(formato1.format(consumo_energetico));
      this.consumo_energetico = consumo_energetico;
    }
  }

  public void setPeso(float peso){
    final DecimalFormat formato1 = new DecimalFormat("#.00");
    final float default_peso = Float.parseFloat(formato1.format(2));

    if(peso <= 0){
      System.out.println("ADVERTENCIA: peso = 0 !");
      this.consumo_energetico = default_peso;
    }else{
      peso = Float.parseFloat(formato1.format(peso));
      this.peso = peso;
    }
  }

  // Getters
  public String getNombre(){return this.nombre;}
  public float getPrecioBase(){return this.precio_base;}
  public String getColor(){return this.color;}
  public float getConsumoEnergetico(){return this.consumo_energetico;}
  public float getPeso(){return this.peso;}

  // Metodos:
  public boolean esDeBajoConsumo(){
    final DecimalFormat formato1 = new DecimalFormat("#.00");
    final float VALOR_TOPE = Float.parseFloat(formato1.format(45));

    return (getConsumoEnergetico() < VALOR_TOPE)? true : false;
  }
  
  public float calcularBalance(){
    final DecimalFormat formato1 = new DecimalFormat("#.00");
    float balance_final = getPrecioBase() / getPeso();

    return Float.parseFloat(formato1.format(balance_final));
  }

  public boolean esDeAltaGama(){
    final DecimalFormat formato1 = new DecimalFormat("#.00");
    final float VALOR_MINIMO = Float.parseFloat(formato1.format(3));

    return (calcularBalance() > VALOR_MINIMO)? true : false;
  }

  public void mostrarDatos(){
    System.out.println("Nombre: " + this.getNombre());
    System.out.println("Precio base: $" + this.getPrecioBase());
    System.out.println("Color: " + this.getColor());
    System.out.println("Consumo energetico: " + this.getConsumoEnergetico() + " KwH");
    System.out.println("Peso: " + this.getPeso() + " Kg");
    System.out.println("");
  }
}