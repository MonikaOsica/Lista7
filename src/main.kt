fun main() {
    println("Zadnania 1-3:")
    var circle1 = Circle("Circle1", 2)
    circle1.details(circle1.getPerimeter(), circle1.getArea())

    var square1 = Square("Square1", 3)
    square1.details(square1.getPerimeter(), square1.getArea())

    var rectangle1 = Rectangle("Rectangle1", 2, 3 )
    rectangle1.details(rectangle1.getPerimeter(),rectangle1.getArea())

    var triangle1 = Triangle("Triangle1", 3, 4, 5, 2)
    triangle1.details(triangle1.getPerimeter(),triangle1.getArea())

    println("Zadanie 4:")
    var circle2 = Circle("Circle1", 6)
    circle2.details(circle2.getPerimeter(), circle2.getArea())

    var square2 = Square("Square1", 2)
    square2.details(square2.getPerimeter(), square2.getArea())

    var rectangle2 = Rectangle("Rectangle1", 7, 3 )
    rectangle2.details(rectangle2.getPerimeter(),rectangle2.getArea())

    var triangle2 = Triangle("Triangle1", 3, 4, 5, 6)
    triangle2.details(triangle2.getPerimeter(),triangle2.getArea())

}