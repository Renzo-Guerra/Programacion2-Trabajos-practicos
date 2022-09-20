package TP_3.consigna4;

import java.time.LocalDate;

public class Main{
  public static void main(String[] args) {
    Celular celular = new Celular();
    agregarContactos(celular);

    // Funcionalidades del celular
    celular.listarTodosLosContactos();
    celular.listarSoloContactosRepetidos();
    celular.listarContactosMismoNumTelefonico();
  }

  /**
   * Crea los contactos y los agrega al celular
   * @param celular al que se le agregaran los contactos hardcodeados
   */
  public static void agregarContactos(Celular celular){
    Contacto con1 = new Contacto("Juan", "Perez", LocalDate.of(1989, 4, 2), "2262 123445", "Calle falsa123", "juanperez@hotmail.com");
    Contacto con2 = new Contacto("Guillermo", "Aguila", LocalDate.of(1980, 3, 22), "223 112233", "Calle falsa321", "guilleaguila@hotmail.com");
    Contacto con3 = new Contacto("Maria", "Alvarez", LocalDate.of(1998, 4, 28), "249 445566", "Calle falsa111", "marualvarez@hotmail.com");
    Contacto con4 = new Contacto("Maria", "González", LocalDate.of(1998, 4, 28), "249 445566", "Calle falsa111", "mariagonzales@hotmail.com");
    Contacto con5 = new Contacto("Maria", "González", LocalDate.of(1998, 4, 28), "249 445566", "Calle falsa111", "mariarodriguez@hotmail.com");
    Contacto con6 = new Contacto("Maria", "Fernández", LocalDate.of(1998, 4, 28), "249 445566", "Calle falsa111", "maruferna@hotmail.com");
    Contacto con7 = new Contacto("Graciela", "Díaz", LocalDate.of(1998, 4, 28), "249 112233", "Calle falsa111", "graciasbuendia@hotmail.com");
    Contacto con8 = new Contacto("Graciela", "Díaz", LocalDate.of(1998, 4, 28), "249 112233", "Calle falsa111", "martamuñoz@hotmail.com");
    Contacto con9 = new Contacto("Pancho", "Pérez", LocalDate.of(1998, 4, 28), "249 123445", "Calle falsa111", "elpanchoratonperez@hotmail.com");
    Contacto con10 = new Contacto("Miguel", "Silva", LocalDate.of(1998, 4, 28), "249 445566", "Calle falsa111", "miguelsilvamucho@hotmail.com");
    Contacto con11 = new Contacto("Franco", "Morales", LocalDate.of(1998, 4, 28), "249 111111", "Calle falsa111", "francotodoslosdias@hotmail.com");
    Contacto con12 = new Contacto("Francisco", "López", LocalDate.of(1998, 4, 28), "249 112233", "Calle falsa111", "elpescadofrancisco@hotmail.com");
    Contacto con13 = new Contacto("Luca", "Torres", LocalDate.of(1998, 4, 28), "249 445566", "Calle falsa111", "lucatorres@hotmail.com");
    celular.agregarContacto(con1);
    celular.agregarContacto(con2);
    celular.agregarContacto(con3);
    celular.agregarContacto(con4);
    celular.agregarContacto(con5);
    celular.agregarContacto(con6);
    celular.agregarContacto(con7);
    celular.agregarContacto(con8);
    celular.agregarContacto(con9);
    celular.agregarContacto(con10);
    celular.agregarContacto(con11);
    celular.agregarContacto(con12);
    celular.agregarContacto(con13);
  }
}