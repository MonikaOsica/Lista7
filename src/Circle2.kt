class Circle2(override  val name: String, val radius: Int): ShapeIF {

    override fun getPerimeter(): Double {
        var perimeter = 2 * 3.14 * radius
        return perimeter.toDouble()
    }

    override fun getArea(): Double {
        var area = 3.14 * (radius * radius)
        return area.toDouble()
    }
}