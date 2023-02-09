package lesson1;

import static java.lang.System.out;
import java.util.Scanner; 

public class _3_keyboard {
    public static void main(String[] args){
        // Task 3
        Scanner keyboard3 = new Scanner (System.in);
        out.print("Number: ");
        int n = keyboard3.nextInt();
        keyboard3.close();
        if (n % 2 == 0) { out.printf("%d is even", n); } 
        else { out.printf("%d is odd", n); }

        if (n>0) { out.printf(" and positive\n", n); }
        else if (n==0) { out.printf(", %d is zero\n", n); }
        else { out.printf(" and negative\n", n); }
    }
}
