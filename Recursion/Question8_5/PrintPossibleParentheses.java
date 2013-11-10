package question8_5;

import java.util.ArrayList;

public class PrintPossibleParentheses {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String str = "";
    getSequence(3, 3, str);
  }
  
  private static void getSequence(int left, int right, String str) {
    if (left > right) {
      return;
    }
    if (left == 0 && right == 0) {
      System.out.println("res" + str);
    } else {
      if (left > 0) {
        getSequence(left - 1, right, str + '(');
      }
      if (right > 0) {
        getSequence(left, right - 1, str + ')');
      }
    }
  }

}
