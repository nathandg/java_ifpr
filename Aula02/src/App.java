import Musico.Baixista;
import Veiculo.Caminhao;
import Veiculo.Carro;
import Veiculo.Moto;
import Veiculo.Veiculo;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    Baixista baixista = new Baixista();
    baixista.afinarInstrumento();

    System.out.println(baixista.getNomeDoInstrumento());

    Veiculo carro = new Carro();
    Veiculo moto = new Moto();
    Veiculo caminhao = new Caminhao();
  
    Veiculo[] veiculos = { carro, moto, caminhao };

    for (Veiculo veiculo : veiculos) {
      System.out.println(" Potência: " + veiculo.getPotencia());
      System.out.println(" Quantidade de pneus: " + veiculo.getQuantidadeDePneus());
      System.out.println(" Veículo de passeio: " + veiculo.veiculoPasseio());
    }

  }
}
