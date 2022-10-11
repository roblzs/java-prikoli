import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the length of array: ");

    int arr_len = 0;

    String nStr = in.next();

    boolean valid = false;

    while (!valid) {
      try {
        arr_len = Integer.parseInt(nStr);

        if (arr_len > 0) {
          valid = true;
        } else {
          System.out.print("Invalid array length, please enter again: ");
          nStr = in.next();
        }
      } catch (NumberFormatException e) {
        System.out.print("Invalid array length, please enter again: ");
        nStr = in.next();
      }
    }

    ArrayList<Integer> arr = new ArrayList<Integer>();

    for (int i = 0; i < arr_len; i++) {
      int random = ThreadLocalRandom.current().nextInt(-100, 100 + 1);

      arr.add(random);
    }
  }
}
