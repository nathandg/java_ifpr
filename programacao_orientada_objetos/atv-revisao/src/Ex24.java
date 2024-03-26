public class Ex24 {
  public static void main(String[] args) {
    int number = 1;
    
    do {
      if (number % 2 == 0) {
        System.out.println(number + " is even");
      } else {
        System.out.println(number + " is odd");
      }
      
      number++;
    } while (number <= 20);
  }
}
