package Assignment;

/**
 * Write a Java Program that creates a thread (let's call it Thread 1). Thread 1
 * creates another
 * thread (Thread 2); Thread 2 creates Thread 3; and so on, up to Thread 50.
 * Each thread
 * should print "Hello from Thread <num>!", but you should structure your
 * program such that
 * the threads print their greetings in reverse order.
 */

class RootThread extends Thread {
    private int threadNumber;

    public RootThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        if (threadNumber < 50) {
            // Create next thread
            RootThread nextThread = new RootThread(threadNumber + 1);
            nextThread.start();

            try {
                // Wait for next thread to finish
                nextThread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }

        // Print after child finishes → ensures reverse order
        System.out.println("Hello from Thread " + threadNumber + "!");
    }
}

public class AssignmentTwo {
    public static void main(String[] args) {
        RootThread t1 = new RootThread(1);
        t1.start();

        try {
            t1.join(); // Ensure main finishes last
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }

        System.out.println("Main thread finished.");
    }
}
