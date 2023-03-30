package lesson8_test;

import javax.swing.JFrame; 

public class windowMaking {
    public static void main(String[] args) { 
        JFrame Keret = new JFrame(); 
        Keret.setSize(500, 500); 
        Keret.setTitle("Az első ablakom"); 
        Keret.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Keret.setVisible(true);
    } 
}
