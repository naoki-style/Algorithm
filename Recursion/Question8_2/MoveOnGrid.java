package question8_2;

public class MoveOnGrid {
  private int N = 0;
  private int goal_x = 0;
  private int goal_y = 0;

  /**
   * @param args
   */
  public static void main(String[] args) {
    MoveOnGrid mg2 = new MoveOnGrid(1, 1, 0);
    int result2 = mg2.getPossibleCount(0, 1);
    System.out.println("Result (2x2) : " + result2);
    MoveOnGrid mg3 = new MoveOnGrid(2, 2, 0);
    int result3 = mg3.getPossibleCount(0, 2);
    System.out.println("Result (3x3) : " + result3);
  }
  
  public MoveOnGrid(int n, int x, int y) {
    N = n;
    goal_x = x;
    goal_y = y;
  }

  private int getPossibleCount(int x, int y) {
    if(0 > x && x > N) {
      return 0;
    }
    if(0 > y && y > N) {
      return 0;
    }
    if (x == goal_x) {
      return 1;
    } else if (y == goal_y) {
      return 1;
    }
    return getPossibleCount(x + 1, y) + getPossibleCount(x, y - 1);
  }

}
