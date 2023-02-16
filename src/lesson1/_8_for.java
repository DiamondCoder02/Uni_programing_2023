package lesson1;

import static java.lang.System.out;
import java.util.Scanner; 

public class _8_for {
    public static void main(String[] args) { 
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérek egy számot: "); 
        int number = billentyu.nextInt(); 
        int fakt = faktorial(number);
        out.println(number+"! = "+fakt);
        billentyu.close();
    } 
    private static int faktorial(int n){
        if(n==1)return 1;
        return n*faktorial(n-1);
    }
}
