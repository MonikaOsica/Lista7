class Rectangle(name: String, var bok1: Int, var bok2: Int): Shape(name) {

    override fun getPerimeter(): Double {
        var perimeter = 2 * bok1 + 2 * bok2
        return perimeter.toDouble()
    }

    override fun getArea(): Double {
        var area = bok1 * bok2
        return area.toDouble()
    }

    override fun details(perimeter: Double, area: Double) {
        println("Obwód ${name} wynosi: ${perimeter}, a pole jest równe: ${area}")
    }
}