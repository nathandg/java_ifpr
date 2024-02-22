package Veiculo;

public class Moto implements Veiculo {

  @Override
  public int getQuantidadeDePneus() {
    return 2;
  }

  @Override
  public int getPotencia() {
    return 12;
  }

  @Override
  public boolean veiculoPasseio() {
    return true;
  }
}
