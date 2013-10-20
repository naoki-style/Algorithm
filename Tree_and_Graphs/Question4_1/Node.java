package Question4_1;

public class Node {
  private int value;
  public Node left;
  public Node right;
  
  public Node() {
    value = 0;
    left = null;
    right = null;
  }
  
  public Node(int v) {
    value = v;
    left = null;
    right = null;
  }
  
  public int getValue() {
    return value;
  }

}
