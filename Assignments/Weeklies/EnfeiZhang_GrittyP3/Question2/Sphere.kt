/*Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is a subclass of the abstract class solids.
 */

class Sphere(n: String, private val radius: Double) : Solid(n) {
    private val pi = Math.PI

    override fun volume(): Double {
        return (4 / 3).toDouble() * pi * Math.pow(radius, 3.0)
    }

    override fun surfaceArea(): Double {
        return 4.0 * pi * Math.pow(radius, 2.0)
    }

    override fun perimeter(): Double {
        return 2.0 * pi * radius
    }
}
