// Program to demonstrate the use of threads by extending the Thread class.
// This program creates a thread, starts it, and prints messages from both the main method and the run method of the thread.

package UNIT_2;

public class prog11 extends Thread {
    public static void main(String[] args) {
        prog11 obj = new prog11(); // Thread created
        System.out.println("This is outside the run method of thread.");
        obj.start(); // start method is called to invoke the run method
    }
    public void run() { // overriding run method
        System.out.println("This is inside the run method of thread.");
    }
}

// Output:
// This is outside the run method of thread.
// This is inside the run method of thread.