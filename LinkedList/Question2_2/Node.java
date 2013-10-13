package Question2_2;

public class Node {
  public int data;
  public Node next;
  
  public Node() {
    data = 0;
    next = null;
  }
  
  public Node(int value) {
    data = value;
    next = null;
  }
  
  public void addToNext(int value) {
    Node tmp = new Node(value);
    if (next == null) {
      next = tmp;
    } else {
      tmp.next = next;
      next = tmp.next;
    }
  }
  
  public void addToEnd(int value) {
    Node tmp = new Node(value);
    if (next == null) {
      next = tmp;
    } else {
      Node node = next;
      while (node.next != null) {
        node = node.next;
      }
      node.next = tmp;
    }
  }
  
  public void removeNext() {
    if (next == null) {
      return;
    } else {
      next = next.next;
    }
  }
}
