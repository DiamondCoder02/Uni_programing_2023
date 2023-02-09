package lesson1;

import static java.lang.System.out;
import java.util.Scanner; 

public class _1_math {
    public static void main(String[] args){
        // Task 1
        Scanner billentyu = new Scanner (System.in); 
        out.print("First Number: "); 
        int a = billentyu.nextInt(); 
        out.print("Second Number: "); 
        int b = billentyu.nextInt(); 
        billentyu.close();

        out.printf("Add up: %d + %d = %d\n", a, b, a + b);
        out.printf("Subtract: %d - %d = %d\n", a, b, a - b);
        out.printf("Multiply: %d * %d = %d\n", a, b, a * b);
        out.printf("Divide: %d / %d = %d\n", a, b, a / b);
        out.printf("Modulo: %d %% %d = %d\n", a, b, a % b);
    }
}
