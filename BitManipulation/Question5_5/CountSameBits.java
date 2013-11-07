package question5_5;

public class CountSameBits {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("A(31), B(14) : " + compareBits(31, 14));
    System.out.println("A(16), B(15) : " + compareBits(16, 15));
    System.out.println("A(31), B(1) : " + compareBits(31, 1));
    System.out.println("A(10), B(5) : " + compareBits(10, 5));
  }
  
  private static int compareBits(int a, int b) {
    int res = 0;
    int temp = a ^ b;
    for (int i = 0; temp > 0; i++) {
      res += temp & 1;
      temp = temp >> 1;
    }
    return res;
  }

}
