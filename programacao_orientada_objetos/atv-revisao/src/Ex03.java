import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe a nota do aluno: ");
    int nota = scan.nextInt();

    if (nota < 3) {
      System.out.println("Conceito E");
    } else if (nota >= 3 && nota <= 5) {
      System.out.println("Conceito D");
    } else if (nota >= 6 && nota <= 7) {
      System.out.println("Conceito C");
    } else if (nota >= 8 && nota <= 9) {
      System.out.println("Conceito B");
    } else {
      System.out.println("Conceito A");
    }

    scan.close();
    return;    
  }
}
