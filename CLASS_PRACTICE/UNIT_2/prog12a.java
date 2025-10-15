// Program for multiple threads in Java.

package UNIT_2;

public class prog12a extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        prog12a obj1 = new prog12a();
        prog12a obj2 = new prog12a();
        obj1.start();
        obj2.start();
    }
}
