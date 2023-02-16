package lesson2;

import static java.lang.System.out; 
import java.util.LinkedList; 
import java.util.Scanner; 

public class _2_4_reeeeeeeeeeeeee {
    public static void main(String[] args) { 
        int i; 
        Scanner bill = new Scanner (System.in); 
        LinkedList<OB_def> adatok = new LinkedList<>(); 
        OB_def OB = new OB_def(); 

        out.printf("Kérem az azonosítót: "); 
        OB.azon = bill.nextInt(); 
        while(OB.azon!=0){ 
            out.printf("Kérem a nevet: "); 
            OB.nev = bill.next(); 
            out.printf("Kérem a fizetést: "); 
            OB.fizetes = bill.nextFloat(); 
            for(i=0; i<adatok.size(); i++){ 
                if(adatok.get(i).azon > OB.azon){ 
                    adatok.add(i, OB); break; 
                }   
            } 
            if( i == adatok.size())adatok.add(OB); 
            OB = new OB_def(); 
            out.printf("Kérem az azonosítót: "); 
            OB.azon = bill.nextInt(); 
        }
        for(i = 0; i < adatok.size(); i++) 
        out.printf("%10d %20s %10.2f\n",adatok.get(i).azon, adatok.get(i).nev, adatok.get(i).fizetes);
    }
    public static class OB_def{ 
        public Integer azon; 
        public String nev; 
        public Float fizetes; 
    } 
}
