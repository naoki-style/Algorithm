package Question4_2;

import java.util.concurrent.ConcurrentLinkedQueue;

import Question4_2.Node.State;

public class IsRouteExist {
  private static Node[] graph;

  /**
   * @param args
   */
  public static void main(String[] args) {
    prepareGraph();
    boolean res = isRootExist(graph[0], graph[8]);
    System.out.println("Result is " + res + ".");
  }
  
  private static void prepareGraph() {
    int count = 30;
    graph = new Node[count];
    Node[] temp = new Node[count];
    for (int i = 0; i < count; i++) {
      temp[i] = new Node(i);
    }
    for (int i = 0; i < count; i++) {
      int a, b;
      a = (int)(Math.random() * count);
      b = (int)(Math.random() * count);
      if (a != i) {
        temp[i].addLeaf(temp[a]);
      }
      if (b != i) {
        temp[i].addLeaf(temp[b]);
      }
      graph[i] = temp[i];
    }
  }
  
  public static boolean isRootExist(Node from, Node to) {
    boolean res = false;
    setAllNodesUnvisited();
    res = searchRoute(from, to);
    return res;
  }
  
  private static void setAllNodesUnvisited() {
    for (Node n : graph) {
      n.setState(State.Unvisited);
    }
  }
  
  private static boolean searchRoute(Node from, Node to) {
    boolean res = false;
    ConcurrentLinkedQueue<Node> queue = new ConcurrentLinkedQueue<Node>();
    from.setState(State.Visiting);
    queue.add(from);
    Node n;
    while(!queue.isEmpty()) {
      n = queue.remove();
      if (n != null) {
        for (Node u : n.getLeaf()) {
          if (u == to) {
            return true;
          } else if (u != null){
            u.setState(State.Visiting);
            queue.add(u);
          }
        }
      }
      n.setState(State.Visited);
    }
    return res;
  }

}
