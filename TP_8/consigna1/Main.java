package TP_8.consigna1;

import java.time.LocalDate;
import TP_8.consigna1.filtro.*;
import TP_8.consigna1.filtro.filtrosCombinados.*;

public class Main {
  public static void main(String[] args) {
    Cancha cancha1 = new Cancha(112, 300);
    Cancha cancha2 = new Cancha(113, 400);
    Cancha cancha3 = new Cancha(114, 350);
    Cancha cancha4 = new Cancha(115, 370);

    Socio socio1 = new Socio("Miguel", "Molina", 46);
    socio1.alquilarCancha(cancha4, LocalDate.of(2022, 10, 10));
    socio1.alquilarCancha(cancha2, LocalDate.of(2022, 9, 15));
    socio1.alquilarCancha(cancha1, LocalDate.of(2022, 7, 2));
    socio1.alquilarCancha(cancha4, LocalDate.of(2022, 9, 12));

    Socio socio2 = new Socio("Micaela", "Costa", 33);
    socio2.alquilarCancha(cancha1, LocalDate.of(2022, 11, 12));
    socio2.alquilarCancha(cancha3, LocalDate.of(2022, 1, 22));
    // Hacemos como que se le vence el mes
    socio2.setUltimaCuotaPagada(); 
    // No se va a computar el alquiler porq para poder alquilar tenes que tener la cuota del mes paga
    socio2.alquilarCancha(cancha3, LocalDate.of(2022, 3, 29));
    // Hacemos como que pagó el mes
    socio2.setUltimaCuotaPagada(); 
    socio2.alquilarCancha(cancha3, LocalDate.of(2022, 2, 11));

    // Se modifica el precio de la cancha, cosa de que el proximo que la alquile pague ese monto
    cancha2.setPrecio(1000);

    Socio socio3 = new Socio("Fabricio", "Delmoro", 17);
    socio3.alquilarCancha(cancha2, LocalDate.of(2022, 11, 11));
    socio3.alquilarCancha(cancha2, LocalDate.of(2022, 2, 12));
    socio3.alquilarCancha(cancha4, LocalDate.of(2022, 3, 28));
    socio3.alquilarCancha(cancha3, LocalDate.of(2022, 4, 20));
    
    Club club = new Club();
    System.out.println(socio1);
    club.agregarSocio(socio1);
    club.agregarSocio(socio2);
    club.agregarSocio(socio3);

    System.out.println("Todas los socios con cuota impaga: ");
    System.out.println(club.getSociosWhere(new UltimaCuotaPagada(false)));
    System.out.println("");
    System.out.println("Todos los socios menores de edad: ");
    System.out.println(club.getSociosWhere(new EdadMenorA(18)));
    System.out.println("");
    System.out.println("Todos los socios que alquilaron alguna vez la cancha 3: ");
    System.out.println(club.getSociosWhere(new AlquiloLaCancha(cancha3)));
    System.out.println("");
    System.out.println("Todos los socios que pagaron más de $380 por algún alquiler de cancha: ");
    System.out.println(club.getSociosWhere(new MontoPagadoMayorA(380)));
    System.out.println("");
    // Sirve tanto para ver si el usuario existe, y para ver sus caracteristicas
    System.out.println("Busca un socio en especifico: ");
    System.out.println(club.getSociosWhere(new SocioEspecifico(socio2)));
    System.out.println("");

    
  }
}
