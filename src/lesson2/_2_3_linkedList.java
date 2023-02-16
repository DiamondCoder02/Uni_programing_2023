package lesson2;

import static java.lang.System.out;
import java.util.Scanner; 
import java.util.LinkedList; 

public class _2_3_linkedList {
    public static void main(String[] args) {
        Scanner billentyu = new Scanner (System.in); 
        LinkedList<String> nevek = new LinkedList<>();  
        out.print("Kérek egy nevet: ");
        String nev = billentyu.nextLine(); 
        while(nev.length()!=0){ 
            nevek.add(nev); 
            out.print("Kérek egy nevet: "); 
            nev = billentyu.nextLine(); 
        } 
        out.println(nevek); 
        out.print("Kérek egy nevet a lista elejére: "); 
        nev = billentyu.nextLine(); 
        nevek.addFirst(nev); 
        out.print("Kérek egy nevet a lista végére: "); 
        nev = billentyu.nextLine(); 
        nevek.addLast(nev); 
        out.println(nevek);  
        out.print("Kérem a beszurandó név indexét: "); 
        int szam = billentyu.nextInt(); 
        out.print("Kérem a beszurandó nevet: "); 
        nev = billentyu.next(); 
        nevek.add(szam, nev); 
        out.println(nevek);   
        out.print("Kérem a törlendő elem indexet: "); 
        szam = billentyu.nextInt(); 
        out.println("A törlendő név: " + nevek.get(szam)); 
        nevek.remove(szam); 
        out.println(nevek); 
        out.print("Kérem a törlendő elemet: "); 
        nev = billentyu.next(); 
        nevek.remove(nev); 
        out.println(nevek);
    }
}
