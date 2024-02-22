package Veiculo;

public class Caminhao implements Veiculo {

  @Override
  public int getQuantidadeDePneus() {
    return 6;
  }

  @Override
  public int getPotencia() {
    return 300; 
  }

  @Override
  public boolean veiculoPasseio() {
    return false;
  }
}
