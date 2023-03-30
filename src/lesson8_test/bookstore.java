package lesson8_test;

import java.nio.charset.StandardCharsets;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream; 
import static java.lang.System.out;

import java.util.Scanner; 

public class bookstore {
    public static void main(String[] args) throws IOException{
        PrintStream out = new PrintStream(System.out, true, StandardCharsets.UTF_8); 
        FileOutputStream fileOut = new FileOutputStream(new File("Lesson8binObject.bin")); 
        book_OB books[] = new book_OB[5]; 
        Scanner keyBoard = new Scanner(System.in, "utf-8");
        for(int i = 0; i < 5; i++) { 
            books[i] = new book_OB(); books[i].inputBook(keyBoard);
            fileOut.write(books[i].toString().getBytes());
        }
        keyBoard.close();
        out.println("Sorszám\t\t\t\tCím\t\t\t\tSzerző\t\t\t\tKiadás éve");
        for(int i = 0; i<5; i++){ 
            out.printf("\t\t%d\t\t", i+1); books[i].output();
        }
        int count = 0;
        for(int i = 0; i<5; i++){
            if(books[i].getYear() < 1970){
                count++;
            }
        }
        out.println("Összesen " + count + " könyv van ami 50 évnél idősebb.");
    }
}

class book_OB{ 
    private int number; 
    private String bookName; 
    private String authorName;
    private int year;
    public void inputBook(Scanner bill) { 
        out.print("Kérem a könyv sorszámát: "); 
        number = bill.nextInt(); 
        out.print("Kérem a könyv címét: "); 
        bookName = bill.next(); 
        out.print("Kérem a könyv szerzőjének nevét: "); 
        authorName = bill.next(); 
        out.print("Kérem a könyv kiadásának évszámát: "); 
        year = bill.nextInt();
    }

    public void output() { 
        out.print(number); 
        out.print("\t\t"); 
        out.print(bookName); 
        out.print("\t\t"); 
        out.print(authorName); 
        out.print("\t\t"); 
        out.println(year); 
    }

    public int getYear() {
        return year;
    }
} 