package lesson2;

import static java.lang.System.out; 
import java.util.LinkedList; 
import java.util.Scanner; 

public class _2_4_ffffffffffffffffff {
    public static void main(String[] args) { 
        int i; 
        Scanner billentyu = new Scanner (System.in); 
        LinkedList<String> nevek = new LinkedList<>();  
        out.print("Kérek egy nevet: "); 
        String nev = billentyu.nextLine(); 
        while(nev.length()!=0){ 
            for(i=0; i<nevek.size(); i++){ 
                if(nev.compareTo(nevek.get(i)) < 0){ 
                    nevek.add(i, nev); break; 
                } 
            } 
            if( i == nevek.size())nevek.add(nev); 
            out.print("Kérek egy nevet: "); 
            nev = billentyu.nextLine(); 
        } 
        out.println(nevek); 
    }
}
