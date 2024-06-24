
@FunctionalInterface
interface Shape {
    double calculateArea();
}

public class eMainShapeAreaCal {
    public static void main(String[] args) {
        // Circle with radius 5
        Shape circle = () -> {
            double radius = 5;
            return Math.PI * Math.pow(radius, 2);
        };

        // Rectangle with length 10 and width 5
        Shape rectangle = () -> {
            double length = 10;
            double width = 5;
            return length * width;
        };

        // Triangle with base 8 and height 5
        Shape triangle = () -> {
            double base = 8;
            double height = 5;
            return 0.5 * base * height;
        };

        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
    }
}
