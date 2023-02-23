package lesson3_test;

import static java.lang.System.out; 
import java.util.Scanner; 

public class password {
    public static void main(String[] args) { 
        Scanner billentyu = new Scanner (System.in); 
        out.print("Mi a jelszó? "); 
        String jelszo = billentyu.next(); 
        out.println("A beírt jelszó: " + jelszo +"\n\n"); 
        if(jelszo.equals("alma")) out.println("\nA jelszó rendben van\n"); 
        else out.println("\nA beírt jelszó hibás!\n"); 
    } 
}
