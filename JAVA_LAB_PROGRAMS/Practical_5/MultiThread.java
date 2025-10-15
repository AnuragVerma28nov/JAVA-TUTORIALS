package Practical_5;

import java.util.Scanner;

class WorkerThread extends Thread {
    private final int workerId;

    public WorkerThread(int workerId) {
        this.workerId = workerId;
    }

    @Override
    public void run() {
        System.out.println("Worker " + workerId + " started.");
        try {
            Thread.sleep((int) (Math.random() * 1000)); // Simulating task processing
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Worker " + workerId + " finished task.");
    }
}

public class MultiThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of worker threads: ");
        int numberOfWorkers = scanner.nextInt();
        scanner.close(); // Close the scanner after input

        System.out.println("Starting " + numberOfWorkers + " worker threads...");

        for (int i = 1; i <= numberOfWorkers; i++) {
            WorkerThread worker = new WorkerThread(i);
            worker.start();
        }

        System.out.println("All worker threads initiated.");
    }
}

/* Sample Output:

Enter the number of worker threads: 3
Starting 3 worker threads...
All worker threads initiated.
Worker 1 started.
Worker 2 started.
Worker 3 started.
Worker 2 finished task.
Worker 1 finished task.
Worker 3 finished task.

*/

