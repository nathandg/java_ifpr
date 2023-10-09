package Cliente;

import Endereco.Endereco;

public class Cliente {
  String nome;
  int idade;
  Endereco endereco;

  public Cliente(String nome, int idade, Endereco endereco) {
    this.nome = nome;
    this.idade = idade;
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    return "Cliente [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
  }

}
