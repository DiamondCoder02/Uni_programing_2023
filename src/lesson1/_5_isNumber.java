package lesson1;

import static java.lang.System.out;
import static java.lang.System.in;
import java.io.*;

public class _5_isNumber {
    public static void main(String[] args) throws IOException {
        out.print("Give me a number character: ");  
        char c = (char) in.read();
        switch (c) {
            case 0: out.println("Zero"); break;
            case 1: out.println("One"); break;
            case 2: out.println("Two"); break;
            case 3: out.println("Three"); break;
            case 4: out.println("Four"); break;
            case 5: out.println("Five"); break;
            case 6: out.println("Six"); break;
            case 7: out.println("Seven"); break;
            case 8: out.println("Eight"); break;
            case 9: out.println("Nine"); break;
            default: out.println("Not a number"); break;
        }
    }
}
