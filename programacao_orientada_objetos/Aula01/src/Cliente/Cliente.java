package Cliente;

public class Cliente {
  private String nome;
  private String email;
  private int idade;
  private double valorMedioDasCompras;

  public Cliente(String nome, String email, int idade) {
    this.nome = nome;
    this.email = email;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public int getIdade() {
    return idade;
  }
  
  public void setIdade(int idade) {
    this.idade = idade;
  }
  
  public double getValorMedioDasCompras() {
    return valorMedioDasCompras;
  }
  
  public void setValorMedioDasCompras(double valorMedioDasCompras) {
    this.valorMedioDasCompras = valorMedioDasCompras;
  }
  
  @Override
  public String toString() {
    return "Cliente [nome=" + nome + ", email=" + email + ", idade=" + idade + ", valorMedioDasCompras="
        + valorMedioDasCompras + "]";
  }
}
