package lesson7;

import java.io.IOException; 
import java.io.RandomAccessFile; 
import static java.lang.System.err; 
import static java.lang.System.out; 
import java.util.Scanner; 

public class random4 {
    public static void main(String[] args) { 
        float szám = 0; 
        Scanner bill = new Scanner(System.in); 
        RandomAccessFile file = null; 
        try{ 
            file = new RandomAccessFile("Lesson7random4.txt", "rw"); 
            file.setLength(0); 
            out.print("Kérek egy számot: "); 
            szám=bill.nextFloat(); 
            while(szám != 0){ 
                file.writeFloat(szám); 
                out.print("Kérek egy számot: "); 
                szám=bill.nextFloat(); 
            } 
            bill.close();
            out.println("-----"); 
            file.seek(0); 
            while(file.getFilePointer()!=file.length()){ 
                szám=file.readFloat(); 
                out.println(szám); 
            } 
            out.println("-----"); 
            long step = 2*Float.BYTES; 
            long poz = Float.BYTES; 
            while (poz < file.length()){ 
                file.seek(poz); 
                szám = file.readFloat(); 
                poz += step; out.println(szám); 
            } 
        } catch (IOException error){ 
            err.println("Fájl hiba - " + error.getMessage());
        } finally {
            try { 
                if (file != null) file.close(); 
            } catch (IOException error) {
                err.println(error.getMessage());
            } 
        } 
    } 
}
