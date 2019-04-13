import java.util.Scanner;

public class StringReverser {

    public static String reverse(String input) {
        if (input.indexOf(" ") == input.length() - 1)
            return input;
        return reverse(input.substring(input.indexOf(" ") + 1)) + "\n" + input.substring(0, input.indexOf(" ") + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        while (!(input.contains("."))) {
            input = input + sc.next() + " ";
        }
        System.out.println(reverse(input));
    }
}
