package lesson3_test;

import static java.lang.System.out; 
import java.util.Scanner; 

public class strings_writing {
    public static void main(String[] args) { 
        // ask for a string, then write out first, middle and last character
        Scanner keyboard = new Scanner (System.in);
        out.print("Give me a word: ");
        String word = keyboard.next();
        out.println("The word is: " + word +"\n\n");
        out.println("The first character is: " + word.charAt(0));
        out.println("The middle character is: " + word.charAt(word.length()/2));
        out.println("The last character is: " + word.charAt(word.length()-1));
        keyboard.close();
    }
}
