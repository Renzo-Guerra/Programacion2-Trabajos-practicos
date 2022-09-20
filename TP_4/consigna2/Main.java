package TP_4.consigna2;

public class Main {
  public static void main(String[] args){
    
    // Caso sin errores (caso 1)
    System.out.println("\n\nTesting caso 1: \n\n");
    Alarma alarma_sonora_1 = new Alarma();
    cargarCasoSinIntrusos(alarma_sonora_1);
    AlarmaLuminosa alarma_luminosa_1 = new AlarmaLuminosa();
    cargarCasoSinIntrusos(alarma_luminosa_1);
    System.out.println("Comprobando alarma sonora 1: ");
    alarma_sonora_1.comprobar();
    alarma_sonora_1.desactivarAlarma();
    System.out.println("Comprobando alarma luminosa 1: ");
    alarma_luminosa_1.comprobar();
    alarma_luminosa_1.desactivarAlarma();

    // Caso con errores (caso 2)
    System.out.println("\n\nTesting caso 2: \n\n");
    Alarma alarma_sonora_2 = new Alarma();
    cargarCasosConIntrusos(alarma_sonora_2);
    AlarmaLuminosa alarma_luminosa_2 = new AlarmaLuminosa();
    cargarCasosConIntrusos(alarma_luminosa_2);

    System.out.println("Comprobando alarma sonora 2: ");
    alarma_sonora_2.comprobar();
    alarma_sonora_2.desactivarAlarma();
    System.out.println("Comprobando alarma luminosa 2: ");
    alarma_luminosa_2.comprobar();
    alarma_luminosa_2.desactivarAlarma();
  }

  public static void cargarCasoSinIntrusos(Alarma alarma){
    Sensor sensor1 = new Sensor("Puerta principal", "Living");
    Sensor sensor2 = new Sensor("Puerta baño", "Baño principal");
    Sensor sensor3 = new Sensor("Puerta habitacion", "Habitacion Luca");
    Sensor sensor4 = new Sensor("Ventana izquierda habitacion", "Habitacion Carlos");
    Sensor sensor5 = new Sensor("Ventana derecha habitacion", "Habitacion Carlos");
    Sensor sensor6 = new Sensor("Movimiento", "Habitacion Maria");
    Sensor sensor7 = new Sensor("Ventana derecha habitacion", "Habitacion");
    alarma.agregarSensor(sensor1);
    alarma.agregarSensor(sensor2);
    alarma.agregarSensor(sensor3);
    alarma.agregarSensor(sensor4);
    alarma.agregarSensor(sensor5);
    alarma.agregarSensor(sensor6);
    alarma.agregarSensor(sensor7);
  }

  public static void cargarCasosConIntrusos(Alarma alarma){
    Sensor sensor1 = new Sensor("Puerta principal", "Living");
    Sensor sensor2 = new Sensor("Puerta baño", "Baño principal");
    Sensor sensor3 = new Sensor("Puerta habitacion", "Habitacion Luca");
    Sensor sensor4 = new Sensor("Ventana izquierda habitacion", "Habitacion Carlos");
    Sensor sensor5 = new Sensor("Ventana derecha habitacion", "Habitacion Carlos");
    Sensor sensor6 = new Sensor("Movimiento", "Habitacion Maria");
    Sensor sensor7 = new Sensor("Ventana derecha habitacion", "Habitacion");
    sensor1.toggleEstado();
    sensor7.toggleEstado();
    sensor5.toggleEstado();
    sensor6.toggleEstado();
    alarma.agregarSensor(sensor1);
    alarma.agregarSensor(sensor2);
    alarma.agregarSensor(sensor3);
    alarma.agregarSensor(sensor4);
    alarma.agregarSensor(sensor5);
    alarma.agregarSensor(sensor6);
    alarma.agregarSensor(sensor7);
  }
}
