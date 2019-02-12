package Exercise1;

/**
 * Enfei Zhang
 * Ms. Krasteva
 * February 12, 2018
 * This is a program that contains the default constructor and methods for House objects
 *
 * Variable Dictionary
 * Name         Type       Purpose
 * street_num   int        The street number of the house
 * street       String     The street name of the house
 * city         String     The the city of the house
 * province     String     The province of the house
 * postal_code  String     The postal code of the house
 * size         double     The size of the house
 * detached     boolean    If the house is detached or not
 * stories      int        The amount of stories in the house
 */
public class House {
    private int street_num;
    private String street;
    private String city;
    private String province;
    private String postal_code;
    private double size;
    private boolean detached;
    private int stories;

    /**
     * This is the default constructor for House objects
     * @param n The street number
     * @param s The street name
     * @param c The city of the house
     * @param pv The province of the house
     * @param p The postal code of the house
     * @param si The size of the house
     * @param d If the house is detached or not
     * @param l The amount of stories in the house
     */
    public House(int n, String s, String c, String pv, String p, double si, boolean d, int l) {
        street_num = n;
        street = s;
        city = c;
        province = pv;
        postal_code = p;
        size = si;
        detached = d;
        stories = l;
    }

    /**
     * This is a method that displays all the information about the house
     */
    public void displayAddress() {
        System.out.println(street_num + " " + street);
        System.out.println(city + ", " + province);
        System.out.println(postal_code);
    }

} // Exercise1.House class