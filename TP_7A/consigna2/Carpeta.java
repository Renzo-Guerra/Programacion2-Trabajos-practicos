package TP_7A.consigna2;

import java.util.ArrayList;
import TP_7A.consigna2.condicion.Condicion;

public class Carpeta {
  private ArrayList<Documento> documentos;

  public Carpeta(){
    documentos = new ArrayList<>();
  }

  public void agregarDocumento(Documento nuevoDocumento){
    if((nuevoDocumento != null) && (!documentos.contains(nuevoDocumento))){
      documentos.add(nuevoDocumento);
    }
  }

  /**
   * Dada una condicion, devuelve todos documentos que cumplan la condicion.
   * @param condicion a cumplir.
   * @return (ArrayList<Documento>).
   */
  public ArrayList<Documento> getDocumentosWhere(Condicion condicion){
    ArrayList<Documento> resultados = new ArrayList<>();
    for (Documento documento : documentos) {
      if(condicion.cumple(documento))
        resultados.add(documento);
    }

    return resultados;
  }
}
