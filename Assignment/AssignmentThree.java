package Assignment;

/**
 * Suppose you have a character array that contains X's and O's, and you want to
 * rearrange
 * the contents of this array so that all the X's precede all the O's, as shown
 * in the example
 * below. Write your design method based on multithreaded programming and then
 * write
 * your code to implement your idea to solve the problem.
 */

class CountThread extends Thread {
    private char[] arr;
    private int start, end;
    private int countX = 0;

    public CountThread(char[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            if (arr[i] == 'X') {
                countX++;
            }
        }
    }

    public int getCountX() {
        return countX;
    }
}

public class AssignmentThree {
    public static void main(String[] args) {
        char[] arr = { 'X', 'O', 'O', 'O', 'X', 'X', 'O', 'X', 'X', 'X' };
        int n = arr.length;

        // Split array into 2 parts
        int mid = n / 2;

        CountThread t1 = new CountThread(arr, 0, mid);
        CountThread t2 = new CountThread(arr, mid, n);

        // Start threads
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }

        // Combine results
        int totalX = t1.getCountX() + t2.getCountX();

        // Rearrange array
        for (int i = 0; i < totalX; i++) {
            arr[i] = 'X';
        }
        for (int i = totalX; i < n; i++) {
            arr[i] = 'O';
        }

        // Print result
        System.out.print("Rearranged array: ");
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }
}
