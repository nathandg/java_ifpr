import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    double salario = 0;
    double financiamento = 0;

    Scanner scan = new Scanner(System.in);
    System.out.println("Informe o seu salário: ");
    salario = scan.nextDouble();

    System.out.println("Informe o valor do financiamento pretendido: ");
    financiamento = scan.nextDouble();

    if (financiamento <= 5 * salario) {
      System.out.println("Financiamento Concedido");
    } else {
      System.out.println("Financiamento Negado");
    }
    System.out.println("Obrigado por nos consultar.");
    scan.close();
  }
}
