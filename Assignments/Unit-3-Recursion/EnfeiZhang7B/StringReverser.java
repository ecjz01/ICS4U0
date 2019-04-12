import java.util.Scanner;

public class StringReverser {

    public static String reverse(String input) {
        if (input.length() <= 1)
            return input;
        return reverse(input.substring(1));
    }

    public static void main(String[] args) {

    }
}
