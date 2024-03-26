public class Ex33 {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    int element = 6;

    boolean containsElement = false;

    for (int i = 0; i < array.length; i++) {
      if (array[i] == element) {
        containsElement = true;
        break;
      }
    }

    if (containsElement) {
      System.out.println("O array contém o elemento.");
    } else {
      System.out.println("O array não contém o elemento.");
    }
  }
}
