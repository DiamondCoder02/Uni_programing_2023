package lesson3_test;

import static java.lang.System.out;
import java.util.Scanner; 
import java.util.LinkedList; 

public class test {
    public static void main(String[] args){
        out.print("\033[H\033[2J");

        Scanner keyboard = new Scanner (System.in);
        LinkedList<pay_func> pays = new LinkedList<>();
        pay_func payList = new pay_func(); 
        // read the payments
        out.print("Give me a payment info: ");
        payList.payment = keyboard.nextFloat();
        pays.add(payList); 
        while(payList.payment != 0){
            out.print("(Exit with \"0\" ) Give me a payment info: ");
            payList.payment = keyboard.nextFloat();
            pays.add(payList);
        }
        // minimal payment
        out.println("Give me the minimal payment: ");
        float min = keyboard.nextFloat();
        keyboard.close();
        // under and over the minimal payment
        Number under = 0;
        Number over = 0;
        for (int i = 0; i < pays.size(); i++) {
            if(pays.get(i).payment < min){
                under = under.intValue() + 1;
            }else if(pays.get(i).payment > min){
                over = over.intValue() + 1;
            }
        }
        out.println("Under the minimal payment: " + under);
        out.println("Over the minimal payment: " + over);
        // calculate average
        float average = 0;
        for (int i = 0; i < pays.size(); i++) {
            average += pays.get(i).payment;
        }
        average /= pays.size();
        out.println("Average: " + average);
    }
    public static class pay_func{
        public Float payment;
    } 
}