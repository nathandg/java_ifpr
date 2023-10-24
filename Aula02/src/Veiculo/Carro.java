package Veiculo;

public class Carro implements Veiculo {

  @Override
  public int getQuantidadeDePneus() {
    return 4;
  }

  @Override
  public int getPotencia() {
    return 100;
  }

  @Override
  public boolean veiculoPasseio() {
    return true;
  }

}
