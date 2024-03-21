import java.util.ArrayList;
import java.util.Scanner;

import Cliente.Cliente;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Cadastro de clientes\n");
    Scanner scanner = new Scanner(System.in);

    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    boolean continuar = true;

    while (continuar) {
      System.out.print("Digite o nome do cliente: ");
      String nome = scanner.nextLine();

      System.out.print("Digite o email do cliente: ");
      String email = scanner.nextLine();

      System.out.print("Digite a idade do cliente: ");
      int idade = scanner.nextInt();

      Cliente cliente = new Cliente(nome, email, idade);
      clientes.add(cliente);

      System.out.print("Deseja cadastrar outro cliente? (s/n) ");
      String resposta = scanner.next();
      continuar = resposta.equals("s");
    }

    System.out.println("\t Clientes cadastrados:");
    for (Cliente cliente : clientes) {
      System.out.println(cliente);
    }

  }
}
