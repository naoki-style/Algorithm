package question9_1;

public class Merge {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int[] aBuf = new int[100];
    int[] bBuf = new int[5];
    for (int i = 0; i < 30; i++) {
      aBuf[i] = 3 * i;
    }
    
    for (int i = 0; i < 5; i++) {
      aBuf[i] = 4 * i;
    }
    
    int[] result = merge2arrays(aBuf, bBuf, 30, 5);
    printBuf(result);
  }
  
  public static void printBuf(int[] array) {
    for(int i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
  
  
  public static int[] merge2arrays(int[] a, int[] b, int aSize, int bSize) {
    int aPos = aSize - 1;
    int bPos = bSize - 1;
    int ptr = aSize + bSize - 1;
    
    while(bPos >= 0 && aPos >= 0){ 
      if (a[aPos] > b[bPos]) {
        a[ptr--] = a[aPos--];
      } else {
        a[ptr--] = b[bPos--];
      }
    }
    
    while(bPos >= 0) {
      a[ptr--] = b[bPos--];
    }
    
    return a;
    }

}
