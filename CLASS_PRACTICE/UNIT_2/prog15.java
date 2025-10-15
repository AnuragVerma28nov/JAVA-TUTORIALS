// Print the priority of main thread

package UNIT_2;

public class prog15 {

   public static void main(String[] args) {
       Thread obj = Thread.currentThread();
       System.out.println("Priority of main thread: " + obj.getPriority());
   }
}

// Output:
// Priority of main thread: 5
