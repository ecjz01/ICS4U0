import java.util.Arrays;

public class SearchItem {
    public static boolean searchItem(Comparable[] list, Comparable item) {
        if (list.length <= 1)
            return false;
        if (list[list.length - 1].equals(item))
            return true;
        return searchItem(Arrays.copyOf(list, list.length-1), item) ;
    }

    public static void main(String[] args) {
        Comparable[] test = {1, 2, 3, 4, 5};
        int test2 = 0;
        System.out.println(searchItem(test, test2));
    }
}
