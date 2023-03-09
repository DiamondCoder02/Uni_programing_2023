package lesson3_test;

import static java.lang.System.out; 

public class types_testing {
    public static void main(String[] args) { 
        out.println("Minimum érték = " + Integer.MIN_VALUE); 
        out.println("Maximum érték = " + Integer.MAX_VALUE); 
        out.println("Byteszám = " + Integer.BYTES); 
        out.println("Bitszám = " + Integer.SIZE); 
        out.println("Típus = " + Integer.TYPE); 
        out.println("Minimum érték = " + Float.MIN_VALUE); 
        out.println("Maximum érték = " + Float.MAX_VALUE); 
        out.println("Byteszám = " + Float.BYTES); 
        out.println("Bitszám = " + Float.SIZE); 
        out.println("Típus = " + Float.TYPE); 
        out.println("Minimum érték = " + (int) Character.MIN_VALUE); 
        out.println("Maximum érték = " + (int) Character.MAX_VALUE); 
        out.println("Byteszám = " + Character.BYTES); 
        out.println("Bitszám = " + Character.SIZE); 
        out.println("Típus = " + Character.TYPE); 

        out.println("-----------------------------");

        out.println("Konvertálás sztringből = " + Integer.valueOf("5678")); 
        Integer a = 5; Integer b = 4; 
        out.println("Összehasonlítás (nagyobbhoz a kisebbet): " + a.compareTo(b)); 
        out.println("Összehasonlítás (kisebbhez a nagyobbat): " + b.compareTo(a)); 
        out.println("Kisebb = " + Integer.min(a, b)); 
        Float f1 = Float.valueOf("5.2e3"); 
        // Float f2 = new Float(4.1); 
        Float f2 = Float.valueOf("5.2e3"); 
        out.println("f1 = " + f1 + " f2 = " + f2); 
        out.println("Kisebb = " + Float.min(f1, f2)); 
        out.println("Nagyobb = " + Float.max(f1, f2)); 
        Integer c = 135; 
        out.println("Hexadecimális = " + Integer.toHexString(c)); 
        out.println("Oktális = " + Integer.toOctalString(c)); 
        out.println("Bináris = " + Integer.toBinaryString(c)); 

        out.println("-----------------------------");
        
        String s1 = "alma"; 
        char data[] = {'k', 'ö', 'r', 't', 'e'}; 
        String s2 = new String(data); 
        String s3 = "szilva"; 
        String s4 = s1 + "mag"; 
        out.println(s1); 
        out.println(s2); 
        out.println(s3); 
        out.println(s4); 
        for (int i=0; i<s2.length(); i++) out.printf("%c ", s2.charAt(i));
        out.println(); 
        out.println(s4.toUpperCase()); 
        out.println(s2.indexOf("t")); 
        out.println(s3.substring(2,5)); 
    } 
}
