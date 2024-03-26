public class Ex35 {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    int[] invertedArray = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      invertedArray[i] = array[array.length - 1 - i];
    }

    System.out.println("Array invertido:");
    for (int i = 0; i < invertedArray.length; i++) {
      System.out.println(invertedArray[i]);
    }
  }
}
