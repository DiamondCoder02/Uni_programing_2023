package lesson5;

import static java.lang.System.out; 
import static java.lang.System.in; 
import java.io.IOException; 

public class errors {
    public static void main(String[] args) throws IOException {
        out.print("Give me num:");
        char c = (char) in.read();
        switch (c){
            case '0': out.println("zero"); break;
            case '1': out.println("one"); break;
            case '2': out.println("two"); break;
            case '3': out.println("three"); break;
            case '4': out.println("four"); break;
            case '5': out.println("five"); break;
            case '6': out.println("six"); break;
            case '7': out.println("seven"); break;
            case '8': out.println("eight"); break;
            case '9': out.println("nine"); break;
            default: out.println("not a digit"); break;
        }
    }
}

/* 
try {  
    // Megkísérelünk végrehajtani olyan utasításokat, 
    // amelyek kivételt okozhatnak. 
} 
catch(Exception error) { 
    // Ha kivétel történik, a program ide ugrik, 
    // itt megadhatjuk, hogy hiba esetén mi történjen, 
    // lehet többszörös, ekkor az általános hibakezelőt a végére kell tenni. 
} 
finally {  
    // Nem kötelező megadni. 
    // Erre az ágra mindkét esetben (try, catch) átadódik a vezérlés. 
    // Ide kerülnek azok az utasítások, amelyeket mindenképpen végre 
    // kell hajtani (pl. fájllezárás). 
    // Mivel itt is lehet olyan művelet (pl. fájllezárás), ami szintén kivételt 
    // eredményezhet, ezt is illik try-catch szerkezettel lekezelni. 
} 
*/