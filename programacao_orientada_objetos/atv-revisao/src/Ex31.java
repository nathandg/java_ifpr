public class Ex31 {
  public static void main(String[] args) {
    int[] array = { 5, 10, 3, 8, 15 };
    int max = array[0];

    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    System.out.println("O maior elemento do array é: " + max);
  }
}
