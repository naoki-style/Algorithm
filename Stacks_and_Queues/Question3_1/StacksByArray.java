package Question3_1;

public class StacksByArray {

  /**
   * @param args
   */
  public static void main(String[] args) {
    for (int i = 0; i < STACK_SIZE; i++) {
      push(0, i);
    }
    printStack(0);
    for (int i = stackUsed[0]; i >= 0; i--) {
      pop(0);
    }
    printStack(0);
    for (int i = 0; i < 5; i++) {
      push(1, i);
    }
    printStack(1);
    for (int i = stackUsed[1]; i >= 0; i--) {
      pop(1);
    }
    printStack(1);
    for (int i = 0; i < STACK_SIZE + 10; i++) {
      push(2, i);
    }
    printStack(2);
    for (int i = stackUsed[2]; i >= 0; i--) {
      pop(2);
    }
    printStack(2);
    
  }
  
  private static final int STACK_SIZE = 30;
  private static int[] stack = new int[STACK_SIZE * 3];
  private static int[] stackEdge = {STACK_SIZE * 0, STACK_SIZE * 1, STACK_SIZE * 2};
  private static int[] stackUsed = {0, 0, 0};
  
  public static void push(int stackNum, int value) {
    if ( stackUsed[stackNum] >= STACK_SIZE) {
      return;
    }
    stack[stackEdge[stackNum] + stackUsed[stackNum]] = value;
    stackUsed[stackNum]++;
  }
  
  public static int pop(int stackNum) {
    if ( isEmpty(stackNum) ) {
      return -1;
    }
    stackUsed[stackNum]--;
    int res = stack[stackEdge[stackNum] + stackUsed[stackNum]];
    return res;
  }
  
  public int peek(int stackNum) {
    if ( isEmpty(stackNum) ) {
      return -1;
    }
    int res = stack[stackEdge[stackNum] + stackUsed[stackNum]];
    return res;
  }
  
  public static boolean isEmpty(int stackNum) {
    if ( stackUsed[stackNum] == 0 ) {
      return true;
    }
    return false;
  }
  
  private static void printStack(int num) {
    System.out.println("Status of Stack" + num);
    for (int i = 0; i < stackUsed[num]; i++) {
      System.out.print(stack[stackEdge[num] + i] + ", ");
    }
    System.out.println("");
  }
}
