import kotlin.math.sqrt

fun main() {

    val point1 = Point(3.0F, 4.0F)
    val point2 = Point(6.0F, 1.0F)
    println(point1.toString())
    println(point2.toString())
    println(point1.equals(point2))
    println(point1.movePoint())
    println(point2.movePoint())
    println(point1.calculateDistance(point2))

    val f1 = Fraction(2.0, 1.0)
    val f2 = Fraction(9.0, 5.0)
    println(f1.addition(f2))
    println(f2.subtraction(f2))
    println(f1.multiply(f2))
    println(f1.division(f2))
}


class Point(private var x:Float, private var y:Float){
    override fun toString(): String {
        return "$x, $y"
    }
    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (x * other.y / y == x) {
                return true
            }
        }
        return false
    }

    fun movePoint(): String {
        return "${-x}, ${-y}"
    }

    fun calculateDistance(other: Any?): Any {
        if (other is Point) {
            val z = ((x - other.x) * (x - other.x)) + ((y - other.y) * (y - other.y))
            val distance = sqrt(z)
            return "$distance"
        }
        return false
    }
}

class Fraction(m: Double, n: Double) {
    private var numerator: Double = m
    private var denominator: Double = n

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator / $denominator"
    }

    fun addition(other: Any?): Any {
        if (other is Fraction) {
            val newnum = denominator * other.denominator
            val newden =
                (newnum / denominator * numerator) - (newnum / other.denominator * other.numerator)
            val newfraction = Fraction(newnum, newden)
            return newfraction
        }
        return false
    }

    fun subtraction(other: Any?): Any? {
        if (other is Fraction) {
            val newnum = denominator * other.denominator
            val newden = (newnum / denominator * numerator) - (newnum / other.denominator * other.numerator)
            val newfraction = Fraction(newnum, newden)
            return newfraction
        }
        return false
    }

    fun multiply(other: Any?): Any? {
        if (other is Fraction) {
            val newnum = numerator * other.numerator
            val newden = denominator * other.denominator
            val newfraction = Fraction(newnum, newden)
            return newfraction
        }
        return false
    }

    fun division(other: Any?): Any {
        if(other is Fraction) {
            val newnum = numerator * other.denominator
            val newden = denominator * other.numerator
            val newfraction = Fraction(newnum, newden)
            return newfraction
        }
        return false
    }
}

