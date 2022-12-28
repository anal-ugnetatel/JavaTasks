public class Main {
    public static void main(String[] args) {

        // Circle class test
        Circle circle = new Circle(3.6, "yellow", true);
        System.out.println(circle);

        // Rectangle class test
        Rectangle rectangle = new Rectangle(7.8 , 3.9, "black", true);
        System.out.println("area of rectangle: " + rectangle.getArea());
        System.out.println(rectangle);

        // Square class test
        Square square = new Square(5, "red", false);
        square.setSide(3);
        System.out.println(square);
    }
}
