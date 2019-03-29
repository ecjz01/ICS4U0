/*Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is a program that will return a number between 50 and 100
 */

object FiveHundredToSixHundred {
    @JvmStatic
    fun main(args: Array<String>) {
        println(Math.random() * 101 + 500)    //Outputs a double
        println((Math.random() * 101).toInt() + 500)   //Outputs an integer
    }
}
