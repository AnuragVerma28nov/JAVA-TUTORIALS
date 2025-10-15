// using OutputStreamWriter to write lines of text to a file named output_1.txt.

package UNIT_2;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
public class prog10 { 
    public static void main(String[] args) {
        String content = "Hello, World!\nBye, World!\n";
        try (FileOutputStream fos = new FileOutputStream("src\\UNIT_2\\output_1.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos)) {
            osw.write(content);
            osw.close(); // Close the OutputStreamWriter
            System.out.println("Content written to file successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            System.out.println("File writing operation completed.");
        }
    }   
}
// This program writes two lines of text to a file named output_1.txt using OutputStreamWriter.
// output_1.txt will contain:
// Hello, World!
// Bye, World!