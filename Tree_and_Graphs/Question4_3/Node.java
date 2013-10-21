package Question4_3;

public class Node {
  private int value;
  public Node left, right;
  
  public Node(int v) {
    value = v;
    left = null;
    right = null;
  }
  
  public void setValue(int v) {
    value = v;
  }
  public int getValue() {
    return value;
  }
  
  public int getHeight() {
    if (left == null && right == null) {
      return 1;
    } else if (left == null) {
      return right.getHeight() + 1;
    } else if (right == null) {
      return left.getHeight() + 1;
    }
    return Math.max(left.getHeight(), right.getHeight()) + 1;
  }
  
}
