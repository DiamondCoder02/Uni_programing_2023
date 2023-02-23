package lesson3_test;

import static java.lang.System.out; 
import java.util.Scanner; 

public class classes {
    public static void main(String[] args) { 
        Tegla t = new Tegla(); 
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérem a téglatest hosszúságát: "); 
        int a = billentyu.nextInt(); 
        out.print("Kérem a téglatest szélességét: "); 
        int b = billentyu.nextInt(); 
        out.print("Kérem a téglatest magasságát: "); 
        int c = billentyu.nextInt(); 
        out.printf("\nA téglatest térfogata = %d\n", t.tegla(a, b, c)); 
        out.printf("A téglatest felülete = %d\n", t.area(a, b, c));
    } 
}

class Tegla{ 
    public int tegla(int a, int b, int c) { 
        return a*b*c; 
    } 
    public int area(int a, int b, int c) { 
        return 2*(a*b + a*c + b*c); 
    }
} 
