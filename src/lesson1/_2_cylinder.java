package lesson1;

import static java.lang.System.out;
import java.util.Scanner; 

public class _2_cylinder {
    public static void main(String[] args){
        // Task 2
        // ask in 2 numbers then calculate a cylinder volume and surface area
        
        Scanner keyboard2 = new Scanner (System.in);
        out.print("Radius: ");
        int r = keyboard2.nextInt();
        out.print("Height: ");
        int h = keyboard2.nextInt();
        keyboard2.close();

        out.printf("Volume: %d * %d * %d = %d\n", r, r, h, r * r * h);
        out.printf("Surface Area: 2 * %d * %d + 2 * %d * %d = %d\n", r, h, r, r, 2 * r * h + 2 * r * r);
    }
}
