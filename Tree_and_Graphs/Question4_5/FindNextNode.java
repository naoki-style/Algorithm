package question4_5;

public class FindNextNode {
  private Node root;
  

  /**
   * @param args
   */
  public static void main(String[] args) {
    FindNextNode f = new FindNextNode();
    f.prepareTree();
    Node result = f.findNext(f.root.left.right);
    System.out.println("Input : " + f.root.left.right.getTag() + " Output : " + result.getTag());
    Node result2 = f.findNext(f.root);
    System.out.println("Input : " + f.root.getTag() + " Output : " + result2.getTag());
    Node result3 = f.findNext(f.root.left);
    System.out.println("Input : " + f.root.left.getTag() + " Output : " + result3.getTag());
    Node result4 = f.findNext(f.root.right);
    System.out.println("Input : " + f.root.right.getTag() + " Output : " + result4.getTag());
    Node result5 = f.findNext(f.root.left.left);
    System.out.println("Input : " + f.root.left.left.getTag() + " Output : " + result5.getTag());
  }
  
  public FindNextNode() {
    
  }
  
  public Node findNext(Node n) {
    if (n == null) {
      return null;
    }
    Node p;
    if (n.parent == null || n.right != null) {
      p = searchLeft(n.right);
    } else {
      while((p = n.parent) != null) {
        if (p.left == n) {
          break;
        }
        n = p;
      }
    }
    return p;
    
  }
  
  private Node searchLeft(Node n) {
    if (n == null) {
      return null;
    }
    while (n.left != null) {
      n = n.left;
    }
    return n;
  }
  
  private void prepareTree() {
    // Data
    Node top            = new Node(0, "leaf1");
    Node leaf1_1        = new Node(1, "leaf1_1");
    Node leaf1_2        = new Node(2, "leaf1_2");
    Node leaf1_1_1      = new Node(3, "leaf1_1_1");
    Node leaf1_1_2      = new Node(4, "leaf1_1_2");
    Node leaf1_2_1      = new Node(5, "leaf1_2_1");
    Node leaf1_2_2      = new Node(6, "leaf1_2_2");
    Node leaf1_1_1_1    = new Node(7, "leaf1_1_1_1");
    Node leaf1_1_1_2    = new Node(8, "leaf1_1_1_2");
    Node leaf1_1_2_1    = new Node(9, "leaf1_1_2_1");
    Node leaf1_1_2_2    = new Node(10, "leaf1_1_2_2");
    Node leaf1_2_1_1    = new Node(11, "leaf1_2_1_1");
    Node leaf1_2_1_2    = new Node(12, "leaf1_2_1_2");
    Node leaf1_2_2_1    = new Node(13, "leaf1_2_2_1");
    Node leaf1_2_2_2    = new Node(14, "leaf1_2_2_2");
    Node leaf1_1_1_1_1  = new Node(15, "leaf1_1_1_1_1");
    Node leaf1_1_1_1_2  = new Node(16, "leaf1_1_1_1_2");
    Node leaf1_1_1_2_1  = new Node(17, "leaf1_1_1_2_1");
    // Set
    top.setChild(leaf1_1, leaf1_2);
    leaf1_1.setChild(leaf1_1_1, leaf1_1_2);
    leaf1_2.setChild(leaf1_2_1, leaf1_2_2);
    leaf1_1_1.setChild(leaf1_1_1_1, leaf1_1_1_2);
    leaf1_1_2.setChild(leaf1_1_2_1, leaf1_1_2_2);
    leaf1_2_1.setChild(leaf1_2_1_1, leaf1_2_1_2);
    leaf1_2_2.setChild(leaf1_2_2_1, leaf1_2_2_2);
    leaf1_1_1_1.setChild(leaf1_1_1_1_1, leaf1_1_1_1_2);
    leaf1_1_1_2.setChild(leaf1_1_1_2_1, null);
    //prepare
    root = top;
  }
  

}
