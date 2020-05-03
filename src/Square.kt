class Square(name: String, var bok: Int): Shape(name){

    override fun getPerimeter(): Double {
        var perimeter = 4 * bok
        return perimeter.toDouble()
    }

    override fun getArea(): Double {
        var area = bok * bok
        return area.toDouble()
    }

    override fun details(perimeter: Double, area: Double) {
        println("Obwód ${name} wynosi: ${perimeter}, a pole jest równe: ${area}")
    }
}