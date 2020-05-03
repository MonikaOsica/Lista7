interface ShapeIF {
    val name: String

    fun getPerimeter(): Double

    fun getArea(): Double

    fun details(perimeter: Double, area: Double) {
        println("Obwód ${name} wynosi: ${perimeter}, a pole jest równe: ${area}")
    }
}