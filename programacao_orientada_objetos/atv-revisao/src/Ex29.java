public class Ex29 {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }

    System.out.println("Soma: " + sum);
  }
}
