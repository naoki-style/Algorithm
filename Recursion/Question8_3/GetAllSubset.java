package question8_3;

import java.util.ArrayList;

public class GetAllSubset {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ArrayList<Integer> numbers2 = prepareList(2);
    ArrayList<ArrayList<Integer>> result2 = getSubsetArray(numbers2, numbers2.size());
    printAll(result2);
    System.out.println();
    ArrayList<Integer> numbers3 = prepareList(3);
    ArrayList<ArrayList<Integer>> result3 = getSubsetArray(numbers3, numbers3.size());
    printAll(result3);
    System.out.println();
    ArrayList<Integer> numbers = prepareList(5);
    ArrayList<ArrayList<Integer>> result = getSubsetArray(numbers, numbers.size());
    printAll(result);
  }
  
  private static ArrayList<Integer> prepareList(int size) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    for (int i = 0; i < size; i++) {
      result.add(i);
    }
    return result;
  }
  
  private static ArrayList<ArrayList<Integer>> getSubsetArray(ArrayList<Integer> list, int maxIndex) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    if (maxIndex == 1) {
      ArrayList<Integer> tmp = new ArrayList<Integer>();
      tmp.add(list.get(maxIndex - 1));
      result.add(tmp);
    } else {
      ArrayList<ArrayList<Integer>> tempList = getSubsetArray(list, maxIndex - 1);
      for (int i = 0; i < tempList.size(); i++) {
        result.add(tempList.get(i));
      }
      ArrayList<Integer> newList = new ArrayList<Integer>();
      newList.add(list.get(maxIndex - 1));
      result.add(newList);
      for (int i = 0; i < tempList.size(); i++) {
        ArrayList<Integer> newList2 = (ArrayList<Integer>) tempList.get(i).clone();
        newList2.add(list.get(maxIndex - 1));
        result.add(newList2);
      }
    }
    return result;
  }
  
  private static void printAll(ArrayList<ArrayList<Integer>> list) {
    for (int i = 0; i < list.size(); i++) {
      ArrayList<Integer> comb = list.get(i);
      for (Integer number : comb) {
        System.out.print(number + ", ");
      }
      System.out.println();
    }
  }

}
