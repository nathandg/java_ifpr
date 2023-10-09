import Cliente.Cliente;
import Endereco.Endereco;

public class App {
  public static void main(String[] args) throws Exception {

    Endereco enderecoJoao = new Endereco(
        "Rua dos Passarinhos",
        "10",
        "Centro",
        "São Paulo",
        "SP",
        "00000-000");

    Cliente joao = new Cliente("João", 19, enderecoJoao);

    System.out.println(joao);
    System.out.println(enderecoJoao);

  }
}
