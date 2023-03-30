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

public class bin {
    public static void main(String[] args) { 
        Scanner bill = new Scanner (System.in); 
        int szam; 
        try{ 
            FileOutputStream bki = new FileOutputStream("Lesson7bin.bin"); 
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
        try{ 
            FileInputStream bbe = new FileInputStream("Lesson7bin.bin"); 
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
