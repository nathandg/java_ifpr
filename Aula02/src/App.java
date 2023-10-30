import Musico.Baixista;
import Musico.Musico;
import Termostato.Termostato;
import Veiculo.Caminhao;
import Veiculo.Carro;
import Veiculo.Moto;
import Veiculo.Veiculo;

public class App {
  public static void main(String[] args) throws Exception {
    // Músicos (Herança com Classes Abstratas)
    System.out.println("\n------------------");

    Musico baixista = new Baixista();
    baixista.afinarInstrumento();

    System.out.println(baixista.getNomeDoInstrumento());

    // Veículos (Interface)
    System.out.println("\n------------------");

    Veiculo carro = new Carro();
    Veiculo moto = new Moto();
    Veiculo caminhao = new Caminhao();
  
    Veiculo[] veiculos = { carro, moto, caminhao };

    for (Veiculo veiculo : veiculos) {
      System.out.println(" Potência: " + veiculo.getPotencia());
      System.out.println(" Quantidade de pneus: " + veiculo.getQuantidadeDePneus());
      System.out.println(" Veículo de passeio: " + veiculo.veiculoPasseio() + "\n");
    }

    // Termostato (Getters e Setters)
    System.out.println("\n------------------");
    Termostato fogao = new Termostato();
    fogao.setTempAlvo(200);

  }
}
