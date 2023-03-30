package lesson7;

import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.EOFException; 
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import static java.lang.System.err; 
import static java.lang.System.out; 
import java.util.InputMismatchException; 
import java.util.Scanner; 

public class mmm {
    public static void main(String[] args) { 
        FileHandling fh = new FileHandling();
        fh.Writing();
        fh.Printing();
    } 
}

class FileHandling {
    private int szam; 
    public void Writing() {
        Scanner bill = new Scanner (System.in); 
        // int szam; 
        try{ 
            FileOutputStream bki = new FileOutputStream("Lesson7mmm.bin"); 
            DataOutputStream ki = new DataOutputStream(bki); 
            do{ 
                out.print("Kérek egy számot: "); 
                try{ 
                    szam = bill.nextInt(); 
                    out.println(szam); 
                    ki.writeInt(szam); 
                } catch (InputMismatchException error){ break; } 
            }while(true); 
            bill.close();
            ki.close(); 
        } 
        catch (IOException error){ 
            err.println("Írási hiba - " + error.getMessage()); 
        } 
    }
    public void Printing() {
        try{ 
            FileInputStream bbe = new FileInputStream("Lesson7mmm.bin"); 
            DataInputStream be = new DataInputStream(bbe); 
            boolean noteof = true; 
            while (noteof){ 
                try{ 
                    szam = be.readInt(); 
                    out.println(" " + szam); 
                } catch (EOFException e){     
                    //Fájl vég 
                    noteof = false; 
                } 
            } 
            be.close();
        } catch (IOException error){  
            err.println("Olvasási hiba - " + error.getMessage()); 
        } 
    }
}