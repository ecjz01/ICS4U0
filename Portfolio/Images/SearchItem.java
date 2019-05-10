/**
 * The SearchItem class is a class that will search an array for an item
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @version 19.04.15
 * @author Enfei Zhang
 */

import java.util.Arrays;

public class SearchItem {

    /**
     * This method searches through a Comparable list to find the Comparable item
     * @param list The list being searched through
     * @param item The item to be found
     * @return
     */
    public static boolean searchItem(Comparable[] list, Comparable item) {
        if (list.length <= 1)
            return false;
        if (list[list.length - 1].equals(item))
            return true;
        return searchItem(Arrays.copyOfRange(list, 0, list.length-1), item) ;
    }

    /**
     * This method creates a test list and item and calls the searchItem method and outputs what is returned
     * @param args [ ]  String array that allows command line parameters to be used when executing the program.
     */
    public static void main(String[] args) {
        Integer[] test = {1, 2, 3, 4, 5};
        int test2 = 0;
        System.out.println(searchItem(test, test2));
    }
}
