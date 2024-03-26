import java.util.Scanner;

public class Ex27 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
      System.out.println("\nDigite a opção desejada:");
      System.out.println("1 - Cadastro de Produtos");
      System.out.println("2 - Cadastro de Clientes");
      System.out.println("3 - Contas a Pagar");
      System.out.println("4 - Contas a Receber");
      System.out.println("5 - Relatórios");
      System.out.println("0 - Sair");

      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Você escolheu a opção: Cadastro de Produtos");
          // Implementar funcionalidade para Cadastro de Produtos
          break;
        case 2:
          System.out.println("Você escolheu a opção: Cadastro de Clientes");
          // Implementar funcionalidade para Cadastro de Clientes
          break;
        case 3:
          System.out.println("Você escolheu a opção: Contas a Pagar");
          // Implementar funcionalidade para Contas a Pagar
          break;
        case 4:
          System.out.println("Você escolheu a opção: Contas a Receber");
          // Implementar funcionalidade para Contas a Receber
          break;
        case 5:
          System.out.println("Você escolheu a opção: Relatórios");
          // Implementar funcionalidade para Relatórios
          break;
        case 0:
          System.out.println("Até logo...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    } while (opcao != 0);
    scanner.close();
  }
}
