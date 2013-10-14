package Question3_4;

import java.util.Stack;

public class TowerOfHanoi {
  private Stack<Integer> disks;
  private int index;

  public TowerOfHanoi() {
    disks = new Stack<Integer>();
    index = 0;
  }
  public TowerOfHanoi(int i) {
    disks = new Stack<Integer>();
    index = i;
  }
  
  public int getIndex() {
    return index;
  }
  
  public boolean add(int value) {
    if (!disks.isEmpty() && disks.peek() <= value) {
      return false;
    } else {
      disks.push(value);
      return true;
    }
  }
  
  public void moveFrom(TowerOfHanoi t) {
    int value = disks.pop();
    t.add(value);
  }
  
  public void moveDisks(int height, TowerOfHanoi destination, TowerOfHanoi temporary) {
    if (height > 0) {
      moveDisks(height - 1, temporary, destination);
      printCurrent(this, destination, temporary);
      moveFrom(destination);
      printCurrent(this, destination, temporary);
      temporary.moveDisks(height - 1, destination, this);
    }
  }
  
  private void printCurrent(TowerOfHanoi t0, TowerOfHanoi t1, TowerOfHanoi t2) {
    System.out.println("-- Current --");
    TowerOfHanoi[] temp = new TowerOfHanoi[3];
    temp[t0.index] = t0;
    temp[t1.index] = t1;
    temp[t2.index] = t2;
    System.out.print("Tower0 : ");
    for (int i = 0; i < temp[t0.index].disks.size(); i++) {
      System.out.print(temp[t0.index].disks.get(i) + ", ");
    }
    System.out.println("");
    System.out.print("Tower1 : ");
    for (int i = 0; i < temp[t1.index].disks.size(); i++) {
      System.out.print(temp[t1.index].disks.get(i) + ", ");
    }
    System.out.println("");
    System.out.print("Tower2 : ");
    for (int i = 0; i < temp[t2.index].disks.size(); i++) {
      System.out.print(temp[t2.index].disks.get(i) + ", ");
    }
    System.out.println("");
  }

}
