import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira a massa do leite:");
    double massa = scan.nextDouble();

    System.out.println("Insira a densidade do leite:");
    double densidade = scan.nextDouble();

    System.out.println("Insira o preço por kg de leite:");
    double preco = scan.nextDouble();

    double volume = massa / densidade;

    String categoria;
    if (densidade < 1.14) {
      categoria = "Categoria I";
    } else if (densidade <= 1.20) {
      categoria = "Categoria II";
    } else {
      categoria = "Categoria III";
    }

    System.out.println("Valores digitados: Massa = " + massa + ", Densidade = " + densidade + ", Preço = " + preco);
    System.out.println("Volume de leite calculado: " + volume);
    System.out.println("Categoria do leite: " + categoria);
    scan.close();
  }
}