// Printing the priority of the main thread in Java and set its new priority

package UNIT_2;

public class prog16a {

   public static void main(String[] args) {
       Thread childThread = new Thread(new Runnable() {
           public void run() {
               System.out.println("Priority of main thread: " + Thread.currentThread().getPriority());
           }
       });

       childThread.setPriority(2);
       childThread.start();
   }
}

// Output:
// Priority of main thread: 2