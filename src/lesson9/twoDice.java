package lesson9;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class twoDice {
	public static void main(String[] args) {
		DiceGame dg = new DiceGame();
		dg.game();
	}
}

class DiceGame extends JFrame implements ActionListener {
	int random1 = new Random().nextInt(5) + 1;
	int random2 = new Random().nextInt(5) + 1;
	// throw 2 dice then show numbers in label after clicking button
	JButton button = new JButton("Dices");
	JLabel label = new JLabel(random1 + " and " + random2);

	public void game() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400, 400);
		setTitle("DiceGame");
		setLayout(new FlowLayout());
		add(button);
		add(label);
		pack();
		setVisible(true);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		random1 = new Random().nextInt(5) + 1;
		random2 = new Random().nextInt(5) + 1;
		label.setText(random1 + " és " + random2);
	}
}