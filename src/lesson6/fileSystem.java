package lesson6;

import static java.lang.System.out; 
import static java.lang.System.err; 
import java.io.FileWriter; 
import java.io.FileReader; 
import java.io.IOException; 

public class fileSystem {
    public static void main(String[] args) { 
        String szoveg = "Kipróbáljuk az ékezetes betűket: \nÁáÉéÍíÓóÖöŐőÚúÜüŰű\n"; 
        try { 
            try (FileWriter ki = new FileWriter("Lesson6fileSystem.txt")) { 
                //Fájl megnyitás) 
                int i = 0; 
                while(i < szoveg.length()) { 
                    int c = szoveg.charAt(i++);  
                    // A sztring i. karaktere 
                    ki.write(c); 
                    // Egy karakter kiírása 
                } 
                ki.close(); 
                //Fájl lezárás 
            } 
        } catch (IOException error){   
            //Általános I/O hiba 
            err.println(error.getMessage());  
            //Hiba kiírása 
        } 
        try { 
            try (FileReader be = new FileReader("Lesson6fileSystem.txt")){   
                // Fájl megnyitás 
                int c; 
                while ((c = be.read()) != -1) { 
                    //Egy karakter olvasás, EOF végjelig 
                    out.print((char)c); 
                    //Karakter kiírás a képernyőre 
                } 
                be.close();  
                //Fájl lezárás 
            } 
        } catch (IOException error){  
            //Általános I/O hiba 
            err.println(error.getMessage()); 
            //Hiba kiírása 
        } 
    }
}
