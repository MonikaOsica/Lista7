class Triangle2(override val name: String, var podstawa: Int, var wysokość: Int, var bok1: Int, var bok2: Int): ShapeIF{

        override fun getPerimeter(): Double {
            var perimeter = podstawa + bok1 + bok2
            return perimeter.toDouble()
        }

        override fun getArea(): Double {
            var area = podstawa * wysokość * 0.5
            return area.toDouble()
        }
}