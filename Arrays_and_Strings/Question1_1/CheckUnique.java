package Question1_1;

import java.util.Arrays;

public class CheckUnique {
  private static String input = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZa";

  /**
   * @param args
   */
  public static void main(String[] args) {
    if (executeCheck() == true) {
      System.out.println("unique!!");
    } else {
      System.out.println("Not Unique!!");
    }
  }
  
  private static boolean executeCheck() {
    boolean res = true;
    char[] sorted = input.toCharArray();
    Arrays.sort(sorted);
    String sorted_input = new String(sorted);
    System.out.println(sorted_input);
    for (int i = 0; i < sorted_input.length() - 1; i++) {
      if ((sorted_input.charAt(i) - sorted_input.charAt(i + 1)) == 0) {
        System.out.println("sorted_input : " + i + ", " + sorted_input.charAt(i) + " + " + sorted_input.charAt(i + 1));
        return false;
      }
    }
    return res;
  }

}
