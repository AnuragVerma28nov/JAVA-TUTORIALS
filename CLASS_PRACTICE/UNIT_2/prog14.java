// Solution for inter-thread communication problem in Java

package UNIT_2;

class Sum extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) { // Synchronize the run method to ensure thread safety
            for (int i = 1; i <= 3; i++) {
                total += i;
            }
            this.notify(); // Notify the main thread that the calculation is done
        }
    }
}

public class prog14 {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.start();
        synchronized (obj) { // Synchronize on the Sum object
            try {
                obj.wait(); // Wait for the Sum thread to complete
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total sum from 1 to 3 is: " + obj.total);
        }
    }
}

// Output:
// Total sum from 1 to 3 is: 6