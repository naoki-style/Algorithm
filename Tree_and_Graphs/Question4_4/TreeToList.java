package Question4_4;

import java.util.ArrayList;
import java.util.List;

public class TreeToList {
  private Node root;

  /**
   * @param args
   */
  public static void main(String[] args) {
    TreeToList tl = new TreeToList();
    tl.prepareTree();
    List<List<Node>> result = tl.getResult();
    tl.printResult(result);
  }
  
  TreeToList() {
    
  }
  
  public List<List<Node>> getResult() {
    List<List<Node>> result = new ArrayList<List<Node>>();
    for (int i = 0; i < root.getHeight(); i++) {
      result.add(getNodesOnDepth(i));
    }
    return result;
  }
  
  public List<Node> getNodesOnDepth(int depth) {
    List<Node> result = new ArrayList<Node>();
    if (depth == 0) {
      result.add(root);
    } else if (depth == 1) {
      result.add(root.left);
      result.add(root.right);
    } else {
      List<Node> parentList = getNodesOnDepth(depth - 1);
      for (int i = 0; i < parentList.size(); i++) {
        Node l = parentList.get(i).left;
        Node r = parentList.get(i).right;
        if (l != null) {
          result.add(l);
        }
        if (r != null) {
          result.add(r);
        }
      }
    }
    return result;
  }
  
  public Node getRoot() {
    return root;
  }
  
  private void printResult(List<List<Node>> list) {
    for (int i = 0; i < list.size(); i++) {
      List<Node> items = list.get(i);
      for (int j = 0; j < items.size(); j++) {
        System.out.print(items.get(j).getTag() + " ");
      }
      System.out.println();
    }
  }
  

  private void prepareTree() {
    // Data
    Node top            = new Node(0, "node0");
    Node leaf1_1        = new Node(1, "leaf1_1");
    Node leaf1_2        = new Node(2, "leaf1_2");
    Node leaf2_1        = new Node(3, "leaf2_1");
    Node leaf2_2        = new Node(4, "leaf2_2");
    Node leaf2_3        = new Node(5, "leaf2_3");
    Node leaf2_4        = new Node(6, "leaf2_4");
    Node leaf3_1        = new Node(7, "leaf3_1");
    Node leaf3_2        = new Node(8, "leaf3_2");
    Node leaf3_3        = new Node(9, "leaf3_3");
    Node leaf3_4        = new Node(10, "leaf3_4");
    Node leaf3_5        = new Node(11, "leaf3_5");
    Node leaf3_6        = new Node(12, "leaf3_6");
    Node leaf3_7        = new Node(13, "leaf3_7");
    Node leaf3_8        = new Node(14, "leaf3_8");
    Node leaf4_1        = new Node(15, "leaf4_1");
    Node leaf4_2        = new Node(16, "leaf4_2");
    Node leaf4_3        = new Node(17, "leaf4_3");
    // Set
    top.setChild(leaf1_1, leaf1_2);
    leaf1_1.setChild(leaf2_1, leaf2_2);
    leaf1_2.setChild(leaf2_3, leaf2_4);
    leaf2_1.setChild(leaf3_1, leaf3_2);
    leaf2_2.setChild(leaf3_3, leaf3_4);
    leaf2_3.setChild(leaf3_5, leaf3_6);
    leaf2_4.setChild(leaf3_7, leaf3_8);
    leaf3_1.setChild(leaf4_1, leaf4_2);
    leaf3_2.setChild(leaf4_3, null);
    //prepare
    root = top;
  }
  
}
