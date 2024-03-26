public class Ex18 {
  public static void main(String[] args) {
    int number = 1;
    while (number <= 20) {
      if (number % 2 == 0) {
        System.out.println(number + " é par");
      } else {
        System.out.println(number + " é ímpar");
      }
      number++;
    }
  }
}
