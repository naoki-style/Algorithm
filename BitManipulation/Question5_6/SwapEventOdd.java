package question5_6;

public class SwapEventOdd {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int v = 0xaaaaaaaa;
    System.out.println("value[" + v + "] ->" + swap(v));
    int v2 = 0x55555555;
    System.out.println("value[" + v2 + "] ->" + swap(v2));
    int v3 = 0xffffffff;
    System.out.println("value[" + v3 + "] ->" + swap(v3));
    int v4 = 0x00000000;
    System.out.println("value[" + v4 + "] ->" + swap(v4));
  }
  
  private static int swap(int value) {
    return (((value & 0x55555555) << 1) | ((value & 0xaaaaaaaa) >> 1));
  }

}
