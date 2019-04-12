import java.lang.reflect.Type;

public class SearchItem {
    public static boolean searchItem(Comparable[] list, Comparable item) {
        if (list[0].equals(item))
            return true;
        System.arraycopy(list, 1, list, list.length - 1, list.length - 1);
        return searchItem(list, item);
    }

    public static void main(String[] args) {
        Comparable[] test = {1, 2, 3, 4, 5};
        int test2 = 3;
        System.out.println(searchItem(test, test2));
    }
}
