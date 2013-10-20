package Question4_1;

public class CheckBalanced {
  private static Node mBalancedRoot;
  private static Node mUnBalancedRoot;
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    prepareTree();
    boolean res = false;
    res = check(mBalancedRoot);
    System.out.println("Result of balanced tree is " + res);
    res = check(mUnBalancedRoot);
    System.out.println("Result of unbalanced tree is " + res);
  }
  
  private static void prepareTree() {
    /* 
     *                       0
     *            1                      2
     *      3           4          5           6
     *   7     8     9    10    11    12    13    14
     * 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
     */
    mBalancedRoot = new Node(0);
    for (int i = 1; i < 31; i++) {
      Node node = findNodeByValue(mBalancedRoot, (i - 1)/2);
      if ((i % 2) == 1) {
        node.left = new Node(i);
      } else {
        node.right = new Node(i);
      }
    }
    /* 
     *                       0
     *            1                      2
     *      3           4          5           6
     *   7     8     9    10
     * 15 16 17 18 19 20 21
     */
    mUnBalancedRoot = new Node(0);
    for (int i = 1; i < 31; i++) {
      if((i > 0 && i < 11) || (i > 14 && i < 22)) {
        Node node = findNodeByValue(mUnBalancedRoot, (i - 1)/2);
        if ((i % 2) == 1) {
          node.left = new Node(i);
        } else {
          node.right = new Node(i);
        }
      }
    }
    
  }
  
  private static Node findNodeByValue(Node r, int v) {
    if (r.getValue() == v) {
      return r;
    }
    if (r.left == null && r.right == null) {
      return null;
    } else if (r.left == null) {
      return findNodeByValue(r.right, v);
    } else if (r.right == null) {
      return findNodeByValue(r.left, v);
    } else {
      Node res = findNodeByValue(r.right, v);
      return (res == null) ? findNodeByValue(r.left, v) : res;
    }
  }
  
  public static boolean check(Node root) {
    int max = getMaxHeight(root);
    int min = getMinHeight(root);
    int diff = max - min;
    System.out.println("max height is " + max + ". min height is " + min + ".");
    if(diff <= 1) {
      return true;
    } else {
      return false;
    }
  }
  
  public static int getMaxHeight(Node root) {
    int height = 0;
    if (root == null) {
      return height;
    } else if (root.left == null && root.right == null) {
      height = 1;
      return height;
    } else {
      height = Math.max(getMaxHeight(root.left), getMaxHeight(root.right)) + 1;
    }
    return height;
  }
  
  public static int getMinHeight(Node root) {
    int height = 0;
    if (root == null) {
      return height;
    } else if (root.left == null || root.right == null) {
      height = 1;
      return height;
    } else {
      height = Math.min(getMinHeight(root.left), getMinHeight(root.right)) +1;
    }
    return height;
  }
  
}
