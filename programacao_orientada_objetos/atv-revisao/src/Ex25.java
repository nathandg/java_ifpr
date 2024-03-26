import java.util.Scanner;
public class Ex25 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de alunos da sala (m): ");
    int m = scanner.nextInt();

    double somaNotas = 0;
    for (int i = 1; i <= m; i++) {
      System.out.print("Digite N" + i + ": ");
      double nota = scanner.nextDouble();
      somaNotas += nota;
    }

    double media = somaNotas / m;
    System.out.println("Média da sala: " + media);

    scanner.close();
  }
}
