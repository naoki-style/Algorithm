package Question2_4;

import java.util.ArrayList;
import java.util.List;

public class AddTwoLists {
  public static List<Integer> number1, number2;

  /**
   * @param args
   */
  public static void main(String[] args) {
    prepareNumbers();
    List<Integer> res = addNumbers();
    System.out.println("result:");
    for (int i = res.size() - 1; i >= 0; i--) {
      System.out.print(res.get(i));
    }
    System.out.println("");
  }
  
  public static void prepareNumbers() {
    number1 = new ArrayList<Integer>();
    number2 = new ArrayList<Integer>();
    while(true) {
      double d = Math.random() * 10;
      if (d > 9) {
        break;
      }
      int temp = (int)d;
      number1.add(new Integer(temp));
    }
    while(true) {
      double d = Math.random() * 10;
      if (d > 9) {
        break;
      }
      int temp = (int)d;
      number2.add(new Integer(temp));
    }
    System.out.println("number1:");
    for (int i = number1.size() - 1; i >= 0; i--) {
      System.out.print(number1.get(i));
    }
    System.out.println("");
    System.out.println("number2:");
    for (int i = number2.size() - 1; i >= 0; i--) {
      System.out.print(number2.get(i));
    }
    System.out.println("");
  }
  
  public static List<Integer> addNumbers() {
    List<Integer> result = new ArrayList<Integer>();
    int carrige = 0;
    int temp_count;
    int index = 0;
    while(true) {
      temp_count = carrige;
      if (index >= number1.size() && index >= number2.size()) {
        break;
      }
      if (index < number1.size()) {
        temp_count += number1.get(index);
      }
      if (index < number2.size()) {
        temp_count += number2.get(index);
      }
      result.add(new Integer(temp_count % 10));
      carrige = temp_count / 10;
      index++;
    }
    return result;
  }

}
