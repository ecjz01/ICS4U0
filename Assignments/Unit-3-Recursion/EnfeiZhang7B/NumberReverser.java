/**
 * The NumberReverser class is a class that will reverse a number
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @version 19.04.15
 * @author Enfei Zhang
 */

public class NumberReverser {

    /**
     * This is the method that recursively reverses the number
     * @param input the number that will be reveresed
     * @return the reversed number
     */
    public static int revDigits(int input) {
        if ((int)Math.log10(input) + 1 == 1)
            return input;
        return (int) ((input % 10) * Math.pow(10, (int) Math.log10(input))) + revDigits(input / 10);
    }

    /**
     * This method calls the revDigits method and outputs what is returned
     * @param args [ ]  String array that allows command line parameters to be used when executing the program.
     */
    public static void main(String[] args) {
        System.out.println(revDigits(123));
    }
}
