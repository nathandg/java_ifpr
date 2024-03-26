import java.util.Arrays;
public class Ex36 {
  public static void main(String[] args) {
    int[] array = {5, 2, 8, 1, 9};

    Arrays.sort(array);

    for (int num : array) {
      System.out.print(num + " ");
    }
  }
}
