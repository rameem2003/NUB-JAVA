package LAB2;

class Calculator {

    // Method 1: Two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Task2 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 2.3));
    }
}
