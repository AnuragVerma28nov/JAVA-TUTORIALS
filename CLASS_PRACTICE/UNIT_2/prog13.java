// Problem in inter-thread communication in Java.

package UNIT_2;

class Sum extends Thread { // Class extending Thread to create a custom thread
    int total = 0;

    public void run() {
        for (int i = 1; i <= 5; i++) {
            total += i;
        }
    }
}

public class prog13 {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.start();
        System.out.println("Total sum from 1 to 5 is: " + obj.total);
    }
}
// Output:
// Total sum from 1 to 5 is: 0
// The output is 0 because the main thread prints the total before the Sum thread has completed.