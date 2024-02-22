package Termostato;

public class Termostato {
  private Integer tempAtual;
  private Integer tempAlvo;
  private Integer tempMaxima;
  private Integer tempMinima;

  public Integer getTempAtual() {
    return tempAtual;
  }

  public void setTempAtual(Integer tempAtual) {
    this.tempAtual = tempAtual;
  }

  public Integer getTempAlvo() {
    return tempAlvo;
  }

  public void setTempAlvo(Integer tempAlvo) {
    if (tempAlvo > this.tempMinima && tempAlvo < this.tempMaxima) {
      this.tempAlvo = tempAlvo;
    } else {
      System.out.println("Temperatura fora do intervalo permitido.");
    }
  }

  public Integer getTempMaxima() {
    return tempMaxima;
  }

  public void setTempMaxima(Integer tempMaxima) {
    this.tempMaxima = tempMaxima;
  }

  public Integer getTempMinima() {
    return tempMinima;
  }

  public void setTempMinima(Integer tempMinima) {
    this.tempMinima = tempMinima;
  }

}
