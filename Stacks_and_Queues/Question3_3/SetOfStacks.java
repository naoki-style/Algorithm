package Question3_3;

import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {
  private static ArrayList<Stack> stacks = new ArrayList<Stack>();
  private static final int capacity = 10;

  /**
   * @param args
   */
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      push(i);
    }
    printStackState();
    System.out.println("peek : " + peek());
    for (int i = 0; i < 40; i++) {
      System.out.print(pop() + ", ");
    }
    System.out.println("\n peek : " + peek());
    printStackState();
    for (int i = 0; i < 60; i++) {
      System.out.print(pop() + ", ");
    }
    printStackState();
  }
  
  public SetOfStacks() {
    
  }
  
  public static void push(int value) {
    int current_stack = currentStack();
    boolean add = false;
    Stack stack;
    if (current_stack == -1) {
      stack = new Stack();
      add = true;
    } else {
      stack = stacks.get(current_stack);
    }
    if (stack.size() == capacity) {
      stack = new Stack();
      add = true;
    }
    stack.add(value);
    if (add == true) {
      stacks.add(stack);
    }
  }
  
  public static int pop() {
    int ret = -1;
    int current_stack = currentStack();
    if (current_stack == -1){
      return -1;
    }
    Stack stack = stacks.get(current_stack);
    ret = (int) stack.pop();
    if (stack.size() == 0) {
      stacks.remove(current_stack);
    }
    return ret;
  }

  public static int peek() {
    int ret = -1;
    int current_stack = currentStack();
    if (current_stack == -1){
      return -1;
    }
    Stack stack = stacks.get(current_stack);
    ret = (int) stack.peek();
    return ret;
  }
  
  private static int currentStack() {
    int size = stacks.size();
    return size - 1;
  }
  
  private static void printStackState() {
    for (int i = 0; i < stacks.size(); i++) {
      Stack stack = stacks.get(i);
      System.out.print("[" + i + "] : ");
      for (int j = 0; j < stack.size(); j++) {
        System.out.print((int)stack.get(j) + ",");
      }
      System.out.println("");
    }
  }

}
