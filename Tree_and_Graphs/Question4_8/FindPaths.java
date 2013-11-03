package question4_8;

import java.util.ArrayList;

public class FindPaths {
  private Node root;
  private int sum;

  /**
   * @param args
   */
  public static void main(String[] args) {
    FindPaths fp = new FindPaths();
    fp.prepareTree(5);
    fp.findFrom(fp.root, fp.sum, new ArrayList<Integer>(), 0);
  }
  
  public FindPaths() {
    
  }
  
  private boolean findFrom(Node r, int sum, ArrayList<Integer> paths, int depth) {
    boolean res = false;
    if (r == null) {
      return res;
    }
    int localSum = 0;
    paths.add(r.getValue());
    for (int i = depth; i >= 0; i--) {
      localSum += paths.get(i);
      if (localSum == sum) {
        printPaths(paths, i);
        res = true;
      }
    }
    ArrayList<Integer> temp1 = (ArrayList<Integer>)paths.clone();
    ArrayList<Integer> temp2 = (ArrayList<Integer>)paths.clone();
    findFrom(r.left, sum, temp1, depth + 1);
    findFrom(r.right, sum, temp2, depth + 1);
    return res;
  }
  
  private void printPaths(ArrayList<Integer> path, int current) {
    for (int i = current; i < path.size(); i++) {
      System.out.print(path.get(i) + " ");
    }
    System.out.println("");
  }

  private void prepareTree(int s) {
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
    sum = s;
  }
}
