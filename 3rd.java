import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Sus {

  public static Scanner in = new Scanner(System.in);

  public static void fun(ArrayList<ArrayList<Integer>> arr) {
    ArrayList<Integer> vals = new ArrayList<Integer>();

    System.out.println("Array: ");

    for (int i = 0; i < arr.size(); i++) {
      ArrayList<Integer> row = arr.get(i);

      System.out.println(row);

      for (int j = 0; j < row.size(); j++) {
        int val = row.get(j);

        if (j == 0) {
          vals.add(val);
        } else {
          if (val < vals.get(i)) {
            vals.set(i, val);
          }
        }
      }
    }

    for (int i = 0; i < vals.size(); i++) {
      System.out.println(i + 1 + ". row min: " + vals.get(i));
    }
  }

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

    System.out.println("Do you want to enter array?");
    System.out.println("a - yes");
    System.out.println("b - no");

    String choice = in.nextLine();

    if (choice.toLowerCase().equals("a")) {
      for (int i = 0; i < 5; i++) {
        ArrayList<Integer> row = new ArrayList<Integer>();

        for (int j = 0; j < 5; j++) {
          System.out.print("Enter (" + i + ";" + j + ") element: ");
          String nStr = in.next();
          int el = Integer.parseInt(nStr);

          row.add(el);
        }

        arr.add(row);
      }
    } else {
      for (int i = 0; i < 5; i++) {
        ArrayList<Integer> row = new ArrayList<Integer>();

        for (int j = 0; j < 5; j++) {
          int random = ThreadLocalRandom.current().nextInt(-100, 100 + 1);

          row.add(random);
        }

        arr.add(row);
      }
    }

    fun(arr);

    in.close();
  }
}
