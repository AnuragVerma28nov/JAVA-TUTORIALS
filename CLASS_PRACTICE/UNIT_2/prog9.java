// Read content from a file output.txt using BufferedReader

package UNIT_2;

import java.io.*;

public class prog9 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\UNIT_2\\output.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        } finally {
            System.out.println("File reading operation completed.");
        }
    }
}
// This program reads two lines of text from a file named output.txt using BufferedReader.
//output:
//Hello, World! 
//Bye, World! 
//File reading operation completed.