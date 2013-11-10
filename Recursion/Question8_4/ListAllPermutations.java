package question8_4;

import java.util.ArrayList;

public class ListAllPermutations {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ArrayList<String> result = getPermutations("abcde");
    printAll(result);
  }
  
  private static ArrayList<String> getPermutations(String s) {
    ArrayList<String> result = new ArrayList<String>();
    if (s.length() == 1) {
      result.add(s);
    } else {
      ArrayList<String> tmpList = getPermutations(s.substring(0, s.length() - 1));
      for (String str : tmpList) {
        for (int i = 0; i <= str.length(); i++) {
          String first = str.substring(0, i);
          String end = str.substring(i, str.length());
          result.add(first + s.charAt(s.length() - 1) + end);
        }
      }
    }
    return result;
  }
  
  private static void printAll(ArrayList<String> strs) {
    System.out.println("All Permutations");
    for (String str : strs) {
      System.out.println(str);
    }
  }

}
