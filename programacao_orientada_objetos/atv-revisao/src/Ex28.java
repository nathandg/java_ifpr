import java.util.Scanner;

public class Ex28 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char choice;

    do {
      System.out.println("Digite uma das seguintes teclas: '+', '-', '*', '/' ou 'S':");
      choice = scanner.next().charAt(0);

      switch (choice) {
        case '+':
          System.out.println("Digite o primeiro número:");
          double num1 = scanner.nextDouble();
          System.out.println("Digite o segundo número:");
          double num2 = scanner.nextDouble();
          double sum = num1 + num2;
          System.out.println("Resultado: " + sum);
          break;
        case '-':
          System.out.println("Digite o primeiro número:");
          num1 = scanner.nextDouble();
          System.out.println("Digite o segundo número:");
          num2 = scanner.nextDouble();
          double difference = num1 - num2;
          System.out.println("Resultado: " + difference);
          break;
        case '*':
          System.out.println("Digite o primeiro número:");
          num1 = scanner.nextDouble();
          System.out.println("Digite o segundo número:");
          num2 = scanner.nextDouble();
          double product = num1 * num2;
          System.out.println("Resultado: " + product);
          break;
        case '/':
          System.out.println("Digite o primeiro número:");
          num1 = scanner.nextDouble();
          System.out.println("Digite o segundo número:");
          num2 = scanner.nextDouble();
          if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Resultado: " + quotient);
          } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
          }
          break;
        case 'S':
          System.out.println("Encerrando o programa...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
          break;
      }
    } while (choice != 'S');

    scanner.close();
  }
}
