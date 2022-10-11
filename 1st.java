import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter text: ");
    String text = in.nextLine();

    int word_amount = text.split(" ").length;

    System.out.print("Enter symbol: ");
    String symbol = in.nextLine();

    if (symbol.length() != 1) {
      System.out.print("Invalid symbol, try again: ");
      symbol = in.nextLine().toLowerCase();
    }

    String new_text = text.replaceAll(symbol, "");

    System.out.println("There are " + word_amount + " words in this text");
    System.out.println("New text:");
    System.out.println(new_text);

    in.close();
  }
}
