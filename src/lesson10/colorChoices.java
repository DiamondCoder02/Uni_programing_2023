package lesson10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class colorChoices {
	public static void main(String[] args) {
		ColorTest colorTest = new ColorTest();
		colorTest.Test();
	}
}

class ColorTest extends JFrame implements ActionListener {
	private JButton btszin = new JButton("Szín kiválasztása");
	private Color color;

	public void Test() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 150);
		setTitle("Színteszt");
		setLayout(new FlowLayout());
		add(btszin);
		setVisible(true);
		btszin.addActionListener(this);
		color = btszin.getBackground();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		color = JColorChooser.showDialog(this, "A gomb színe", color);
		if (color != null)
			btszin.setBackground(color);
	}
}