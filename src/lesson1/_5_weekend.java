package lesson1;

import static java.lang.System.out;
import java.io.*;
import static java.lang.System.in;

public class _5_weekend {
    public static void main(String[] args) throws IOException{
        out.print("Day number: ");
        int day = in.read();
        if(day == 6 || day == 7) System.out.println("Weekend");
        else if(day == 1 || day == 2 || day == 3 || day == 4 || day == 5) System.out.println("Workday");
        else System.out.println("Not a valid day number");

        out.print("Day number: ");
        day = in.read();
        switch (day) {
            case 6: case 7: out.println("Weekend"); break;
            case 1: case 2: case 3: case 4: case 5: out.println("Workday"); break;
            default: out.println("Not a valid day number"); break;
        }
    }
}
