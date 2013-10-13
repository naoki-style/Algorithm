package Question2_1;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
  private static List<ListItem> mList;
  private final static int mSize = 20;

  /**
   * @param args
   */
  public static void main(String[] args) {
    mList = new ArrayList<ListItem>();
    prepareList(mList);
    removeDuplicate(mList);
  }
  
  public static void prepareList(List<ListItem> list) {
    System.out.println("generated list:");
    for (int i = 0; i < mSize; i++) {
      list.add(new ListItem());
      System.out.print(list.get(i).getData() + ", ");
    }
    System.out.println("");
  }
  
  private static void removeDuplicate(List<ListItem> list) {
    for (int i = 0; i < list.size() - 1 && list.get(i) != null; i++) {
      ListItem item = list.get(i);
      for (int j = i + 1; j < list.size() && list.get(j) != null; j++) {
        if (item.getData() == list.get(j).getData()) {
          list.remove(j);
        }
      }
    }
    System.out.println("after:");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i).getData() + ", ");
    }
    System.out.println("");
  }
  
}
