package question8_1;

public class GetFibonacciNumber {

  /**
   * @param args
   */
  public static void main(String[] args) {
    for (int i = 0; i < 40; i++) {
      System.out.println("Fibonacci(" + i + ") : " + getNumber(i));
    }
  }
  
  private static int getNumber(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }
    return getNumber(n - 1) + getNumber(n - 2);
  }

}
