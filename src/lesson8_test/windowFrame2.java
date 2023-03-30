package lesson8_test;

import javax.swing.JFrame;
import javax.swing.JLabel; 

public class windowFrame2 { 
    public static void main(String[] args)  { 
        // Keret k = new Keret(); k.Ablak(); 
        // put 4 window frames in each corner of the screen
        Keret k1 = new Keret(); k1.Ablak();
        Keret k2 = new Keret(); k2.Ablak();
        Keret k3 = new Keret(); k3.Ablak();
        Keret k4 = new Keret(); k4.Ablak();

        k1.setLocation(0, 0);
        k2.setLocation(0, 1000);
        k3.setLocation(1000, 0);
        k4.setLocation(1000, 1000);
    }    
} 
class Keret extends JFrame{ 
    public void Ablak(){ 
        setTitle("Az első ablakom"); 
        setSize(500, 500); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        add(new JLabel("Ez egy új szöveg")); 
        pack(); 
        setVisible(true); 
    }
} 