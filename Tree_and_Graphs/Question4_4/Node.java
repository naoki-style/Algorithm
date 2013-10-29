package Question4_4;

public class Node {
  private int value;
  public Node left, right;
  private String tag;
  
  public Node(int v, String t) {
    value = v;
    left = null;
    right = null;
    tag = t;
  }
  
  public void setValue(int v) {
    value = v;
  }
  public int getValue() {
    return value;
  }
  
  public void setTag(String t) {
    tag = t;
  }
  public String getTag() {
    return tag;
  }
  
  public void setLeft(Node n) {
    left = n;
  }
  public void setRight(Node n) {
    right = n;
  }
  public void setChild(Node l, Node r) {
    if (l != null) {
      left = l;
    }
    if (r != null) {
      right = r;
    }
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
