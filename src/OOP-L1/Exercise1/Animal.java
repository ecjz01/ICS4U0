/**
 * Enfei Zhang
 * Ms. Krasteva
 * February 12, 2018
 * This is a program that contains the default constructor and methods for the Animal object
 *
 * Variable Dictionary
 * Name      Type       Purpose
 * name      String     The name of the animal
 * tired     boolean    If the animal is tired or not
 * hungry    boolean    If the animal is hungry or not
 * weight    double     The weight of the animal
 */
public class Animal {
    private String name;
    private boolean tired;
    private boolean hungry;
    private double weight;

    /**
     * This is the default constructor for an Animal object
     * @param n is the name of the animal
     * @param w is the weight of the animal
     */
    public Animal(String n, double w) {
        name = n;
        tired = true;
        hungry = true;
        weight = w;
    }

    /**
     * This is a method to feed the animal (Setting hunger to false and adding weight to the animal)
     * @param v is the type of food
     *
     * If statement checks for what kind of food is inputted
     */
    public void feed(String v) {
        hungry = false;
        if (v.equals("vegetables"))
            weight += 2;
        else if (v.equals("meat"))
            weight += 4;
        else
            weight += 1;
    }

    /**
     * This is a method that allows the animal to sleep (Setting tired to false and decreasing the weight of the animal)
     */
    public void sleep() {
        tired = false;
        weight -= 3;
    }

} // Animal class