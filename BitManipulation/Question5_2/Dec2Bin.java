package question5_2;

public class Dec2Bin {
  private String decNumber;

  /**
   * @param args
   */
  public static void main(String[] args) {
    Dec2Bin test1 = new Dec2Bin("10.25");
    String answer1 = test1.convert();
    System.out.println("10.25 -> " + answer1);
    Dec2Bin test2 = new Dec2Bin("16");
    String answer2 = test2.convert();
    System.out.println("16 -> " + answer2);
    Dec2Bin test3 = new Dec2Bin("0.125");
    String answer3 = test3.convert();
    System.out.println("0.125 -> " + answer3);
    Dec2Bin test4 = new Dec2Bin("15.3");
    String answer4 = test4.convert();
    System.out.println("15.3 -> " + answer4);
  }
  
  public Dec2Bin(String number) {
    decNumber = number;
  }
  
  private String convert() {
    int period = decNumber.indexOf('.');
    double double_part = 0;
    if (period == -1) {
      period = decNumber.length();
    } else {
      double_part = Double.parseDouble(decNumber.substring(period, decNumber.length()));
    }
    int int_part = Integer.parseInt(decNumber.substring(0, period));
    String result = "";
    while(int_part > 0) {
      int answer = int_part % 2;
      result = answer + result;
      int_part = int_part / 2;
    }
    result += ".";
    while (double_part != 0) {
      double_part = double_part * 2;
      if (double_part >= 1) {
        result = result + "1";
        double_part -= 1;
      } else {
        result = result + "0";
      }
      if (result.length() >= 32) {
        return "ERROR";
      }
    }
    return result;
  }

}
