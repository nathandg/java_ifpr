import java.util.Scanner;
public class Ex08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Valor A: ");
    int a = input.nextInt();

    System.out.println("Valor B: ");
    int b = input.nextInt();

    int c = a;
    a = b;
    b = c;

    System.out.println("Valor A: " + a);
    System.out.println("Valor B: " + b);

    input.close();
  }
}
