package lesson5;

import static java.lang.System.out; 
import static java.lang.System.err; 
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) { 
        Scanner bill = new Scanner(System.in); 
        out.print("A háromszög oldalai: ");
        String oldal1 = bill.next();
        String oldal2 = bill.next();
        String oldal3 = bill.next();
        bill.close();
        try{ 
            int a = Integer.parseInt(oldal1); 
            int b = Integer.parseInt(oldal2); 
            int c = Integer.parseInt(oldal3); 
            if(a < 0 || b < 0 || c < 0)throw new HibásÉrték(); 
            if(a + b > c && a + c > b && b + c > a)out.println("Háromszög"); 
            else out.println("Nem háromszög"); 
        } 
        catch (NumberFormatException error){ 
            err.println ("Nem számot adtunk meg! - " + error.getMessage());
        } catch (HibásÉrték error){ 
            err.println("Hibás az oldalak száma!"); 
        } finally{ 
            out.println("Ez a finally rész"); 
        }
    }
}
class HibásÉrték extends Exception{} 