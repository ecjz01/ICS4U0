package Exercise1;

public class House {
    private int street_num;
    private String street;
    private String city;
    private String province;
    private String postal_code;
    private double size;
    private boolean detached;
    private int stories;

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

    public void displayAddress() {
        System.out.println(street_num + " " + street);
        System.out.println(city + ", " + province);
        System.out.println(postal_code);
    }

} // Exercise1.House class