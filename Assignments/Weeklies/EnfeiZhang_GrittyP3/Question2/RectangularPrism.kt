/*Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is a subclass of the abstract class Solid
 */

class RectangularPrism(n: String, private val length: Double, private val height: Double, private val width: Double) : Solid(n) {

    override fun volume(): Double {
        return length * height * width
    }

    override fun surfaceArea(): Double {
        return 2 * (length * width) + 2 * (length * height) + 2 * (width * height)
    }

    override fun perimeter(): Double {
        return 4 * (length + width + height)
    }
}
