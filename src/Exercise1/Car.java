package Exercise1;

/**
 * Enfei Zhang
 * Ms. Krasteva
 * February 12, 2018
 * This is a program that contains the default constructor and methods for Car objects
 *
 * Variable Dictionary
 * Name         Type       Purpose
 * brand        String     The brand of the car
 * model        String     The model of the car
 * kilometres   int        The distance that the car has driven
 * gas          double     The amount of gas in the car
 * tankCapacity double     The amount of gas the car can have at most
 */
public class Car {
    private String brand;
    private String model;
    private int kilometres;
    private double gas;
    private double tankCapacity;

    /**
     * This is the default constructor for Car objects
     * @param b The brand of the car
     * @param m The model of the car
     * @param g The amount of gas in the car
     * @param tCap  The amount of gas the car can have at most
     */
    public Car(String b, String m, double g, double tCap) {
        brand = b;
        model = m;
        kilometres = 0;
        gas = g;
        tankCapacity = tCap;
    }

    /**
     * This is a method for car objects to drive
     * @param distance  The distance that the car has travelled
     */
    public void drive(double distance) {
        kilometres += distance;
        gas -= distance / 5;
    }

    /**
     * This method is for filling up the cars gas to max
     */
    public void gasUp() {
        gas = tankCapacity;
    }

} // Car class