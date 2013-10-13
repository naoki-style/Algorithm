package Question2_1;

public class ListItem {
  private int data;
  public ListItem() {
    data = (int) (Math.random() * 10);
  }
  public int getData() {
    return data;
  }
}
