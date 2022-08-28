package TP_2.consigna3;

public class Main {
  public static void main(String[] args) {
    Ciudad tandil = new Ciudad("Tandil", 157259, 13000, 1000, 20324, 135564, 12334, 2000000);
    Ciudad necochea = new Ciudad("Necochea", 92933, 23000, 13500, 2235, 135, 1276, 12431546);
    Ciudad la_plata = new Ciudad("La Plata", 900000, 230000, 135000, 213564, 135373, 12756, 1352465);
    Ciudad mar_del_plata = new Ciudad("Mar Del Plata",  650000 , 2300, 135346, 213564, 1235373, 1352756, 1354674);

    // Creamos la provincia de buenos aires. En el parametro Ciudad[] creamos el array directamente en el propio parametro.
    Provincia buenos_aires = new Provincia("Buenos Aires", new Ciudad[] {tandil, necochea, la_plata, mar_del_plata});
    
    // System.out.println("El dinero recaudado por impuestos en tandil es de: $" + tandil.sumaTotalDeImpuestos());
    // tandil.agregarDineroAMonto1(10000);
    // System.out.println("El dinero recaudado por impuestos en tandil es de: $" + tandil.sumaTotalDeImpuestos());
    // System.out.println("El dinero que gasta en obras publicas es de: $" + tandil.getGastos_realizados());
    // System.out.println("Gasta mas dinero que el recaudado por los impuestos: " + tandil.gastaMasDeLoQueRecauda());
    
    comprobarDatosProvincia(buenos_aires);
  } 

  public static void comprobarDatosProvincia(Provincia prov){
    System.out.println("Datos de la provincia: " + prov.getNombre());
    System.out.println("La ciudad cuenta con " + prov.contarCiudades() + " ciudades");
    System.out.println(prov.obtenerNombresDeLasCiudades());
    System.out.println((prov.tieneMasDeLaMitadEnDeficit())? "Tiene mas de la mitad de sus ciudades en deficit" : "NO tiene mas de la mitad de sus ciudades en deficit");
    System.out.println("Listado de ciudades con deficit: " + prov.obtenerCiudadesQueGastanMasDeLoQueRecaudan());
    System.out.println("");
  }
}