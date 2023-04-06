package lesson8_test;

import java.awt.GridLayout;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.PrintStream;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class fuck {
    public static void main(String[] args) {
        Beolvas be = new Beolvas();
        Kiír ki = new Kiír();
        ki.Ki();
    }
}

class Beolvas {
    public Beolvas() {
        Scanner billentyu = new Scanner(System.in, "ISO8859_2");
        int azon;
        String nev;
        float fizetes;
        try {
            try (PrintStream file = new PrintStream("Lesson8fuck.txt")) {
                out.print("Kérek egy azonosítót: ");
                azon = billentyu.nextInt();
                while (azon != 0) {
                    out.print("Kérek egy nevet: ");
                    nev = billentyu.next();
                    out.print("Kérek egy fizetést: ");
                    fizetes = billentyu.nextFloat();
                    file.printf("%d-%s-%d\n", azon, nev, fizetes);
                    out.print("Kérek egy azonosítót: ");
                    azon = billentyu.nextInt();
                }
            }
        } catch (IOException error) {
            System.err.println("Hiba: " + error.getMessage());
        }
        billentyu.close();
    }
}

class Kiír extends JFrame {
    public void Ki() {
        String sor;
        int sorok = 0;
        StringTokenizer token;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        try (Scanner file = new Scanner(new File("Lesson8fuck.txt"))) {
            while (file.hasNext()) {
                sor = file.nextLine();
                sorok++;
                token = new StringTokenizer(sor, "-");
                add(new JLabel(" " + (String) token.nextElement()));
                add(new JLabel((String) token.nextElement()));
                add(new JLabel((String) token.nextElement()));
            }
            file.close();
        } catch (IOException error) {
            System.err.println("Hiba: " + error.getMessage());
        } finally {
            setTitle("Névsor");
            setLayout(new GridLayout(sorok, 3, 200, 30));
            pack();
            setVisible(true);
        }
    }
}