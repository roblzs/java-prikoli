import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Second {

  public static void printArr(ArrayList<Integer> arr) {
    System.out.println("Generated array: ");
    System.out.println(arr);

    ArrayList<Integer> newArr = arr;

    int min_index = 0;
    int min_int = arr.get(0);

    for (int i = 0; i < arr.size(); i++) {
      int el = arr.get(i);

      if (el < min_int) {
        min_index = i;
        min_int = el;
      }
    }

    int mid_index;

    if (arr.size() % 2 == 0) {
      mid_index = arr.size() / 2;
    } else {
      mid_index = Math.round(arr.size() / 2) + 1;
    }

    int mid_el = arr.get(mid_index);
    int min_el = arr.get(min_index);

    System.out.println("Middle element: " + mid_el);
    System.out.println("Smallest element: " + min_el);

    newArr.set(mid_index, min_el);
    newArr.set(min_index, mid_el);

    System.out.println("New array: ");
    System.out.println(newArr);
  }

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

    printArr(arr);
  }
}
