package consigna4;

/*
  * NOTAS:
  *  - La posta es que me hizo bastante ruido el tema de las clases de contribuyentes, 
  *    terminaron la clase "ContribuyenteComerciante" y "ContribuyenteProgramador" con casi 
  *    TODOS los mismos metodos, pero lo tuve que hacer asi, ya que tome los valores como "static"
  *    y si trato de heredar estos valores para luego redefinirlos, me cambia tambien los del padre.
  *    se podria encarar tambien sin usar los static, pero asi si en algun momento se cambia el porcentaje 
  *    de alguno de los valores, habria que cambiar todos manualmente 1 por uno, en cambio asi, a pesar de 
  *    contar con 2 clases con casi todos los mismos metodos, implementa el complemento Static
*/

public class Main {
  public static void main(String[] args) {
    // Ciudades de Buenos aires
    Contribuyente contribuyente1 = new Contribuyente("Jorge", 112323, 12000);
    Contribuyente contribuyente2 = new Contribuyente("Pablo", 223221, 12000);
    Contribuyente contribuyente3 = new Contribuyente("Miguel", 333444, 20000);
    Contribuyente contribuyente4 = new Contribuyente("Raul", 666555, 2000);
    Contribuyente contribuyente5 = new Contribuyente("Esteban", 888777, 150000);
    ContribuyenteComerciante contribuyenteComerciante1 = new ContribuyenteComerciante("Facundo", 333443, 13000);
    contribuyenteComerciante1.agregarVenta(14000);
    contribuyenteComerciante1.agregarVenta(28000);
    ContribuyenteComerciante contribuyenteComerciante2 = new ContribuyenteComerciante("Franco", 333443, 13000);
    contribuyenteComerciante1.agregarVenta(20000);
    contribuyenteComerciante1.agregarVenta(1000);
    contribuyenteComerciante1.agregarVenta(10000);
    ContribuyenteComerciante contribuyenteComerciante3 = new ContribuyenteComerciante("Federico", 333443, 13000);
    contribuyenteComerciante1.agregarVenta(15000);
    contribuyenteComerciante1.agregarVenta(13450);
    contribuyenteComerciante1.agregarVenta(48765);
    ContribuyenteProgramador contribuyenteProgramador1 = new ContribuyenteProgramador("Luca", 564567, 1800);
    contribuyenteProgramador1.agregarDesarrolloSoftware(30000);
    contribuyenteProgramador1.agregarDesarrolloSoftware(54000);
    ContribuyenteProgramador contribuyenteProgramador2 = new ContribuyenteProgramador("Liliana", 119872, 1800);
    contribuyenteProgramador1.agregarDesarrolloSoftware(30340);
    contribuyenteProgramador1.agregarDesarrolloSoftware(55400);
    ContribuyenteProgramador contribuyenteProgramador3 = new ContribuyenteProgramador("Lucrecia", 764839, 1800);
    contribuyenteProgramador1.agregarDesarrolloSoftware(37650);
    contribuyenteProgramador1.agregarDesarrolloSoftware(22300);

    Ciudad tandil = new Ciudad("Tandil", 356);
    tandil.agregarContribuyente(contribuyente1);
    tandil.agregarContribuyente(contribuyente2);
    tandil.agregarContribuyente(contribuyente3);
    tandil.agregarContribuyente(contribuyente4);
    tandil.agregarContribuyente(contribuyente5);
    tandil.agregarContribuyente(contribuyenteComerciante1);
    tandil.agregarContribuyente(contribuyenteComerciante2);
    tandil.agregarContribuyente(contribuyenteComerciante3);

    Ciudad necochea = new Ciudad("Necochea", 12345);
    necochea.agregarContribuyente(contribuyente1);
    necochea.agregarContribuyente(contribuyente2);
    necochea.agregarContribuyente(contribuyente3);
    necochea.agregarContribuyente(contribuyenteComerciante2);
    necochea.agregarContribuyente(contribuyenteProgramador2);
    necochea.agregarContribuyente(contribuyenteProgramador3);

    Ciudad la_plata = new Ciudad("La Plata", 124356);
    la_plata.agregarContribuyente(contribuyente2);
    la_plata.agregarContribuyente(contribuyente3);
    la_plata.agregarContribuyente(contribuyenteComerciante1);
    la_plata.agregarContribuyente(contribuyenteProgramador3);
    la_plata.agregarContribuyente(contribuyenteProgramador1);
    la_plata.agregarContribuyente(contribuyenteProgramador2);
    Ciudad mar_del_plata = new Ciudad("Mar Del Plata", 7643);
    mar_del_plata.agregarContribuyente(contribuyente3);
    mar_del_plata.agregarContribuyente(contribuyenteComerciante2);
    mar_del_plata.agregarContribuyente(contribuyenteComerciante3);
    mar_del_plata.agregarContribuyente(contribuyenteProgramador1);
    mar_del_plata.agregarContribuyente(contribuyenteProgramador2);
    mar_del_plata.agregarContribuyente(contribuyenteProgramador3);
    // Ciudades de Rio Negro
    Ciudad catriel = new Ciudad("Catriel", 20034);
    catriel.agregarContribuyente(contribuyente1);
    catriel.agregarContribuyente(contribuyente2);
    catriel.agregarContribuyente(contribuyente3);
    catriel.agregarContribuyente(contribuyenteComerciante1);
    catriel.agregarContribuyente(contribuyenteComerciante3);
    catriel.agregarContribuyente(contribuyenteProgramador1);
    Ciudad cervantes = new Ciudad("Cervantes", 20034);
    cervantes.agregarContribuyente(contribuyente3);
    cervantes.agregarContribuyente(contribuyenteComerciante1);
    cervantes.agregarContribuyente(contribuyenteComerciante2);
    cervantes.agregarContribuyente(contribuyenteProgramador1);
    cervantes.agregarContribuyente(contribuyenteProgramador3);
    Ciudad chichinales = new Ciudad("Chichinales", 20034);
    chichinales.agregarContribuyente(contribuyente1);
    chichinales.agregarContribuyente(contribuyente3);
    chichinales.agregarContribuyente(contribuyenteProgramador2);
    chichinales.agregarContribuyente(contribuyenteProgramador3);
    Ciudad pomona = new Ciudad("Pomona", 20034);
    pomona.agregarContribuyente(contribuyente2);
    pomona.agregarContribuyente(contribuyente3);
    pomona.agregarContribuyente(contribuyenteComerciante1);
    pomona.agregarContribuyente(contribuyenteComerciante3);
    pomona.agregarContribuyente(contribuyenteProgramador2);
    
    // Agregando las ciudades a sus provincias correspondientes
    Provincia buenos_aires = new Provincia("Buenos Aires");
    buenos_aires.agregarCiudad(tandil);
    buenos_aires.agregarCiudad(necochea);
    buenos_aires.agregarCiudad(la_plata);
    buenos_aires.agregarCiudad(mar_del_plata);
    Provincia rio_negro = new Provincia("Rio Negro");
    rio_negro.agregarCiudad(catriel);
    rio_negro.agregarCiudad(cervantes);
    rio_negro.agregarCiudad(chichinales);
    rio_negro.agregarCiudad(pomona);
    
    // Agregando las provincias a su pais correspondientes
    Pais argentina = new Pais("Argentina");
    argentina.agregarProvincia(buenos_aires);
    argentina.agregarProvincia(rio_negro);

    System.out.println("El dinero recaudado por impuestos en tandil es de: $" + tandil.sumaTotalDeImpuestos());
    System.out.println("El dinero que gasta en obras publicas es de: $" + tandil.getGastosRealizados());
    System.out.println("Gasta mas dinero que el recaudado por los impuestos: " + tandil.gastaMasDeLoQueRecauda());
    System.out.println("");
    System.out.println("Buenos aires");
    comprobarDatosProvincia(buenos_aires);
    System.out.println("\nRio negro");
    comprobarDatosProvincia(rio_negro);
    comprobarDatosPais(argentina);
  } 

  public static void comprobarDatosProvincia(Provincia prov){
    System.out.println("Datos de la provincia: " + prov.getNombre());
    System.out.println("La ciudad cuenta con " + prov.getCantidadCiudades() + " ciudades");
    System.out.println(prov.obtenerNombresDeLasCiudades());
    System.out.println((prov.tieneMasDeLaMitadEnDeficit())? "Tiene mas de la mitad de sus ciudades en deficit" : "NO tiene mas de la mitad de sus ciudades en deficit");
    System.out.println("Listado de ciudades con deficit: " + prov.obtenerCiudadesQueGastanMasDeLoQueRecaudan());
    System.out.println("");
  }

  public static void comprobarDatosPais(Pais pais){
    System.out.println("Datos del pais: " + pais.getNombre());
    System.out.println("El pais cuenta con " + pais.contarProvincias() + " provincias");
    System.out.println("Listado de ciudades (con sus provincias) que gastan mas de lo que recaudan");
    System.out.println(pais.obtenerCiudadesQueGastanMasDeLoQueRecaudan());
  }
}