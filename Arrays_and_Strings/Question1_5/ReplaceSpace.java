package Question1_5;

public class ReplaceSpace {
  private static String input = "space1-> <-space1_space2->  <-space2";

  /**
   * @param args
   */
  public static void main(String[] args) {
    String after = replaceSpace(input);
    System.out.println("before : " + input);
    System.out.println("after : " + after);
  }
  
  private static String replaceSpace(String s) {
    String result = new String();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        result += '%';
        result += '2';
        result += '0';
      } else {
        result += s.charAt(i);
      }
    }
    return result;
  }

}
