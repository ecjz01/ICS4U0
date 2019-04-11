/**Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is a subclass of the abstract class Solid
 */


public class RectangularPrism extends Solid{

    private double length;
    private double height;
    private double width;

    public RectangularPrism (String n, double l, double h, double w){
        super(n);
        length = l;
        height = h;
        width = w;
    }

    @Override
    public double volume(){
        return length*height*width;
    }

    @Override
    public double surfaceArea(){
        return 2*(length*width)+2*(length*height)+2*(width*height);
    }

    @Override
    public double perimeter() {
        return 4*(length+width+height);
    }
}
