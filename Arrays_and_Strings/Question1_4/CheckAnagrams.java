package Question1_4;

import java.util.Arrays;

public class CheckAnagrams {
  private static String str1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static String str2 = "ZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcba";

  /**
   * @param args
   */
  public static void main(String[] args) {
    boolean flg = checkPalindrome(str1, str2);
    System.out.println("s1 : " + str1);
    System.out.println("s2 : " + str2);
    System.out.println("Resulet(checkPalindrome) : " + flg);
    boolean flg2 = checkAnagrams(str1, str2);
    System.out.println("Resulet(checkPalindrome) : " + flg2);
  }
  
  private static boolean checkPalindrome(String s1, String s2) {
    boolean res = true;
    if (s1.length() != s2.length()) {
      return false;
    }
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(s2.length() - i - 1)) {
        res = false;
        break;
      }
    }
    return res;
  }
  
  private static boolean checkAnagrams(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }    
    return sort(s1).equals(sort(s2));
  }
  
  private static String sort(String s) {
    String res = new String();
    char[] temp = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      temp[i] = s.charAt(i);
    }
    Arrays.sort(temp);
    for (int i = 0; i < temp.length; i++) {
      res += temp[i];
    }
    return res;
  }

}
