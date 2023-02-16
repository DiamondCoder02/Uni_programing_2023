package lesson2;

import static java.lang.System.out;
import java.util.ArrayList; 
import java.util.Scanner; 

public class _2_2_dynamicArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in); 
        ArrayList<String> names = new ArrayList<>(); 
        out.print("Give me a name: "); 
        String name = keyboard.nextLine(); 
        while(name.length()!=0){ 
            names.add(name); 
            out.print("Give me a name: "); 
            name = keyboard.nextLine(); 
        }
        keyboard.close();
        out.println(names); 
        out.println("Number of elements = " + names.size()); 

        out.print("Give me an index to search: ");
        int index = keyboard.nextInt();
        out.println("Element at index " + index + " is " + names.get(index));

        out.print("Give me an index to change: ");
        index = keyboard.nextInt();
        out.print("Tha name is: " + names.get(index));
        out.print("Give me a new name: ");
        name = keyboard.nextLine();
        names.set(index, name);
        out.println("New names are: " + names);

        out.print("Give me a name index: ");
        index = keyboard.nextInt();
        out.println("The name to be deleted: " + names.get(index));
        names.remove(index);
        out.println("New names are: " + names);
    }
}
