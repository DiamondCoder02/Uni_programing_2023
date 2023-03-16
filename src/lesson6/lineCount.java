package lesson6;

import java.io.IOException; 
import java.io.BufferedReader; 
import java.io.FileReader; 
import static java.lang.System.out;

public class lineCount {
    public static void main(String[] args) { 
        // count the line breaks in the file
        try (BufferedReader file = new BufferedReader(new FileReader("Names.txt"))) {
            int lineCount = 0;
            while (file.readLine() != null) {
                lineCount++;
            }
            out.println("A fájlban " + lineCount + " sor van.");
            file.close(); 
        } catch (IOException error) { 
            System.err.println("Hiba: " + error.getMessage()); 
        }
    }
}
