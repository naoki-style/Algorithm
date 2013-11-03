package question4_6;

public class GetCommonAncestor {
  private Node root;
  private Node node1;
  private Node node2;

  /**
   * @param args
   */
  public static void main(String[] args) {
    GetCommonAncestor g = new GetCommonAncestor();
    g.prepareTree(10, 14);
    Node result = g.getFirstCommonAncestor(g.root, g.node1, g.node2);
    System.out.println("Common Ancestor : " + result.getTag() + " Child1 : " + g.node1.getTag() + " Child2 : " + g.node2.getTag());
  }
  
  public GetCommonAncestor() {
  }
  
  private Node getFirstCommonAncestor(Node root, Node item1, Node item2) {
    if (root == null) {
      return null;
    }
    if (checkChild(root.left, item1) && checkChild(root.left, item2)) {
      return getFirstCommonAncestor(root.left, item1, item2);
    }
    if (checkChild(root.right, item1) && checkChild(root.right, item2)) {
      return getFirstCommonAncestor(root.right, item1, item2);
    }
    return root;
  }
  
  private boolean checkChild(Node root, Node item) {
    if (root == null) {
      return false;
    }
    if (root == item) {
      return true;
    }
    return checkChild(root.left, item) || checkChild(root.right, item);
  }
  
  private void prepareTree(int item1, int item2) {
    int count = 0;
    Node nodes[] = new Node[18];
    // Data
    nodes[count]  = new Node(count++, "root");
    nodes[count]  = new Node(count++, "root_left");
    nodes[count]  = new Node(count++, "root_right");
    nodes[count]  = new Node(count++, "root_left_left");
    nodes[count]  = new Node(count++, "root_left_right");
    nodes[count]  = new Node(count++, "root_right_left");
    nodes[count]  = new Node(count++, "root_right_right");
    nodes[count]  = new Node(count++, "root_left_left_left");
    nodes[count]  = new Node(count++, "root_left_left_right");
    nodes[count]  = new Node(count++, "root_left_right_left");
    nodes[count]  = new Node(count++, "root_left_right_right");
    nodes[count]  = new Node(count++, "root_right_left_left");
    nodes[count]  = new Node(count++, "root_right_left_right");
    nodes[count]  = new Node(count++, "root_right_right_left");
    nodes[count]  = new Node(count++, "root_right_right_right");
    nodes[count]  = new Node(count++, "root_left_left_left_left");
    nodes[count]  = new Node(count++, "root_left_left_left_right");
    nodes[count]  = new Node(count++, "root_left_left_right_left");
    // Set
    nodes[0].setChild(nodes[1], nodes[2]);
    nodes[1].setChild(nodes[3], nodes[4]);
    nodes[2].setChild(nodes[5], nodes[6]);
    nodes[3].setChild(nodes[7], nodes[8]);
    nodes[4].setChild(nodes[9], nodes[10]);
    nodes[5].setChild(nodes[11], nodes[12]);
    nodes[6].setChild(nodes[13], nodes[14]);
    nodes[7].setChild(nodes[15], nodes[16]);
    nodes[8].setChild(nodes[17], null);
    //prepare
    root = nodes[0];
    node1 = nodes[item1];
    node2 = nodes[item2];
  }

}
