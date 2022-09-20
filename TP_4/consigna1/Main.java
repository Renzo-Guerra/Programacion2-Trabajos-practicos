package TP_4.consigna1;

public class Main {
  public static void main(String[] args){
    Alarma alarma_sonora = new Alarma();
    AlarmaLuminosa alarma_luminosa = new AlarmaLuminosa();
    Alarma alarma_sonora_intruso = new Alarma();
    Alarma alarma_luminosa_intruso = new AlarmaLuminosa();

    // Comprobando funcionamiento donde todo esta perfecto
    System.out.println("Primer testing");
    alarma_sonora.comprobar();
    alarma_luminosa.comprobar();
    alarma_sonora.desactivarAlarma();
    alarma_luminosa.desactivarAlarma();

    // Comprobando funcionamiento donde hay un intruso
    System.out.println("\nSegundo testing");
    // Cambiamos 2 atributos para que suene la alarma
    alarma_sonora_intruso.toogleEstanBloqueadasLasEntradas();
    alarma_sonora_intruso.toogleEstanSanosLosVidrios();
    // vemos el resultado
    alarma_sonora_intruso.comprobar();
    // Cambiamos 2 atributos para que suene la alarma
    alarma_luminosa_intruso.toogleEstanSanosLosVidrios();
    alarma_luminosa_intruso.toogleMovimientoEnCasa();
    // vemos el resultado
    alarma_luminosa_intruso.comprobar();
    // Desactivamos las alarmas
    alarma_sonora_intruso.desactivarAlarma();
    alarma_luminosa_intruso.desactivarAlarma();
  }
}
