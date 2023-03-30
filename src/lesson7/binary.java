package lesson7;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.err;
import static java.lang.System.out;

public class binary {
    public static void main(String[] args) { 
        try{ 
            FileOutputStream out = new FileOutputStream("Lesson7binary.bin"); 
            for(int i = 48; i <= 57; i++) out.write(i); 
            out.close(); 
        } catch (IOException error){ 
            err.println("Írási hiba - " + error.getMessage()); 
        } 
        try { 
            FileReader in = new FileReader("Lesson7binary.bin"); 
            int c; 
            while ((c = in.read()) != -1){ 
                out.print((char)c + " "); 
            } 
            out.println(); 
            in.close(); 
        } catch (IOException error){  
            err.println("Olvasási hiba - " + error.getMessage()); 
        } 
    } 
}
