/**
 * The StringReverser class is a class that will reverse a string
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @version 19.04.15
 * @author Enfei Zhang
 */

import java.util.Scanner;

public class StringReverser {

    /**
     * This method will reverse a string recursively
     * @param input The string to be reversed
     * @return The string in reverse order
     */
    public static String reverse(String input) {
        if (input.indexOf(" ") == input.length() - 1)
            return input;
        return reverse(input.substring(input.indexOf(" ") + 1)) + "\n" + input.substring(0, input.indexOf(" ") + 1);
    }

    /**
     * This method calls the reverse method and outputs what is returned
     * @param args [ ]  String array that allows command line parameters to be used when executing the program.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        while (!(input.contains("."))) {
            input = input + sc.next() + " ";
        }
        System.out.println(reverse(input));
    }
}
