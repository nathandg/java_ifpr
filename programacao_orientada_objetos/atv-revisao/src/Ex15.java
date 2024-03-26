import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira a parte numérica da placa do carro (4 dígitos):");
    int placa = scanner.nextInt();

    int ultimoDigito = placa % 10;

    switch (ultimoDigito) {
      case 1:
      case 2:
        System.out.println("O dia do rodízio é Segunda-feira.");
        break;
      case 3:
      case 4:
        System.out.println("O dia do rodízio é Terça-feira.");
        break;
      case 5:
      case 6:
        System.out.println("O dia do rodízio é Quarta-feira.");
        break;
      case 7:
      case 8:
        System.out.println("O dia do rodízio é Quinta-feira.");
        break;
      case 9:
      case 0:
        System.out.println("O dia do rodízio é Sexta-feira.");
        break;
      default:
        System.out.println("Número de placa inválido.");
        break;
    }

    scanner.close();
  }
}