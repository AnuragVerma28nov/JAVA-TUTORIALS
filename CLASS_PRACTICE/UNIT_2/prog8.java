// Write content to a file output.txt using BufferedWriter

package UNIT_2;

import java.io.*;

public class prog8 {

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src\\UNIT_2\\output.txt"));
            bw.write("Hello, World!\n");
            bw.write("Bye, World!\n");
            bw.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            System.out.println("File writing operation completed.");
        }
    }
}
// This program writes two lines of text to a file named output.txt using BufferedWriter.
//output.txt will contain:
//Hello, World! 
//Bye, World! 