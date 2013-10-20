package Question4_2;

public class Node {
  private int value;
  public Node[] leaf;
  private final int MAX_LEAF = 30;
  private int leafCount = 0;
  public State state = State.Unvisited;
  
  public enum State {
    Unvisited, Visiting, Visited;
  }
  
  public Node() {
    value = 0;
    leaf = new Node[MAX_LEAF];
  }
  
  public Node(int v) {
    value = v;
    leaf = new Node[MAX_LEAF];
  }
  
  public int getValue() {
    return value;
  }
  
  public void addLeaf(Node n) {
    leaf[leafCount++] = n;
  }
  
  public Node[] getLeaf() {
    return leaf;
  }
  
  public int getLeafCount() {
    return leafCount;
  }
  
  public void setState(State s) {
    state = s;
  }
  public State getState() {
    return state;
  }

}
