package Question3_5;

import java.util.Stack;

public class MyQueue {
  private static Stack stack1 = new Stack();
  private static Stack stack2 = new Stack();

  /**
   * @param args
   */
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      add(i);
    }
    System.out.println("peek : " + peek());
    System.out.println("remove() start");
    while (!isEmpty()) {
      System.out.print(remove() + ", ");
    }
    System.out.println("");
  }
  
  public MyQueue() {
  }
  
  public static void add(int value) {
    stack1.push(value);
  }
  
  public static int remove() {
    int res = -1;
    if (stack2.size() != 0) {
      return (int)stack2.pop();
    }
    while(stack1.size() > 0) {
      stack2.push(stack1.pop());
    }
    res = (int)stack2.pop();
    return res;
  }

  public static int peek() {
    int res = -1;
    if (stack2.size() != 0) {
      return (int)stack2.peek();
    }
    while(stack1.size() > 0) {
      stack2.push(stack1.pop());
    }
    res = (int)stack2.peek();
    return res;
  }
  
  public static boolean isEmpty() {
    return (stack1.size() == 0 && stack2.size() == 0);
  }
  
}
