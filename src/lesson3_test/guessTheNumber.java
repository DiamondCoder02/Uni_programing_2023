package lesson3_test;

import static java.lang.System.out; 
import java.util.Random; 
import java.util.Scanner; 

public class guessTheNumber {
    static Scanner billentyu = new Scanner (System.in); 
    public static void main(String[] args) { 
        out.print("Kérem a játékosok számát: "); 
        int jatekos = billentyu.nextInt(); 
        int nyero = 0; 
        for(int i =0; i<jatekos; i++){ 
            out.printf("\nKérem a %d. játékost!\n", i+1); 
            int n=tipp(); 
            if(nyero > n)nyero = n; 
        } 
        out.printf("\nA %d. játékos nyert\n", nyero+1); 
        out.println("Köszönöm a játékot"); 
    }
    private static int tipp() { 
        int tippek = 0; 
        int RSzam  = new Random().nextInt(10) + 1; 
        out.print("Írj be egy számot 1 és 10 között: "); 
        int beSzam = billentyu.nextInt(); 
        tippek++; 
        while(beSzam != RSzam) { 
            if (beSzam < RSzam) { 
                out.println("A szám nagyobb!"); 
            } else { 
                out.println("A szám kisebb!"); 
            }
            beSzam = billentyu.nextInt(); 
            tippek++; 
        } 
        out.printf("Eltaláltad! A tippjeid száma = %d\n",tippek); 
        return tippek; 
    } 
}
