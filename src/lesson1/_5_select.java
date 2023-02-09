package lesson1;

import static java.lang.System.out;
import java.util.Scanner; 

public class _5_select {
    public static void main(String[] args){
        Scanner month = new Scanner (System.in);
        out.print("Month number: ");
        int mo = month.nextInt();
        month.close();
        switch (mo) {
            case 1: out.println("January"); break;
            case 2: out.println("February"); break;
            case 3: out.println("March"); break;
            case 4: out.println("April"); break;
            case 5: out.println("May"); break;
            case 6: out.println("June"); break;
            case 7: out.println("July"); break;
            case 8: out.println("August"); break;
            case 9: out.println("September"); break;
            case 10: out.println("October"); break;
            case 11: out.println("November"); break;
            case 12: out.println("December"); break;
            default: out.println("Invalid month number"); break;
        }
        switch (mo) {
            case 1: case 2: case 12: out.println("Winter"); break;
            case 3: case 4: case 5: out.println("Spring"); break;
            case 6: case 7: case 8: out.println("Summer"); break;
            case 9: case 10: case 11: out.println("Autumn"); break;
            default: out.println("Invalid month number"); break;
        }
    }
}
