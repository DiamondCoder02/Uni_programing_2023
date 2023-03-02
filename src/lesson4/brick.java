package lesson4;

import static java.lang.System.out; 
import java.util.Scanner; 

public class brick {
    public static void main(String[] args) { 
        beolvas ob = new beolvas(); 
        szamol (ob); 
    } private static void szamol(beolvas o){ 
        out.printf("A téglatest felszíne = %d\n", 2*(o.a*o.b +o.a*o.c +o.b*o.c)); 
        out.printf("A téglatest térfogata = %d\n", o.a*o.b*o.c); 
    } 
}

class beolvas{ 
    public int a, b, c; public beolvas(){ 
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérem a téglatest hosszúságát: "); 
        a = billentyu.nextInt(); 
        out.print("Kérem a téglatest szélességét: "); 
        b = billentyu.nextInt(); 
        out.print("Kérem a téglatest magasságát: "); 
        c = billentyu.nextInt(); 
    } 
}