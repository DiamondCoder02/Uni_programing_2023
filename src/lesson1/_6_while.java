package lesson1;

import static java.lang.System.out;
import java.util.Scanner; 

public class _6_while {
    public static void main(String[] args) {
        Scanner userNumber = new Scanner (System.in);
        out.print("Give me a number: ");
        int n = userNumber.nextInt();
        userNumber.close();
        int number = 0;
        while (number <= n) {
            out.println(number);
            number++;
        }
    }
}
