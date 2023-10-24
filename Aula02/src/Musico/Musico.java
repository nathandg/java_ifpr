package Musico;

public abstract class Musico {

  public abstract String getNomeDoInstrumento();

  public void afinarInstrumento() {
    System.out.println("Afinando instrumento ... " + this.getNomeDoInstrumento());
  }

}
