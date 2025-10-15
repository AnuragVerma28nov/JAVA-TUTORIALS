// Program for multiple threads in Java.

package UNIT_2;

class MyThread extends Thread {  // Class extending Thread to create a custom thread
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1000 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println("Thread is running completed: " + Thread.currentThread().getName());
    }
}

public class prog12b extends Thread {  // Main class to demonstrate multiple threads
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }


}

// Output:
// Thread Thread-0 is running: 0
// Thread Thread-0 is running: 1
// Thread Thread-0 is running: 2
// Thread Thread-0 is running completed: Thread-0
// Thread Thread-1 is running: 0
// Thread Thread-1 is running: 1
// Thread Thread-1 is running completed: Thread-1