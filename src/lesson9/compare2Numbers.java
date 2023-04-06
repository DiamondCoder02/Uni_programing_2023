package lesson9;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class compare2Numbers {
	public static void main(String[] args) {
		Compare ob = new Compare();
		ob.compare();
	}
}

class Compare extends JFrame implements KeyListener, ItemListener, MouseListener {
	JLabel label1 = new JLabel("Give me 2 numbers:");
	JTextField text1 = new JTextField(5);
	JLabel label2 = new JLabel("=");
	JTextField text2 = new JTextField(5);

	public void compare() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocation(400, 400);
		setTitle("Compare 2 Numbers");
		add(label1);
		add(text1);
		add(label2);
		add(text2);
		setSize(400, 100);
		setVisible(true);
		label1.addKeyListener(this);
		text1.addKeyListener(this);
		label2.addKeyListener(this);
		text2.addKeyListener(this);
	}

	void calculator(){
		try {
			int a = Integer.parseInt(text1.getText());
			int b = Integer.parseInt(text2.getText());
			if (a > b) {
				label2.setText(">");
				label1.setText("the smaller number is: " + b + " ");
				text1.setBackground(java.awt.Color.GREEN);
				text2.setBackground(java.awt.Color.RED);
			} else if (a < b) {
				label2.setText("<");
				label1.setText("the smaller number is: " + a + " ");
				text1.setBackground(java.awt.Color.RED);
				text2.setBackground(java.awt.Color.GREEN);
			} else if (a == b) {
				label2.setText("=");
				label1.setText("the numbers are equal! ");
				text1.setBackground(java.awt.Color.YELLOW);
				text2.setBackground(java.awt.Color.YELLOW);
			}
		} catch (Exception e) {
			label1.setText("Give me 2 NUMBERS:");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		calculator();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		calculator();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		calculator();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		calculator();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		calculator();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		calculator();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		calculator();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		calculator();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		calculator();
	}
}
