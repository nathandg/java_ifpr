package produtos;

public class Livro extends Produto {
  String autores;
  String editora;
  int numeroPaginas;
  int anoPublicacao;
  
  public Livro(String autores, String editora, int numeroPaginas, int anoPublicacao) {
    this.autores = autores;
    this.editora = editora;
    this.numeroPaginas = numeroPaginas;
    this.anoPublicacao = anoPublicacao;
  }

  @Override
  public String toString() {
    return "Livro [autores=" + autores + ", editora=" + editora + ", numeroPaginas=" + numeroPaginas
        + ", anoPublicacao=" + anoPublicacao + "]";
  }
  
}
