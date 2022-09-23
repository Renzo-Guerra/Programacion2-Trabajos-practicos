package TP_2.consigna3;

public class Main {
  public static void main(String[] args) {
    // Ciudades de Buenos aires
    Ciudad tandil = new Ciudad("Tandil", 157259, 13000, 1000, 20324, 135564, 12334, 34556);
    Ciudad necochea = new Ciudad("Necochea", 92933, 23000, 13500, 2235, 135, 1276, 12345);
    Ciudad la_plata = new Ciudad("La Plata", 900000, 230000, 135000, 213564, 135373, 12756, 124356);
    Ciudad mar_del_plata = new Ciudad("Mar Del Plata",  650000 , 2300, 135346, 213564, 1235373, 1352756, 7643);

    // Ciudades de Rio Negro
    Ciudad catriel = new Ciudad("Catriel", 18032, 1308, 1452, 2045, 13513, 1234, 20034);
    Ciudad cervantes = new Ciudad("Cervantes", 10000, 1308, 1452, 2045, 13513, 1234, 20034);
    Ciudad chichinales = new Ciudad("Chichinales", 3057, 1308, 1452, 2045, 13513, 1234, 20034);
    Ciudad pomona = new Ciudad("Pomona", 1500, 1308, 1452, 2045, 13513, 1234, 20034);
    
    // Creamos la provincia de buenos aires. En el parametro Ciudad[] creamos el array directamente en el propio parametro.
    Provincia buenos_aires = new Provincia("Buenos Aires", new Ciudad[] {tandil, necochea, la_plata, mar_del_plata});
    Provincia rio_negro = new Provincia("Rio Negro", new Ciudad[] {catriel, cervantes, chichinales, pomona});
    
    //Creamos el pais Argentina
    Pais argentina = new Pais("Argentina", new Provincia[] {buenos_aires, rio_negro});

    System.out.println("El dinero recaudado por impuestos en tandil es de: $" + tandil.sumaTotalDeImpuestos());
    tandil.agregarDineroAMonto1(10000);
    System.out.println("El dinero recaudado por impuestos en tandil es de: $" + tandil.sumaTotalDeImpuestos());
    System.out.println("El dinero que gasta en obras publicas es de: $" + tandil.getGastos_realizados());
    System.out.println("Gasta mas dinero que el recaudado por los impuestos: " + tandil.gastaMasDeLoQueRecauda());
    System.out.println("");
    comprobarDatosProvincia(buenos_aires);
    comprobarDatosProvincia(rio_negro);
    comprobarDatosPais(argentina);
  } 

  public static void comprobarDatosProvincia(Provincia prov){
    System.out.println("Datos de la provincia: " + prov.getNombre());
    System.out.println("La ciudad cuenta con " + prov.contarCiudades() + " ciudades");
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