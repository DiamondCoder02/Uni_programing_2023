package lesson2;

import static java.lang.System.out;
import java.util.Scanner; 

public class _2_1_array2 {
    final static int MAX=100;
    public static void main(String[] args) { 
        Scanner keyboard = new Scanner (System.in);
        int[] array = new int[MAX];
        int i=0;
        out.println("Give me number: ");
        array[i] = keyboard.nextInt();
        while(array[i] != 0){
            i++;
            out.println("Give me number: ");
            array[i] = keyboard.nextInt();
        }
        keyboard.close();
        int sum=0;
        for(int j=0; j<i; j++){
            sum += array[j];
        }
        out.println("average = " + (float)sum/i);
    }
}
