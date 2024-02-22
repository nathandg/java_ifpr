package clientes;

import planos.PlanoSaude;

public class Cliente {
  private String nome;
  private String cpf;
  private String endereco;
  private PlanoSaude plano;

  public Cliente(String nome, String cpf, String endereco, PlanoSaude plano) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.plano = plano;
  }

  public String mostrarMensalidade() {
    return "Mensalidade: R$ " + plano.calcularMensalidade();
  }

  public String mostrarMensalidade(int desconto) {
    return "Mensalidade descontado " + desconto + "% : R$ " + plano.calcularMensalidade(desconto);
  }

  public String mostrarCobertura() {
    return "Cobertura: " + plano.cobertura();
  }

  @Override
  public String toString() {
    return 
      "Cliente [nome=" + nome + 
      ", cpf=" + cpf +
      ", endereco=" + endereco +
      ", plano=" + plano.getClass().getSimpleName() + "]";
  }

}
