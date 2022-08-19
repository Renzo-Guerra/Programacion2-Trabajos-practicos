package TP_1.consigna1;

/*
 * LEER: al usar this.variable hacemos referencia al atributo del objeto en si.
 * ej: this.nombre = nombre;
 * el "this.nombre" hace referencia a la direccion de memoria del atributo nombre de ese objeto, 
 * al cual le estoy asignado el valor de "nombre".
 * 
*/

public class Persona{
  // Variables:
  private int DNI;    
  private String nombre;
  private String fecha_nacimiento;
  // private int edad;
  private char sexo;  // M | F
  private int altura; // La altura es en centimetros
  private int peso; // El peso es en kilos

  // Default values:
  private final String default_nombre = "N N";
  private final String default_fecha_nacimiento = "01/01/2000";
  private final char default_sexo = 'f';
  private final int default_altura = 1;
  private final int default_peso = 1;

  // SOBRECARGA DE CONSTRUCTORES
  public Persona(int DNI){
    this(DNI, "N N");
  }
  public Persona(int DNI, String nombre){
    this(DNI, nombre, "01/01/2000");
  }
  public Persona(int DNI, String nombre, String fecha_nacimiento){
    this(DNI, nombre, fecha_nacimiento, 'f');
  }
  public Persona(int DNI, String nombre, String fecha_nacimiento, char sexo){
    this(DNI, nombre, fecha_nacimiento, sexo, 1);
  }
  public Persona(int DNI, String nombre, String fecha_nacimiento, char sexo, int altura){
    this(DNI, nombre, fecha_nacimiento, sexo, altura, 1);
  }
  public Persona(int DNI, String nombre, String fecha_nacimiento, char sexo, int altura, int peso){
    this.DNI = DNI;
    setNombre(nombre);
    setFechaNacimiento(fecha_nacimiento);
    /*
     * A futuro se implementará una metodo el cual a traves de una fecha,
     * devolvera la cantidad de años que pasaron.
    */
    // this.edad = obtenerEdadAPartirDeFecha(this.fecha_nacimiento);
    setSexo(sexo);
    setAltura(altura);
    setPeso(peso);
  }

  public void setNombre(String nombre){
    // Comparamos que el nombre ingresado no sea una cadena vacia
    if(nombre.equals("")){
      System.out.println("Se asigno el value por defecto a nombre, ya que [" + nombre + "] es invalido.");
      this.nombre = default_nombre;
    }else{
      this.nombre = nombre;
    }
  }

  public void setFechaNacimiento(String fecha_nacimiento){
    if(fecha_nacimiento.equals("")){
      System.out.println("Se asigno el value por defecto a fecha de nacimiento, ya que [" + fecha_nacimiento + "] es invalido.");
      this.fecha_nacimiento = default_fecha_nacimiento;
    }else{
      this.fecha_nacimiento = fecha_nacimiento;
    }
  }
  
  public void setSexo(char sexo){
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
    if(peso <= 0){
      System.out.println("El peso ingresado [" + peso +  "] es invalido, se asigno el valor por defecto.");
      this.peso = default_peso;
    }else{
      this.peso = peso;
    }
  }

  public void setAltura(int altura){
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
  public String getFechaNacimiento(){return this.fecha_nacimiento;}
  public char getSexo(){return this.sexo;}
  public int getPeso(){return this.peso;}
  public int getAltura(){return this.altura;}
}