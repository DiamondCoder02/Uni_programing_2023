package lesson2;

import static java.lang.System.out;
import java.util.Scanner; 

public class _1_8_division {
    public static void main(String[] args) { 
        Scanner keyboard = new Scanner (System.in); 
        int r;
        out.print("Give me number: ");
        int a = keyboard.nextInt();
        out.print("Give me another number: ");
        int b = keyboard.nextInt();
        r = a%b;
        while(r!=0){
            a = b;
            b = r;
            r = a%b;
        }
        keyboard.close();
        out.println("Greatest common divisor = " + b);
    } 
}
