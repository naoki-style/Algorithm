package question8_8;

import java.util.ArrayList;

public class LocateQueens {
  private static final int SIZE = 8;

  /**
   * @param args
   */
  public static void main(String[] args) {
    ArrayList<Integer[]> result = new ArrayList<Integer[]>();
    placeQueens(0, new Integer[SIZE], result);
    printResult(result);
  }
  
  private static void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> results) {
    if (row == SIZE) {
      results.add(columns.clone());
    } else {
      for (int i = 0; i < SIZE; i++) {
        if (checkValid(columns, row, i)) {
          columns[row] = i;
          placeQueens(row + 1, columns, results);
        }
      }
    }
  }
  
  private static boolean checkValid(Integer[] columns, int row, int column) {
    for (int r = 0; r < row; r++) {
      int c = columns[r];
      if (column == c) return false;
      int columnDistance = Math.abs(c - column);
      int rowDistance = row -r;
      if (columnDistance == rowDistance) return false;
    }
    return true;
  }
  
  private static void printResult(ArrayList<Integer[]> result) {
    for (int i = 0; i < result.size(); i++) {
      System.out.println("========");
      for (int j = 0; j < SIZE; j++) {
        Integer[] place = result.get(i);
        int pos = place[j];
        for (int k = 0; k < SIZE; k++) {
          if (k == pos) {
            System.out.print("x");
          } else {
            System.out.print("-");
          }
        }
        System.out.println();
      }
    }
  }

}
