package question5_3;

public class GetNextNumber {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int input1 = 0b11011001111100;
    System.out.println("input : " + Integer.toBinaryString(input1));
    int next1 = getNext(input1);
    int previous1 = getPrevious(input1);
    System.out.println("Next : " + Integer.toBinaryString(next1) + ", Previous : " + Integer.toBinaryString(previous1));
    int input2 = 0b10011110000011;
    System.out.println("input : " + Integer.toBinaryString(input2));
    int next2 = getNext(input2);
    int previous2 = getPrevious(input2);
    System.out.println("Next : " + Integer.toBinaryString(next2) + ", Previous : " + Integer.toBinaryString(previous2));
  }
  /*
   * Step0 : 11011001111100
   * Step1 : 11011011111100
   * Step2 : 11011010000000
   * Step3 : 11011010001111
   */
  private static int getNext(int value) {
    if (value < 0) {
      return -1;
    }
    int res = -1;
    int pos = 0;
    int countOn = 0;
    
    while (!getBit(value, pos)) {
      pos++;
    }
    
    while (getBit(value, pos)) {
      pos++;
      countOn++;
    }
    // Step1
    res = setBit(value, pos);
    // Step2
    pos--;
    res = clrBit(res, pos);
    countOn--;
    for (int i = pos - 1; i >= countOn; i--) {
      res = clrBit(res, i);
    }
    // Step3
    for (int i = countOn - 1; i >= 0; i--) {
      res = setBit(res, i);
    }

    return res;
  }
  
  /*
   * Step0 : 10011110000011
   * Step1 : 10011100000000
   * Step2 : 10011101110000
   */
  private static int getPrevious(int value) {
    if (value < 0) {
      return -1;
    }
    
    int res = 0;
    int pos = 0;
    int countOff = 0;
    
    while (getBit(value, pos)) {
      pos++;
    }
    
    // Step1
    while (!getBit(value, pos)) {
      pos++;
      countOff++;
    }
    res = clrBit(value, pos);
    pos--;
    res = setBit(res, pos);
    countOff--;
    for (int i = pos - 1; i >= countOff; i--) {
      res = setBit(res, i);
    }
    
    // Step2
    for (int i = countOff - 1; i >= 0; i--) {
      res = clrBit(res, i);
    }
    return res;
  }
  
  private static boolean getBit(int value, int pos) {
    return ((value & (1 << pos)) > 0);
  }
  
  private static int setBit(int value, int pos) {
    value = value | (1 << pos);
    return value;
  }
  
  private static int clrBit(int value, int pos) {
    value = value & ~(1 << pos);
    return value;
  }
  
}
