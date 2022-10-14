package TP_6.consigna2;

public class Main{
  public static void main(String[] args) {
    // Instanciando computadoras
    Computadora computadora1 = new Computadora("Lenovo Max Pro", 2000);
    Computadora computadora2 = new Computadora("HP up", 3000);
    Computadora computadora3 = new Computadora("Lightweight baby", 1000);
    Computadora computadora4 = new Computadora("Free work", 2400);

    // Instanciando procesos
    Proceso proceso1 = new Proceso("Ejecutar antivirus", 176);
    Proceso proceso2 = new Proceso("Borrar historial", 500);
    Proceso proceso3 = new Proceso("Abrir navegador", 20);
    Proceso proceso4 = new Proceso("Borrar archivos duplicados", 100);
    Proceso proceso5 = new Proceso("Cerrar pestaña", 30);
    Proceso proceso6 = new Proceso("Realizar una peticion", 60);
    Proceso proceso7 = new Proceso("Suspender", 40);

    // Instanciando centro de computo 
    CentroComputo centroComputo = new CentroComputo();

    // Agregando procesos al centro de computo
    centroComputo.agregarProceso(proceso1);
    centroComputo.agregarProceso(proceso2);
    centroComputo.agregarProceso(proceso3);
    centroComputo.agregarProceso(proceso4);

    // Agregando computadoras al centro de computo
    centroComputo.agregarComputadora(computadora1);
    centroComputo.agregarComputadora(computadora2);
    centroComputo.agregarComputadora(computadora3);
    centroComputo.agregarComputadora(computadora4);

    centroComputo.agregarProceso(proceso5);
    centroComputo.agregarProceso(proceso6);
    centroComputo.agregarProceso(proceso7);
  }
}