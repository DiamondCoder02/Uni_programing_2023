package lesson2;

import static java.lang.System.out;
import java.util.Scanner; 

public class _2_1_arrays {
    public static void main(String[] args) { 
        final int MAX=5; 
        Scanner keyboard = new Scanner (System.in); 
        int[] array = new int[MAX]; 
        for(int i=0; i<MAX; i++){ 
            out.printf("Kérem az %d. számot: ", i+1); 
            array[i] = keyboard.nextInt(); 
        }
        keyboard.close();
        int min, max;
        min = max = array[0];
        for(int i=1; i<MAX; i++){
            if(array[i] < min) min = array[i];
            if(array[i] > max) max = array[i];
        }
        out.println("Min = " + min);
        out.println("Max = " + max);
        int change;
        for(int j=0; j<MAX-1; j++){
            for (int i=0; i<MAX-1; i++){
                if(array[i] > array[i+1]){
                    change = array[i];
                    array[i] = array[i+1];
                    array[i+1] = change;
                }
            }
        }
        for(int i:array){
            out.println(array[i]);
        }
    }
}
