package Practical_5;

public class MultiThreading extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            } finally {
                System.out.println("Finally block executed.");
            }
        }
    }

    public static void main(String[] args) {
        MultiThreading obj = new MultiThreading();// Creating object of class MultiThreading
        obj.start();
    }
}
