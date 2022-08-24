package TP_1.consigna1;

// Permite el uso del objeto LocalDate
import java.time.LocalDate; 
// Permite especificar la cantidad de decimales en un float
import java.text.DecimalFormat;
/*
 * LEER: al usar this.variable hacemos referencia al atributo del objeto en si.
 * ej: this.nombre = nombre;
 * el "this.nombre" hace referencia a la direccion de memoria del atributo nombre de ese objeto, 
 * al cual le estoy asignado el valor de "nombre".

 * 
 * Debido a que la edad solo se puede actualizar en base a la fecha de nacimiento de la persona,
 * esta SIEMPRE va a estar sincronizada, y cuando se cambie la fecha de nacimiento, automaticamente 
 * se cambia la edad.
*/

public class Persona{
  // Variables:
  private long DNI;    
  private String nombre;
  private LocalDate fecha_nacimiento;   // dd/mm/yyyy
  private char sexo;  // m | f
  private float altura; // La altura es en metros
  private float peso; // El peso es en kilos
  // Formato en el que se almacenaran los datos numericos que permitan decimales
  private static DecimalFormat formatoDecimalPrestablecido = new DecimalFormat("#.00");

  // SOBRECARGA DE CONSTRUCTORES
  public Persona(long DNI){
    this(DNI, "");
  }
  public Persona(long DNI, String nombre){
    this(DNI, nombre, LocalDate.of(2000, 1, 1));
  }
  public Persona(long DNI, String nombre, LocalDate fecha_nacimiento){
    this(DNI, nombre, fecha_nacimiento, 'f');
  }
  public Persona(long DNI, String nombre, LocalDate fecha_nacimiento, char sexo){
    this(DNI, nombre, fecha_nacimiento, sexo, 1);
  }
  public Persona(long DNI, String nombre, LocalDate fecha_nacimiento, char sexo, float altura){
    this(DNI, nombre, fecha_nacimiento, sexo, altura, 1);
  }
  public Persona(long DNI, String nombre, LocalDate fecha_nacimiento, char sexo, float altura, float peso){
    this.DNI = DNI;
    setNombre(nombre);
    setFechaNacimiento(fecha_nacimiento);
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

  public void setFechaNacimiento(LocalDate fecha_nacimiento){
    // Por default, se utilizará la fecha 2000/01/01
    final LocalDate default_fecha_nacimiento = LocalDate.of(2000, 1, 1); 
    final LocalDate fechaActual = LocalDate.now();

    // Comprobamos que la fecha ingresada sea una fecha menor a la actual.
    if(fecha_nacimiento.isBefore(fechaActual)){
      this.fecha_nacimiento = fecha_nacimiento;
    }else{
      System.out.println("Se asigno el value por defecto a fecha de nacimiento, ya que [" + fecha_nacimiento + "] es invalido.");
      this.fecha_nacimiento = default_fecha_nacimiento;
    }
  }

  public void setSexo(char sexo){
    final char default_sexo = 'f';
    // Lo transformamos a minuscula para las comparaciones
    sexo = Character.toLowerCase(sexo);
    switch(sexo){
      case 'f': case 'm': case 'x':{
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

  public void setPeso(float peso){
    final int default_peso = 1;

    if(peso <= 0){
      System.out.println("El peso ingresado [" + peso +  "] es invalido, se asigno el valor por defecto.");
      this.peso = default_peso;
    }else{
      this.peso = Float.parseFloat(formatoDecimalPrestablecido.format(peso));
    }
  }

  public void setAltura(float altura){
    final float default_altura = Float.parseFloat(formatoDecimalPrestablecido.format(1));

    if(altura <= 0){
      System.out.println("La altura ingresada [" + altura +  "] es invalida, se asigno el valor por defecto.");
      this.altura = default_altura;
    }else{
      this.altura = Float.parseFloat(formatoDecimalPrestablecido.format(altura));
    }
  }
  // Getters:
  public long getDNI(){return this.DNI;}
  public String getNombre(){return this.nombre;}
  public LocalDate getFechaNacimiento(){return this.fecha_nacimiento;}
  public char getSexo(){return this.sexo;}
  public float getPeso(){return this.peso;}
  public float getAltura(){return this.altura;}
  public int getEdad(){
    LocalDate fecha_actual = LocalDate.now();
    int edad_final = 0;

    if(fecha_actual.getYear() > this.getFechaNacimiento().getYear()){ // Verificamos que el usuario no tenga 0 años
      edad_final = fecha_actual.getYear() - this.getFechaNacimiento().getYear(); // Obtenemos la cantidad de años entre ambas fechas
      if(fecha_actual.getMonthValue() < this.getFechaNacimiento().getMonthValue()){
        edad_final++;
      }else{
        /*
        * En caso de que el mes de la fecha de nacimiento del usuario coincida con el mes actual, debemos
        * verificar cual de los 2 dias de la fecha es mayor, para sumarle 1 año en caso de que el dia de
        * la fecha de nacimiento del usuario sea mayor a el dia de la fecha actual, y tambien sumarle 1 año
        * en caso de que ambos dias de la fecha coincidan, 
        */ 
        if(fecha_actual.getMonthValue() == this.getFechaNacimiento().getMonthValue()){
          if(fecha_actual.getDayOfMonth() <= this.getFechaNacimiento().getDayOfMonth()){
            edad_final++;
          }
        }
      }
    }

    return edad_final;
  }

  // Metodos publicos
  /* Dado el peso (KG) y la altura (Mts) del usuario, devuelve su IMC en float */
  public float calcularIndiceMasaCorporal(){
    /*
    * Al aplicar el formato, devuelve un String, es por eso que
    * debemos usar el "Float.parseFloat" 
    */
    
    return Float.parseFloat(formatoDecimalPrestablecido.format(this.getPeso() / (this.getAltura() * this.getAltura())));
  }

  /*
  * Evalua el IMC de la persona y devuelve si está (o no) en forma.
  * Para estar en forma, su imc debe estar entre el IMC minimo y maximo, o igualar alguno. 
  */ 
  public boolean estaEnForma(){
    final float INDICE_MASA_CORPORAL_MINIMA = 18.5f;
    final float INDICE_MASA_CORPORAL_MAXIMA = 25.f;
    float imc = this.calcularIndiceMasaCorporal(); // Invocamos la funcion

    // Operador ternario, en caso de que el condicional se cumple, devolvera true, sino false
    return ((imc >= INDICE_MASA_CORPORAL_MINIMA) && (imc <= INDICE_MASA_CORPORAL_MAXIMA));
  }

  /*
   * Evalua la fecha de nacimiento de la persona y la compara con la fecha actual,
   * devuelve Verdadero o falso 
  */
  public boolean esSuCumpleanios(){
    Float.parseFloat(formatoDecimalPrestablecido.format(1));
    LocalDate fecha_actual = LocalDate.now();
    // En caso que coicidan los meses y los dias de ambas fechas, será su cumpleanios
    return ((this.getFechaNacimiento().getMonthValue() == fecha_actual.getMonthValue()) && (this.getFechaNacimiento().getDayOfMonth() == fecha_actual.getDayOfMonth()));
  }
  
  // Evalua la edad del usuario y determina si es (o no) mayor de edad. 
  public boolean esMayorDeEdad(){
    final int MAYORIA_EDAD = 18;

    return (this.getEdad() >= MAYORIA_EDAD);
  }

  // Evalua la edad del usuario y determina si puede (o no) votar. 
  public boolean puedeVotar(){
    final int MINIMO_EDAD_VOTAR = 16;

    return (this.getEdad() >= MINIMO_EDAD_VOTAR);
  }

  // Devuelve una string con los datos
  public String obtenerDatos(){
    final char SEP = '_'; // Separador entre datos
    return (String.valueOf(getDNI()) + SEP + String.valueOf(getNombre()) + SEP +
    String.valueOf(getFechaNacimiento()) + SEP + String.valueOf(getEdad()) + String.valueOf(getEdad()) + SEP + 
    String.valueOf(getSexo()) + SEP + String.valueOf(getAltura()) + SEP + String.valueOf(getPeso()));
  }
}