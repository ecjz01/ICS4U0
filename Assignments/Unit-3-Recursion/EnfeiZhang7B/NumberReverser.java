public class NumberReverser {
    public static int revDigits(int input) {
        if ((int)Math.log10(input) + 1 == 1)
            return input;
        return (int) ((input % 10) * Math.pow(10, (int) Math.log10(input) + 1)) + revDigits(input / 10);
    }

    public static void main(String[] args) {
        System.out.println(revDigits(123));
    }
}
