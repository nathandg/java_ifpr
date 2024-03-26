import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) throws Exception {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int num = scan.nextInt();

    if (num < 0) {
      System.out.println("Este número não é positivo.");
      scan.close();
      return;
    }

    if (num % 2 == 0) {
      System.out.println("Número é par");
    } else {
      System.out.println("Número é ímpar");
    }

    scan.close();
  }
}
