package lesson5;

import static java.lang.System.out; 
import java.util.Scanner;

public class divide {
    public static void main(String[] args) { 
        Scanner billentyu = new Scanner (System.in);
        int a, b;
        out.print("Kérem az első számot: ");
        a = billentyu.nextInt();
        out.print("Kérem a második számot: ");
        b = billentyu.nextInt();
        billentyu.close();
        try{
            out.println("A két szám hányadosa: " + a/b);
        }
        catch (Exception error){
            out.println("Hiba: " + error);
        }
    }
}
