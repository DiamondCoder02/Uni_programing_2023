package lesson9;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class bgFuckery {
	public static void main(String[] args) {
		Capacity cp = new Capacity();
		cp.test();
	}
}

class Capacity extends JFrame implements KeyListener, ItemListener {
	JLabel label1 = new JLabel("Give me the percentage of the powerBank so I can color this text in rainbow:");
	JLabel label2 = new JLabel("%");
	JTextField text = new JTextField(5);

	public void test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocation(400, 400);
		setTitle("Power Bank visually");
		add(label1);
		add(text);
		add(label2);
		setSize(400, 100);
		setVisible(true);
		label1.addKeyListener(this);
		text.addKeyListener(this);
	}
	
	void gay(){
		try {
			int percent = Integer.parseInt(text.getText());
			if (percent == 69) {
				text.setBackground(java.awt.Color.PINK);
			} else if (percent > 50){
				text.setBackground(java.awt.Color.GREEN);
			} else if (percent > 20) {
				text.setBackground(java.awt.Color.YELLOW);
			} else {
				text.setBackground(java.awt.Color.RED);
			}
			label1.setText("Nice cp :3");
		} catch (Exception e) {
			label1.setText("Give me a single number asshole!");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		gay();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		gay();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		gay();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		gay();
	}
}