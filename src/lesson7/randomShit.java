package lesson7;

import java.io.IOException; 
import java.io.RandomAccessFile; 
import static java.lang.System.err; 
import static java.lang.System.out; 

public class randomShit {
    public static void main(String[] args) { 
        // int szam; 
        try{ 
            RandomAccessFile file = new RandomAccessFile("Lesson7randomShit.txt", "rw"); 
            for(int i = 48; i <= 57; i++) file.write(i); 
            file.seek(0); 
            out.println(file.read()); 
            file.skipBytes(5); 
            out.println(file.read()); 
            out.println("Aktuális pozició: " + file.getFilePointer()); 
            file.close(); 
        } catch (IOException error){ 
            err.println("Fájl hiba - " + error.getMessage()); 
        } 
    } 
}
