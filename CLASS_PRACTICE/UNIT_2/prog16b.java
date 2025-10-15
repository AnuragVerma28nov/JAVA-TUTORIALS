// Printing the priority of the child thread in Java and set its new priority 

package UNIT_2;

class MyThread extends Thread {
    public void run() {
        System.out.println("Child thread is running...");
        System.out.println("Priority of child thread: " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(2); // Setting new priority for the child thread
        System.out.println("New priority of child thread: " + Thread.currentThread().getPriority());
    }
}

public class prog16b {

    public static void main(String[] args) {
        System.out.println("Priority of main thread: " + Thread.currentThread().getPriority());
        MyThread obj = new MyThread();
        obj.setPriority(2); // Setting initial priority for the child thread
        obj.start();
    }
}

// Output:
// Priority of main thread: 5
// Child thread is running...
// Priority of child thread: 2
// New priority of child thread: 2