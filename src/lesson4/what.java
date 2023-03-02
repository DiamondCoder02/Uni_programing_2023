package lesson4;

import static java.lang.System.out; 
import java.util.LinkedList; 
import java.util.Scanner; 

public class what {
    public static void main(String[] args) { 
        Scanner keyboard = new Scanner (System.in); 
        List list = new List(); 
        list.upload(keyboard);
        list.printToConsole();
    }   
} 

class List{ 
    class OB_def{ 
        public Integer azon; 
        public String nev; 
        public Float fizetes; 
    } 
    LinkedList<OB_def> data = new LinkedList<>(); 
    public void upload(Scanner keyboard){ 
        int i; 
        OB_def OB = new OB_def(); 
        out.printf("Azonosítót: "); 
        OB.azon = keyboard.nextInt(); 
        while(OB.azon!=0){ 
            out.printf("Név: "); 
            OB.nev = keyboard.next(); 
            out.printf("Fizetés: "); 
            OB.fizetes = keyboard.nextFloat(); 
            for(i=0; i<data.size(); i++){ 
                if(data.get(i).azon > OB.azon){ 
                    data.add(i, OB); break; 
                }    
            } 
            if( i == data.size())data.add(OB); 
            OB = new OB_def(); 
            out.printf("Azonosítót: "); 
            OB.azon = keyboard.nextInt(); 
        } 
        out.println(OB); 
    } 
    public void printToConsole(){ 
        for(int i = 0; i < data.size(); i++) out.printf("%10d %20s %10.2f\n",data.get(i).azon, data.get(i).nev, data.get(i).fizetes); 
    }    
}