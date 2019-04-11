import java.util.Scanner;

public class StringReverser {

    public static String reverse(String input) {
        if (input.length() <= 1)
            return input;
        return reverse(input.substring(1));
    }

    public static void main(String[] args) {
        String input;
        String temp = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string ending with a period.");
        input = in.next();
        for (int x = 0; x < input.length(); x++) {
            if (input.charAt(x) == '.')
                break;
            else
                temp = temp + input.charAt(x);
        }
        input = temp;
        System.out.println(reverse(input));
    }
}
