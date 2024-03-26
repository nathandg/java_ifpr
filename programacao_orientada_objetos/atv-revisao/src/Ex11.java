import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o número de eixos do veículo:");
    int eixos = scan.nextInt();

    double valorPedagio;
    switch (eixos) {
      case 2:
        valorPedagio = 5.00; // exemplo de valor
        break;
      case 3:
        valorPedagio = 10.00; // exemplo de valor
        break;
      case 4:
        valorPedagio = 15.00; // exemplo de valor
        break;
      default:
        valorPedagio = 20.00; // exemplo de valor
        break;
    }

    System.out.println("O valor do pedágio é: " + valorPedagio);
    scan.close();
  }
}
