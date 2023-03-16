package lesson6;

import static java.lang.System.out; 
import static java.lang.System.err;
import java.io.FileReader; 
import java.io.IOException; 
import java.util.Scanner; 

public class gay {
    public static void main(String[] args) { 
        Scanner file = new Scanner(System.in); 
        out.print("Give me the name of the file: "); 
        String fileName = file.next();
        file.close();
        try (FileReader be = new FileReader(fileName+".txt")){
            int c; 
            while ((c = be.read()) != -1) {
                out.print((char)c);
            } 
            out.println("-----------------------------");
            be.close();
        } catch (IOException error){
            err.println(error.getMessage()); 
        }
    }
}
