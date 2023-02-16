package lesson2;

import static java.lang.System.out;
import java.util.Scanner; 

public class _1_8_add {
    public static void main(String[] args) { 
        Scanner keyboard = new Scanner (System.in); 
        int sum = 0; 
        int numb;         
        out.print("Give me number: "); 
        while(keyboard.hasNextInt()){ 
            numb = keyboard.nextInt(); 
            sum += numb; 
            out.print("Give me number: "); 
        } 
        keyboard.close();
        out.println("Sum of numbers = " + sum); 
    } 
}
