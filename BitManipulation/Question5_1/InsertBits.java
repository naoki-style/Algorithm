package question5_1;

public class InsertBits {
  private int M;
  private int N;

  /**
   * @param args
   */
  public static void main(String[] args) {
    InsertBits ib = new InsertBits(Integer.parseInt("10000000000", 2), Integer.parseInt("10101", 2));
    int result = ib.insert(2, 6);
    System.out.println(Integer.toBinaryString(result));
  }
  
  public InsertBits(int n, int m) {
    M = m;
    N = n;
  }
  
  private int insert(int i, int j) {
    int mask = ((1 << (j + 1)) - 1) & (((~0) >> i) << i);
    N = N & (~mask);
    N = N | ((M << i) & mask);
    return N;
  }

}
