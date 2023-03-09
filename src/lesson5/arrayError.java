package lesson5;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner; 

public class arrayError {
    public static void main(String[] args){ 
        final int MAX=5; 
        Scanner billentyu = new Scanner (System.in); 
        int[] tomb = new int[MAX]; 
        int i =0; 
        try{ 
            out.printf("Kérem az %d. számot: ", i+1); 
            tomb[i] = billentyu.nextInt(); 
            while(tomb[i] != 0){ 
                i++;
                out.printf("Kérem az %d. számot: ", i+1); 
                tomb[i] = billentyu.nextInt(); 
            } 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            out.println("Túl sok számot adott meg!"); 
        }
        catch(InputMismatchException e){
            out.println("Nem számot adott meg!");
        }
        catch(Exception e) { 
            out.println("Hiba --- " + e);
        } 
        billentyu.close();
    }
}
