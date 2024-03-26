public class Ex32 {
  public static void main(String[] args) {
    int[] arr = { 5, 10, 3, 8, 15 };
    int smallest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }
    System.out.println("O menor elemento do array é: " + smallest);
  }
}

