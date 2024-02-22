import java.util.ArrayList;

import produtos.Camiseta;
import produtos.Furadeira;
import produtos.Livro;
import produtos.Produto;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Produtos: ");

    Livro livro = new Livro("Nathan Silva", "Colorado", 25, 2020);
    Furadeira furadeira = new Furadeira("Bosch", "Azul", 110, 2000);
    Camiseta camiseta = new Camiseta("Azul", "P");

    ArrayList<Produto> produtos = new ArrayList<Produto>();
    produtos.add(livro);
    produtos.add(furadeira);
    produtos.add(camiseta);

    for (Produto produto : produtos) {
      System.out.println("\t" + produto);
    }
  }
}