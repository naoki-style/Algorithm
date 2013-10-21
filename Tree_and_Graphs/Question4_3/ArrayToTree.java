package Question4_3;

public class ArrayToTree {
  private static int[] array;
  private final static int SIZE = 30;

  /**
   * @param args
   */
  public static void main(String[] args) {
    prepareArray();
    Node node = attachNode(array, 0, SIZE - 1);
    System.out.println("Left  : " + node.left.getHeight());
    System.out.println("Right : " + node.right.getHeight());
  }
  
  private static void prepareArray() {
    array = new int[SIZE];
    for (int i = 0; i < SIZE; i++) {
      array[i] = i;
    }
  }
  
  public static Node attachNode(int[] items, int start, int end) {
    if (start >= end) {
      return null;
    }
    Node node = new Node((start + end) / 2);
    node.left = attachNode(items, start, (start + end) / 2 - 1);
    node.right = attachNode(items, (start + end) / 2 + 1, end);
    return node;
  }

}
