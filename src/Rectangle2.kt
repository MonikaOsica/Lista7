class Rectangle2(override val name: String, var bok1: Int, var bok2: Int): ShapeIF {

    override fun getPerimeter(): Double {
        var perimeter = 2 * bok1 + 2 * bok2
        return perimeter.toDouble()
    }

    override fun getArea(): Double {
        var area = bok1 * bok2
        return area.toDouble()
    }
}