package LAB2;

class Box {

    // Method 1: Cube (only one parameter)
    double volume(double side) {
        return side * side * side;
    }

    // Method 2: Box with length and breadth (height assumed 1)
    double volume(double length, double breadth) {
        return length * breadth * 1;
    }

    // Method 3: Rectangular box (length, breadth, height)
    double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }
}

public class Task3 {
    public static void main(String[] args) {

        Box box = new Box();

        System.out.println("Volume of Cube: " + box.volume(5));
        System.out.println("Volume of 2D Box (height=1): " + box.volume(5, 4));
        System.out.println("Volume of Rectangular Box: " + box.volume(5, 4, 3));
    }
}
