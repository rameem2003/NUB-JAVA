package LAB2;

class Rectangle {

    double length;
    double breadth;

    // Constructor 1: No parameters (Default rectangle)
    Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Constructor 2: One parameter (Square)
    Rectangle(double side) {
        length = side;
        breadth = side;
    }

    // Constructor 3: Two parameters (Rectangle)
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    double area() {
        return length * breadth;
    }

    // Method to display details
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area());
        System.out.println("---------------------");
    }
}

public class Task5 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(); // Default constructor
        Rectangle r2 = new Rectangle(5); // Square
        Rectangle r3 = new Rectangle(5, 3); // Rectangle

        r1.display();
        r2.display();
        r3.display();
    }
}
