package Question3_4;

public class HanoiMain {
  private static int NumberOfTower = 3;
  private static int NumberOfDisk = 5;

  /**
   * @param args
   */
  public static void main(String[] args) {
    TowerOfHanoi[] tower = new TowerOfHanoi[NumberOfTower];
    for (int i = 0; i < NumberOfTower; i++) {
      tower[i] = new TowerOfHanoi(i);
    }
    for (int i = NumberOfDisk - 1; i >= 0; i--) {
      tower[0].add(i);
    }
    tower[0].moveDisks(NumberOfDisk, tower[2], tower[1]);
  }

}
