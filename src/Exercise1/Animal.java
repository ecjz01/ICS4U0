package Exercise1;

public class Animal {
    private String name;    //Variable for the name of the animal
    private boolean tired;  //Variable for if the animal is tired or not
    private boolean hungry; //Variable for if the animal is hungry or not
    private double weight;  //Variable for the weight of the animal

    public Animal(String n, double w) {
        name = n;
        tired = true;
        hungry = true;
        weight = w;
    }

    public void feed(String v) {
        hungry = false;
        if (v.equals("vegetables"))
            weight += 2;
        else if (v.equals("meat"))
            weight += 4;
        else
            weight += 1;
    }

    public void sleep() {
        tired = false;
        weight -= 3;
    }

} // Exercise1.Animal class