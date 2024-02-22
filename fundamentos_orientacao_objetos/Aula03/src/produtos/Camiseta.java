package produtos;

public class Camiseta extends Produto {
  String cor;
  String tamanho;

  public Camiseta(String cor, String tamanho) {
    this.cor = cor;
    this.tamanho = tamanho;
  }

  @Override
  public String toString() {
    return "Camiseta [cor=" + cor + ", tamanho=" + tamanho + "]";
  }

}
