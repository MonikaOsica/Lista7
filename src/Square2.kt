class Square2(override val name: String, var bok: Int): ShapeIF {

    override fun getPerimeter(): Double {
        var perimeter = 4 * bok
        return perimeter.toDouble()
    }

    override fun getArea(): Double {
        var area = bok * bok
        return area.toDouble()
    }
}