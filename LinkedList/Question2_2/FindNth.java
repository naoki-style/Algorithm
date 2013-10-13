package Question2_2;

public class FindNth {
  public static Node head;
  public static final int SIZE = 50;
  public static final int POINT = 30;

  /**
   * @param args
   */
  public static void main(String[] args) {
    prepareSinglyList();
    int result = findNth(head, POINT);
    System.out.println("Nth data is " + result);
  }
  
  private static void prepareSinglyList() {
    head = new Node(0);
    for (int i = 1; i < SIZE; i++) {
      head.addToEnd(i);
    }
    Node tmp = head;
    System.out.println("Original");
    for (int i = 0; i < SIZE; i++) {
      System.out.print(tmp.data + ", ");
      tmp = tmp.next;
    }
    System.out.println("");
  }
  
  private static int findNth(Node h, int pos) {
    int i = 0;
    Node node = h;
    Node target = h;
    for (; i < pos; i++) {
      node = node.next;
    }
    while (node != null) {
      node = node.next;
      target = target.next;
    }
    return target.data;
  }

}
