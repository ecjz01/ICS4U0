/**Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is the an abstract class for solids.
 */

public abstract class Solid {

    private String name;

    public Solid (String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public abstract double volume();
    public abstract double perimeter();
    public abstract double surfaceArea();
}