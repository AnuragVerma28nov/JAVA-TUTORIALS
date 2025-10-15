package Practical_7.src;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandler {

    private final String filename = "data.txt"; // File to store data

    // Method to write user input to file
    public void writeToFile(String text) {
        try (FileWriter writer = new FileWriter(filename, true)) { // Append mode
            writer.write(text + "\n");
            System.out.println("Data saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read data from file
    public void readFromFile() {
        try (FileReader reader = new FileReader(filename);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
             
            System.out.println("\n--- File Content ---");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
