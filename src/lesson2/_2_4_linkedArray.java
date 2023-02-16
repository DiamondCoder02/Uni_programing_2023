package lesson2;

import static java.lang.System.out;
import java.util.Scanner; 
import java.util.LinkedList; 

public class _2_4_linkedArray {
    public static void main(String[] args) { 
        Scanner billentyu = new Scanner (System.in); 
        LinkedList<String> nevek = new LinkedList<>();  
        out.print("Kérek egy nevet: "); 
        String nev = billentyu.nextLine(); 
        while(nev.length()!=0){ nevek.add(nev);  
            out.print("Kérek egy nevet: "); 
            nev = billentyu.nextLine(); 
        } 
        out.println(nevek); 
        out.println("A lista elemeinek száma = " + nevek.size()); 
        //Elem keresése 
        out.print("Kérek egy keresendő nevet: "); 
        nev = billentyu.nextLine(); 
        if(nevek.contains(nev))out.printf("A %s név megtalálható!\n", nev); 
        else out.printf("A %s név nem található meg!\n", nev); 
        out.println(nevek); 
        //Adott elem módosítása    
        out.print("Kérem a módosítandó elem indexet: "); 
        int szam = billentyu.nextInt(); 
        out.print("Kérem az új nevet: "); 
        nev = billentyu.next(); 
        nevek.set(szam, nev); 
        out.println(nevek); } 
}
