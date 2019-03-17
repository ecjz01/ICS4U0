/*Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is a program that will return a number between 50 and 100
 */

public class FiftyToOneHundred {
    public static void main(String[] args) {
        System.out.println((Math.random() * 51) + 50);  //Outputs a double
        System.out.println((int)(Math.random() * 51) + 50); //Outputs an integer
    }
}
