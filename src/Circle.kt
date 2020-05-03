class Circle(name: String, val radius: Int): Shape(name) {

    override fun getPerimeter(): Double {
        var perimeter = 2 * 3.14 * radius
        return perimeter.toDouble()
    }

    override fun getArea(): Double {
        var area = 3.14 * (radius * radius)
        return area.toDouble()
    }

    override fun details(perimeter: Double, area: Double) {
        println("Obwód ${name} wynosi: ${perimeter}, a pole jest równe: ${area}")
    }
}