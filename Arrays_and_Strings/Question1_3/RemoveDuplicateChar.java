package Question1_3;

public class RemoveDuplicateChar {
  private static String input = "abcdacdeaghkseabABC";

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("input = " + input);
    String str = executeRemoveDuplicate();
    System.out.println("result = " + str);
  }
  
  private static String executeRemoveDuplicate() {
    String result = new String();
    if (input.length() <= 1) {
      return input;
    }
    result += input.charAt(0);
    for (int i = 1; i < input.length(); i++) {
      int j = 0;
      for (; j < result.length(); j++) {
        if (result.charAt(j) == input.charAt(i)) {
          break;
        }
      }
      if (j == result.length()) {
        result += input.charAt(i);
      }
    }
    return result;
  }

}
