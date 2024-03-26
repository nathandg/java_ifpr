import java.util.Arrays;
public class Ex37 {
  public static void main(String[] args) {
    int[] array = {5, 2, 8, 1, 9};

    Arrays.sort(array);

    int[] desc = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      desc[i] = array[array.length - 1 - i];
    }

    for (int num : desc) {
      System.out.print(num + " ");
    }
  }
}
