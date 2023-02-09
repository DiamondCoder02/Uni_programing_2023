package lesson1;

import static java.lang.System.out;
import java.util.Scanner; 

public class _8_for {
    public static void main(String[] args) { 
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérek egy számot: "); 
        int n = billentyu.nextInt(); 
        for(int i=0; i<=n; i++) out.println(i); 
        billentyu.close();
    } 
}
