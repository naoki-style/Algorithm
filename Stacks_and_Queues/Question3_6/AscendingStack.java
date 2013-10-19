package Question3_6;

import java.util.Stack;

public class AscendingStack {
  private static Stack stack = new Stack();

  /**
   * @param args
   */
  public static void main(String[] args) {
    prepareData();
    sort();
    printStackValues();
  }
  
  public AscendingStack() {
    
  }
  
  private static void prepareData() {
    System.out.println("original data");
    for (int i = 0; i < 100; i++) {
      int value = (int)(Math.random() * 100);
      stack.push(value);
      System.out.print(value + ", ");
    }
    System.out.println("");
  }
  
  public static void sort() {
    Stack temp = new Stack();
    int tmp;
    while(!stack.isEmpty()) {
      tmp = (int)stack.pop();
      while(!temp.isEmpty() && (int)temp.peek() > tmp) {
        stack.push((int)temp.pop());
      }
      temp.push(tmp);
    }
    stack = temp;
  }
  
  private static void printStackValues() {
    System.out.println("print");
    int max = stack.size();
    for (int i = 0; i < max; i++) {
      System.out.print(stack.pop() + ", ");
    }
    System.out.println("");
  }

}
