import java.util.Scanner;
public class Ex26 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número para a tabuada: ");
    int numero = scanner.nextInt();

    System.out.println("Tabuada do " + numero + ":");

    for (int i = 0; i <= 10; i++) {
      int resultado = numero * i;
      System.out.println(numero + " x " + i + " = " + resultado);
    }

    scanner.close();
  }
}
