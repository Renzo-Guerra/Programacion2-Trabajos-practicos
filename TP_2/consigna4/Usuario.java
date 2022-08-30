package TP_2.consigna4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
  private String nombre;
  private ArrayList<Turno> misTurnos = new ArrayList<>();
  private static int descuento_socio_porcentaje = 10;

  public Usuario(String nombre){
    setNombre(nombre);
  }
  // Setter
  public void setNombre(String nombre){this.nombre = nombre;}
  // Getter
  public String getNombre() {return nombre;}

  public void agregarTurno(Turno turnoAgregar){
    if(turnoAgregar != null){
      this.misTurnos.add(turnoAgregar);
    }
  }
  // Verifica que al menos los ultimos 4 turnos cargados a la lista sean efectivamente dentro del periodo establecido.
  // En este caso, dentro de 2 meses.
  public boolean esSocio(){
    int MINIMO = 4;
    LocalDate fecha_actual = LocalDate.now();
    Turno turno_actual;
    int posActual;
    // Verificamos que la lista no este vacia, y que al menos tenga "MINIMO" cantidad de elementos
    if((!misTurnos.isEmpty()) && (misTurnos.size() >= MINIMO)){
      // Nos situamos en el cuarto elemento (El primero seria el ultimo).
      posActual = misTurnos.size() - (1 + MINIMO);
      while(posActual < misTurnos.size()){
        turno_actual = misTurnos.get(posActual);
        // Verificamos que cada uno de los MINIMO turnos esten dentro del periodo (2 meses).
        if(!turno_actual.estaDentroDelPeriodo()){
          return false;
        };
        posActual++;
      }
      // En caso que los MINIMO elementos esten dentro del parametro, afirmamos que el usuario es socio
      return true;
    }

    return false;
  } 

  public String mostrarInfo(){
    return getNombre() + ", es socio: " + esSocio();
  }
} 
