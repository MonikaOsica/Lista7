class Triangle (name: String, var podstawa: Int, var wysokość: Int, var bok1: Int, var bok2: Int): Shape(name){

    override fun getPerimeter(): Double {
        var perimeter = podstawa + bok1 + bok2
        return perimeter.toDouble()
    }

    override fun getArea(): Double {
        var area = podstawa * wysokość * 0.5
        return area.toDouble()
    }

    override fun details(perimeter: Double, area: Double) {
        println("Obwód ${name} wynosi: ${perimeter}, a pole jest równe: ${area}")
    }
}