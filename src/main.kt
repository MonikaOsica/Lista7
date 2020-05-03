fun main() {
    var circle1 = Circle("Circle1", 2)
    circle1.details(circle1.getPerimeter(), circle1.getArea())

    var square1 = Square("Square1", 3)
    square1.details(square1.getPerimeter(), square1.getArea())

    var rectangle1 = Rectangle("Rectangle1", 2, 3 )
    rectangle1.details(rectangle1.getPerimeter(),rectangle1.getArea())

    var triangle1 = Triangle("Triangle1", 3, 4, 5, 2)
    triangle1.details(triangle1.getPerimeter(),triangle1.getArea())

}