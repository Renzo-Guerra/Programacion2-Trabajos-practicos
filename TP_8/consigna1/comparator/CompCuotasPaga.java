package TP_8.consigna1.comparator;

import TP_8.consigna1.Socio;

public class CompCuotasPaga extends CompSocio{
  public CompCuotasPaga(){
    super();
  }
  
  public CompCuotasPaga(CompSocio siguiente){
    super(siguiente);
  }

  @Override
  public int comparar(Socio socio1, Socio socio2) {
    if(socio1.getUltimaCuotaPagada() == socio2.getUltimaCuotaPagada()){
      return 0;
    }else if(socio1.getUltimaCuotaPagada() == false){
      return -1;
    }else{
      return 1;
    }
  }
  
}
