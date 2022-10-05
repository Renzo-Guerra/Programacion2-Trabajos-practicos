package consigna6;

public class Poster extends Trabajo{
  
  public Poster(String autor) {
    super(autor, "poster");
  }

  public boolean contieneTema(String tema_solicitado){
    return this.temas_tratados.contains(tema_solicitado);
  }

  /**
   * Dado un evaluador, verifica que este tenga conocimiento de algun tema_tratado en el trabajo.
   * @param evaluador a examinar.
   * @return true / false.
   */
  @Override
  public boolean elEvaluadorEsApto(Evaluador evaluador){
    for (String tema : temas_tratados) {
      if(evaluador.conocimientos.contains(tema))
        return true;
    }
    return false;
  }
}
