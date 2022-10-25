package TP_8.consigna1;

public class Cancha {
  private long id;
  private double precio;

  public Cancha(long idCancha, double precio){
    setId(idCancha);
    setPrecio(precio);
  }

  // Setters
  public void setId(long id){this.id = id;}
  public void setPrecio(double precio){this.precio = precio;}

  // Getters
  public long getId(){return id;}
  public double getPrecio(){return precio;}

  @Override
  public boolean equals(Object obj) {
    Cancha cancha = (Cancha)obj;
    return cancha.getId() == this.getId();
  }

  @Override
  public String toString() {
    return "id: " + this.getId() + 
            ", precio actual: " + this.getPrecio();
  }
}
