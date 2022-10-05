package consigna5.empleado;

public class EmpBono extends EmpleadoConVentas{
  private double bono_cobrar;
  private int ventas_requeridas;

  public EmpBono(String nombre, String apellido, long dni, double sueldo_base, double bono_cobrar, int ventas_requeridas) {
    super(nombre, apellido, dni, sueldo_base);
    setBonoCobrar(bono_cobrar);
    setVentasRequeridas(ventas_requeridas);
  }

  // Setter
  public void setBonoCobrar(double bono_cobrar){this.bono_cobrar = bono_cobrar;}
  public void setVentasRequeridas(int ventas_requeridas){this.ventas_requeridas = ventas_requeridas;}
  // Getter
  public double getBonoCobrar(){return bono_cobrar;}
  public int getCantidadVentasConcretadas(){return this.ventas_concretadas.size();}
  public int getVentasRequeridas() {return ventas_requeridas;}
  
  @Override
  public double getMontoCobrar() {
    return (this.getCantidadVentasConcretadas() >= this.getVentasRequeridas())? this.getSueldoBase() + this.getBonoCobrar() : this.getSueldoBase();
  }
  
}
