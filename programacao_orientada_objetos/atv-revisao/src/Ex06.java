import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira a altura da parede (AP):");
    double alturaParede = scan.nextDouble();

    System.out.println("Insira a largura da parede (LP):");
    double larguraParede = scan.nextDouble();

    System.out.println("Insira a altura do azulejo (AA):");
    double alturaAzulejo = scan.nextDouble();

    System.out.println("Insira a largura do azulejo (LA):");
    double larguraAzulejo = scan.nextDouble();

    double areaParede = alturaParede * larguraParede;
    double areaAzulejo = alturaAzulejo * larguraAzulejo;

    int numeroAzulejos = (int) Math.ceil(areaParede / areaAzulejo);

    System.out.println("O número de azulejos necessários é: " + numeroAzulejos);
    scan.close();
  }
}
