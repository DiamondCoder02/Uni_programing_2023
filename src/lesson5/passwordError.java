package lesson5;

import static java.lang.System.out; 
import java.util.Scanner; 

public class passwordError {
    public static void main(String[] args) { 
        Scanner billentyu = new Scanner (System.in); 
        out.print("Mi a jelszó? "); 
        String jelszo = billentyu.next(); 
        try {
            out.println(teszt(jelszo)); 
        } catch (Exception e) {
            out.println("Hiba --- " + e);
        }
        billentyu.close();
    } 
    public static String teszt(String jelszo) throws Exception{ 
        if(jelszo.equals("alma")) return"A jelszó rendben van"; 
        else throw new Exception(); 
    }
}
