import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o sexo da criança (M/F): ");
    String sexo = scan.next();

    System.out.println("Informe o peso da criança: ");
    double peso = scan.nextDouble();

    int idadeProvavel = 0;

    if (sexo.equals("M")) {
      if (peso >= 8.5 && peso <= 12.5) {
        idadeProvavel = 1;
      }

      else if (peso <= 15.2) {
        idadeProvavel = 2;
      }

      else if (peso <= 18) {
        idadeProvavel = 3;
      }
    }

    else if (sexo.equals("F")) {
      if (peso >= 7.5 && peso <= 11.5) {
        idadeProvavel = 1;
      }

      else if (peso <= 14.5) {
        idadeProvavel = 2;
      }

      else if (peso <= 17.95) {
        idadeProvavel = 3;
      }
    }

    System.out.println("A idade provável da criança é: " + idadeProvavel + " ano(s)");
    if (idadeProvavel == 0) {
      System.out.println("Não foi possível determinar a idade provável da criança.");
    }

    else if (idadeProvavel == 1) {
      System.out.println("Nesta idade meninos tem entre: 8.5 e 12.5 kg");
      System.out.println("Nesta idade meninas tem entre: 7.5 e 11.5 kg");
    }

    else if (idadeProvavel == 2) {
      System.out.println("Nesta idade meninos tem entre: 10.1 e 15.2 kg");
      System.out.println("Nesta idade meninas tem entre: 9.8 e 14.5 kg");
    }

    else if (idadeProvavel == 3) {
      System.out.println("Nesta idade meninos tem entre: 11.4 e 18 kg");
      System.out.println("Nesta idade meninas tem entre: 14.6 e 17.95 kg");
    }

    scan.close();
  }
}