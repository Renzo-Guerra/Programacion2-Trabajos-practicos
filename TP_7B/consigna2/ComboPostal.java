package TP_7B.consigna2;

import java.util.ArrayList;

public class ComboPostal extends Envio{
  private ArrayList<Envio> envios;

  public ComboPostal(long IdTracking){
    super(IdTracking);
    envios = new ArrayList<>();
  }

  public void agregarEnvio(Envio nuevoEnvio){
    // 1 - Se verifica que no sea null
    // 2 - En caso de que el archivo no sea null y este vacio, el combo todavia no tiene 
    if((nuevoEnvio != null) && (this.envios.isEmpty() || nuevoEnvio.getCiudadDestino().equals(this.getCiudadDestino()))){
      envios.add(nuevoEnvio);

      // Se le cambia el idTracking al nuevo envio
      nuevoEnvio.setIdTracking(this.getIdTracking());
      
    }
  }

  @Override
  public void setIdTracking(long idTracking){
    // Hago lo que hacía el metodo original
		super.setIdTracking(idTracking);
    // Ahora falta pasarle el id a todos los hijos:
    if(this.envios.size() > 0){
      for (Envio envio : this.envios) {
        envio.setIdTracking(idTracking);
      }
    }
  }


  @Override
  public Persona getDestinatario() {
    return this.envios.get(0).getDestinatario();
  }

  @Override
  public Persona getRemitente() {
    return this.envios.get(0).getRemitente();
  }

  @Override
  public double getPeso() {
    int total = 0;

    for (Envio envio : envios)
      total += envio.getPeso();

    return total;
  }

  @Override
  public String toString() {
    return "id: " + this.getIdTracking() + ", elementos: \n" + this.envios;
  }
}
