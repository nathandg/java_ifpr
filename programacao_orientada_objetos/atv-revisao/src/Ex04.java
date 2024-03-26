import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while (true) {

      System.out.println("Digite o nome do funcionário: ");
      String nome = scan.nextLine();

      System.out.println("Digite o salário do funcionário: ");
      double salario = scan.nextDouble();

      double novoSalario = 0;
      double percentual = 0;

      if (salario <= 400) {
        percentual = 15;
      } else if (salario <= 700) {
        percentual = 12;
      } else if (salario <= 1000) {
        percentual = 10;
      } else if (salario <= 1800) {
        percentual = 7;
      } else if (salario <= 2500) {
        percentual = 4;
      } else {
        percentual = 0;
      }

      novoSalario = salario + (salario * (percentual / 100));

      System.out.println("Nome: " + nome);
      System.out.println("Percentual de aumento: " + percentual + "%");
      System.out.println("Salário atual: " + salario);
      System.out.println("Novo salário: " + novoSalario);

      System.out.println("Deseja calcular o salário de outro funcionário? (s/n)");
      String continuar = scan.next();

      if (continuar.equals("n")) {
        scan.close();
        return;
      }
    }
  }
}
