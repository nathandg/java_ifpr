import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o salário: ");
    double salario = scan.nextDouble();

    double imposto = 0;

    if (salario >= 1434.59 && salario <= 2150) {
      imposto = salario * 0.075;
    } else if (salario >= 2150.01 && salario <= 2866.70) {
      imposto = salario * 0.15;
    } else if (salario >= 2866.71 && salario <= 3582) {
      imposto = salario * 0.225;
    } else if (salario > 3582) {
      imposto = salario * 0.275;
    }

    System.out.println("O imposto é: " + imposto);
    scan.close();
  }
}
