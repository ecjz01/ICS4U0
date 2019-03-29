/*Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is the an abstract class for solids.
 */

abstract class Solid(val name: String) {

    abstract fun volume(): Double
    abstract fun perimeter(): Double
    abstract fun surfaceArea(): Double
}
