abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class ShapeCalculator {
    void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("The area of the shape is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(6, 8);

        calculator.printArea(rectangle); // Prints: The area of the shape is: 20.0
        calculator.printArea(circle);    // Prints: The area of the shape is: 28.274333882308138
        calculator.printArea(triangle);  // Prints: The area of the shape is: 24.0
    }
}
