package lesson9;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class button1 {
	public static void main(String[] args) {
		Gomb ob = new Gomb();
		ob.keret();
	}
}

class Gomb extends JFrame{
	public void keret(){
		setTitle("IT'S A FUCKING BUTTON");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JButton("Button"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		setSize(600,200);
		setVisible(true);
	}
}