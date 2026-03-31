import java.util.Scanner;

// Abstract class
abstract class Shape {
    abstract double area();   // abstract method
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle input
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();

        Shape rect = new Rectangle(l, b);
        System.out.println("Area of Rectangle = " + rect.area());

        // Circle input
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        Shape circle = new Circle(r);
        System.out.println("Area of Circle = " + circle.area());
    }
}