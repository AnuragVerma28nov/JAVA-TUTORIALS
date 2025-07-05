package Practical_2;

public class CommandLineArgs {
   
    public static void main(String[] args) {
        
        if (args.length > 0) { // Check if arguments are provided
            System.out.println("Command Line Arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command line arguments provided.");
        }
    }
}

// To run this program, use the command line to compile and execute it:
// javac CommandLineArgs.java
// java CommandLineArgs arg1 arg2 arg3