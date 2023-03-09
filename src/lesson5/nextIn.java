package lesson5;

import static java.lang.System.out; 
import java.util.Scanner; 

public class nextIn {
    public static void main(String[] args) { 
        Scanner billentyu = new Scanner (System.in); 
        int[] tomb = new int[100]; 
        int db = 0; 
        do{ 
            out.printf("Kérem a %d. számot: ",db+1); 
            try{ 
                tomb[db] = billentyu.nextInt(); 
            } 
            catch (Exception error){ 
                break; 
            } 
            db++; 
        }while(true); 
        billentyu.close();
        for(int i=0; i<db ;i++) out.println(tomb[i]);
    }
}
