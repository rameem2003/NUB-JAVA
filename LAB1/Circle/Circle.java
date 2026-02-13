package Circle;

public class Circle {

    // Instance variables
    double centerX;
    double centerY;
    double radius;

    // Constructor to initialize variables
    Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    // Method to display circle details
    void display() {
        System.out.println("Center: (" + centerX + ", " + centerY + ")");
        System.out.println("Radius: " + radius);
    }

    // Main method
    public static void main(String[] args) {
        Circle c = new Circle(2.5, 4.0, 7.0);
        c.display();
    }
}

