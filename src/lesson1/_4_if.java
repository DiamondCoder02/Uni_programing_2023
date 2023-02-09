package lesson1;

import static java.lang.System.out;
import java.util.Scanner; 

public class _4_if {
    public static void main(String[] args){
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérek egy számot: "); 
        int szam = billentyu.nextInt(); 
        if(szam > 0) out.println("Pozitív"); 
        else if(szam == 0) out.println("Nulla"); 
        else out.println("Negatív"); 
        billentyu.close();
    }
}
