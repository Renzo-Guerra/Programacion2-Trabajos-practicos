package farmacia;

import farmacia.condiciones.CondicionLaboratorio;
import farmacia.condiciones.CondicionNombre;
import farmacia.condiciones.CondicionPrecioMaximoPagar;

public class Main {
  public static void main(String[] args) {
    Farmacia farmacia = new Farmacia("plus");
    // Creando los medicamentos (con sus sintomas (aunque en realidad puse los efectos secundarios))
    Medicamento med1 = new Medicamento("simvastatina ", "umbrella", 2899);
    med1.agregarSintoma("estreñimiento");
    med1.agregarSintoma("dolor de estómago");
    med1.agregarSintoma("náuseas");
    med1.agregarSintoma("dolor de cabeza");
    med1.agregarSintoma("confusión");
    Medicamento med2 = new Medicamento("aspirina", "andrómaco", 3060);
    med2.agregarSintoma("urticaria");
    med2.agregarSintoma("sarpullido");
    med2.agregarSintoma("ronquera");
    med2.agregarSintoma("respiración rápida");
    Medicamento med3 = new Medicamento("omeprazol", "umbrella", 1600);
    med3.agregarSintoma("estreñimiento");
    med3.agregarSintoma("gases");
    med3.agregarSintoma("náuseas");
    med3.agregarSintoma("diarrea");
    med3.agregarSintoma("vomitos");
    Medicamento med4 = new Medicamento("lexotiroxina sodica", "umbrella", 1100);
    med4.agregarSintoma("subir o bajar de peso");
    med4.agregarSintoma("fiebre");
    med4.agregarSintoma("vomito");
    med4.agregarSintoma("diarrea");
    med4.agregarSintoma("sensibilidad al calor");
    Medicamento med5 = new Medicamento("ramipril", "andrómaco", 700);
    med5.agregarSintoma("cefalea ");
    med5.agregarSintoma("tos");
    med5.agregarSintoma("mareos");
    Medicamento med6 = new Medicamento("amlodipina", "casasco", 450);
    med6.agregarSintoma("dolor de cabeza");
    med6.agregarSintoma("náuseas");
    med6.agregarSintoma("somnolencia");
    Medicamento med7 = new Medicamento("paracetamol", "casasco", 124);
    med7.agregarSintoma("Dolor abdominal, malestar estomacal");
    med7.agregarSintoma("convulsiones");
    med7.agregarSintoma("diarrea");
    med7.agregarSintoma("perdida del apetito");
    med7.agregarSintoma("vomito");
    Medicamento med8 = new Medicamento("hidrocortisona", "umbrella",3345);
    med8.agregarSintoma("acné");
    med8.agregarSintoma("ardor");
    med8.agregarSintoma("picazon");
    med8.agregarSintoma("irritacion");
    Medicamento med9 = new Medicamento("isoprenalina", "andrómaco", 8877);
    med9.agregarSintoma("mareo");
    med9.agregarSintoma("cefalea");
    med9.agregarSintoma("nerviosismo");
    Medicamento med10 = new Medicamento("labetalol", "andrómaco", 4979);
    med10.agregarSintoma("mareos");
    med10.agregarSintoma("náuseas");
    med10.agregarSintoma("congestion nasal");
    med10.agregarSintoma("cansancio excesivo");

    // Agregando los medicamentos a la farmacia
    farmacia.agregarMedicamento(med1);
    farmacia.agregarMedicamento(med2);
    farmacia.agregarMedicamento(med3);
    farmacia.agregarMedicamento(med4);
    farmacia.agregarMedicamento(med5);
    farmacia.agregarMedicamento(med6);
    farmacia.agregarMedicamento(med7);
    farmacia.agregarMedicamento(med8);
    farmacia.agregarMedicamento(med9);
    farmacia.agregarMedicamento(med10);

    System.out.println(farmacia.getMedicamentos(new CondicionLaboratorio("umbrella")));
    System.out.println(farmacia.getMedicamentos(new CondicionNombre("aspirina")));
    System.out.println(farmacia.getMedicamentos(new CondicionPrecioMaximoPagar(3345)));
  }
}
