package lesson2;

import static java.lang.System.out;
import java.util.Scanner; 

public class _1_8_brick {
    public static void main(String[] args) {
        int a,b,c;
        Scanner keyboard = new Scanner (System.in);
        out.print("Give me 3 numbers: ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        keyboard.close();
        int area = 2*(a*b+b*c+a*c);
        int volume = a*b*c;
        out.println("Area = " + area);
        out.println("Volume = " + volume);
    }
}
