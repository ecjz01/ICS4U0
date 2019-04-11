/**Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is a subclass of the abstract class solids.
 */


public class Sphere extends Solid{

    private double radius;
    private final double pi = Math.PI;

    public Sphere (String n, double r){
        super (n);
        radius = r;
    }

    @Override
    public double volume (){
        return (4/3)*pi*Math.pow(radius, 3);
    }

    @Override
    public double surfaceArea(){
        return 4*pi*Math.pow(radius, 2);
    }

    @Override
    public double perimeter(){
        return 2*pi*radius;
    }
}
