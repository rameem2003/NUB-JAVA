package Assignment;

import java.util.Scanner;

/**
 * Write a Java program which can run two thread simultaneously. One thread will
 * calculate
 * the factorial of a number and another thread the factors of that number. Make
 * sure main
 * thread finishes last.
 */

class FactorialThread extends Thread {
    private int number;

    public FactorialThread(int number) {
        this.number = number;
    }

    public void run() {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " = " + factorial);
    }
}

class FactorsThread extends Thread {
    private int number;

    public FactorsThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.print("Factors of " + number + " = ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class AssignmentOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        FactorialThread t1 = new FactorialThread(num);
        FactorsThread t2 = new FactorsThread(num);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }

        // This will execute LAST
        System.out.println("Main thread finished.");
    }
}
