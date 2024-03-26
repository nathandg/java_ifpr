import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira a massa em kg:");
    double massa = scan.nextDouble();

    System.out.println("Insira a altura em metros:");
    double altura = scan.nextDouble();

    double imc = massa / (altura * altura);

    if (imc < 18.5) {
      System.out.println("Abaixo do peso");
    }

    else if (imc >= 18.5 && imc < 25) {
      System.out.println("Peso normal");
    }

    else if (imc >= 25 && imc <= 30) {
      System.out.println("Acima do peso");
    }

    else if (imc > 30) {
      System.out.println("Obeso");
    }

    scan.close();
  }
}