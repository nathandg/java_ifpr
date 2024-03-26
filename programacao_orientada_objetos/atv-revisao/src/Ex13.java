import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a idade do condutor: ");
    int idade = scan.nextInt();

    System.out.println("Informe o gênero do condutor (M/F): ");
    String genero = scan.next();

    System.out.println("Qual o uso do veículo: trabalho (t), passeio (p) ou ambos (a)? ");
    String uso = scan.next();

    System.out.println("Possui garagem para o veículo (s/n)? ");
    String garagem = scan.next();
    String tipoGaragem = "";

    if (garagem.equalsIgnoreCase("s")) {
      System.out.println("a garagem é diurna (d), noturna (n) ou ambas (a)? ");
      tipoGaragem = scan.next();
    }

    int pontosRisco = 0;

    if (idade < 18) {
      System.out.println("Não há cobertura");
      scan.close();
      return;
    }

    if (idade >= 18 && idade <= 23) {
      pontosRisco += 4;
    }

    else if (idade <= 29) {
      pontosRisco += 3;
    }

    else if (idade <= 45) {
      pontosRisco += 2;
    }

    else {
      pontosRisco += 1;
    }

    if (genero.equalsIgnoreCase("M")) {
      pontosRisco += 3;
    } else {
      pontosRisco += 2;
    }

    if (uso.equalsIgnoreCase("t")) {
      pontosRisco += 2;
    } else if (uso.equalsIgnoreCase("p")) {
      pontosRisco += 1;
    } else {
      pontosRisco += 3;
    }

    if (garagem.equalsIgnoreCase("s")) {
      if (tipoGaragem.equalsIgnoreCase("d")) {
        pontosRisco += 4;
      } else if (tipoGaragem.equalsIgnoreCase("n")) {
        pontosRisco += 2;
      } else {
        pontosRisco += 1;
      }
    } else {
      pontosRisco += 6;
    }

    if (pontosRisco <= 7) {
      System.out.println("Risco Baixo -> desconto de 10%");
    }

    else if (pontosRisco <= 10) {
      System.out.println("Risco Médio");
    }

    else if (pontosRisco <= 14) {
      System.out.println("Risco alto -> acréscimo de 10%");
    }

    else {
      System.out.println("Altíssimo -> acréscimo de 40%");
    }
    scan.close();
  }
}
