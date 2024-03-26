import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a distancia em km: ");
    double distancia = scan.nextDouble();

    System.out.println("Digite o tempo em horas: ");
    double tempo = scan.nextDouble();

    double velocidadeMedia = distancia / tempo;

    System.out.println("A velocidade média é: " + velocidadeMedia + " km/h");
    scan.close();
  }
}