package Question1_7;

public class SetElement {
  private final static int M = 10;
  private final static int N = 20;
  private static int[][] matrix = new int[M][N];

  /**
   * @param args
   */
  public static void main(String[] args) {
    prepareData(matrix);
    executeReSetElements(matrix);
  }
  
  public static void prepareData(int[][] m) {
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        m[i][j] = Math.random() > 0.1 ? 1 : 0;
      }
    }
    for (int pos = 0; pos < M; pos++) {
      System.out.print("[" + pos + "] : ");
      for (int point = 0 ; point < N; point++) {
        System.out.print(m[pos][point] + ", ");
      }
      System.out.println("");
    }
  }
  
  public static void executeReSetElements(int[][] m) {
    int[] row_check = new int[M];
    int[] column_check = new int[N];
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (m[i][j] == 0) {
          row_check[i] = 1;
          column_check[j] = 1;
        } else {
          row_check[i] = 0;
          column_check[j] = 0;
        }
      }
    }
    fillRowAndColumn(row_check, column_check, m);
    System.out.println("after");
    for (int pos = 0; pos < M; pos++) {
      System.out.print("[" + pos + "] : ");
      for (int point = 0 ; point < N; point++) {
        System.out.print(m[pos][point] + ", ");
      }
      System.out.println("");
    }
  }
  
  private static void fillRowAndColumn(int[] row, int[] column, int[][] matrix) {
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (row[i] == 1 || column[j] == 1) {
          matrix[i][j] = 0;
        }
      }
    }
  }

}
