package TP_1.consigna1;

// Permite el uso del objeto LocalDate
import java.time.LocalDate; 
// Toman un LocalDate y devuelven una fecha (de tipo String) con x formato que le especifiquemos
import java.time.format.DateTimeFormatter; 
// Permite restar 2 fechas (Sacar la diferencia)
import java.time.temporal.ChronoUnit;

/*
 * LEER: al usar this.variable hacemos referencia al atributo del objeto en si.
 * ej: this.nombre = nombre;
 * el "this.nombre" hace referencia a la direccion de memoria del atributo nombre de ese objeto, 
 * al cual le estoy asignado el valor de "nombre".
 * 
 * LocalDate.parse(String) solo funciona con Strings que siguen este patron "yyyy/MM/dd", 
 * es por eso que se importo "DateTimeFormatter", para asegurarnos que todas las fechas
 * sigan ese patron
*/

public class Persona{
  // Variables:
  private int DNI;    
  private String nombre;
  private String fecha_nacimiento;   // dd/mm/yyyy
  private int edad;
  private char sexo;  // m | f
  private int altura; // La altura es en centimetros
  private int peso; // El peso es en kilos

  // SOBRECARGA DE CONSTRUCTORES
  public Persona(int DNI){
    this(DNI, "");
  }
  public Persona(int DNI, String nombre){
    this(DNI, nombre, "");
  }
  public Persona(int DNI, String nombre, String fecha_nacimiento){
    this(DNI, nombre, fecha_nacimiento, ' ');
  }
  public Persona(int DNI, String nombre, String fecha_nacimiento, char sexo){
    this(DNI, nombre, fecha_nacimiento, sexo, 0);
  }
  public Persona(int DNI, String nombre, String fecha_nacimiento, char sexo, int altura){
    this(DNI, nombre, fecha_nacimiento, sexo, altura, 0);
  }
  public Persona(int DNI, String nombre, String fecha_nacimiento, char sexo, int altura, int peso){
    this.DNI = DNI;
    setNombre(nombre);
    setFechaNacimiento(fecha_nacimiento);
    /*
     * A futuro se implementará una metodo el cual a traves de una fecha,
     * devolvera la cantidad de años que pasaron.
    */
    // setEdad();
    setSexo(sexo);
    setAltura(altura);
    setPeso(peso);
  }

  public void setNombre(String nombre){
    final String default_nombre = "N N";

    // Comparamos que el nombre ingresado no sea una cadena vacia
    if(nombre.equals("")){
      System.out.println("Se asigno el value por defecto a nombre, ya que [" + nombre + "] es invalido.");
      this.nombre = default_nombre;
    }else{
      this.nombre = nombre;
    }
  }

  public void setFechaNacimiento(String fecha_nacimiento){
    // Formato que se usará para guardar las fechas
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    // Por default, se utilizará la fecha 01/01/2000
    final String default_fecha_nacimiento = LocalDate.of(2000, 1, 1).format(formato); 

    // Comprobamos que la fecha ingresada no sea una cadena vacia
    if(!fecha_nacimiento.equals("")){
      this.fecha_nacimiento = fecha_nacimiento.formatted(formato);
    }else{
      System.out.println("Se asigno el value por defecto a fecha de nacimiento, ya que [" + fecha_nacimiento + "] es invalido.");
      this.fecha_nacimiento = default_fecha_nacimiento;
    }
  }

  public void setSexo(char sexo){
    final char default_sexo = 'f';

    switch(sexo){
      case 'f': case 'm': {
        this.sexo = sexo;
        break;
      }
      default: {
        System.out.println("El genero ingresado [" + sexo +  "] es invalido, se asigno el valor por defecto.");
        this.sexo = default_sexo;
        break;
      }
    }
  }
  
  public void setPeso(int peso){
    final int default_peso = 1;

    if(peso <= 0){
      System.out.println("El peso ingresado [" + peso +  "] es invalido, se asigno el valor por defecto.");
      this.peso = default_peso;
    }else{
      this.peso = peso;
    }
  }

  public void setAltura(int altura){
    final int default_altura = 1;

    if(altura <= 0){
      System.out.println("La altura ingresada [" + altura +  "] es invalida, se asigno el valor por defecto.");
      this.altura = default_altura;
    }else{
      this.altura = altura;
    }
  }
  // Getters:
  public int getDNI(){return this.DNI;}
  public String getNombre(){return this.nombre;}
  public String getFechaNacimiento(){
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    /* 
    * Para usar el formato, la fecha a formatear debe ser de tipo LocalDate, por eso
    * usamos una variable auxiliar (fecha_devolver)
    */
    LocalDate fecha_devolver = LocalDate.parse(this.fecha_nacimiento); 

    return fecha_devolver.format(formato); // Devuelve la fecha del usuario, con el patron indicado.
  }
  public char getSexo(){return this.sexo;}
  public int getPeso(){return this.peso;}
  public int getAltura(){return this.altura;}
}