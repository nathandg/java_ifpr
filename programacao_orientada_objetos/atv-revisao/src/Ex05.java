import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o valor em reais(R$): ");
    double valor = scan.nextDouble();

    System.out.println("Os R$ " + valor + " em dólares é: " + String.format("%.2f", valor / 4.98));

    scan.close();
  }
}
