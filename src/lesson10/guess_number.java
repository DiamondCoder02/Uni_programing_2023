package lesson10;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.*;

public class guess_number {
	public static void main(String[] args) {
		Uj_jatek ob = new Uj_jatek();
		ob.jatek();
	}
}

class Uj_jatek extends JFrame implements ActionListener {
	int random = new Random().nextInt(5) + 1;
	int probak = 0;
	JTextField text = new JTextField(10); // 10 oszlop szélességű mező
	JButton button = new JButton("Tippek");
	JLabel label = new JLabel(probak + " próbálkozás");

	public void jatek() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400, 400);
		setTitle("Játék");
		setLayout(new FlowLayout());
		add(text);
		add(button);
		add(label);
		pack();
		setVisible(true);
		button.addActionListener(this); // Eseményfigyelő
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String szoveg = text.getText();
		if (Integer.parseInt(szoveg) == random) {
			UIManager.put("Panel.background", new ColorUIResource(Color.GREEN));
			JOptionPane.showMessageDialog(null, "Megtaláltad", "Success", JOptionPane.OK_CANCEL_OPTION);
			button.setEnabled(false);
			text.setText(text.getText() + " Megtaláltad!");
			text.setEditable(false);
		} else {
			UIManager.put("Panel.background", new ColorUIResource(Color.RED));
			JOptionPane.showMessageDialog(null, "Try again", "Nah", JOptionPane.ERROR_MESSAGE);
			text.setText("");
			text.requestFocus();
			probak++;
			label.setText(probak + " probálkozás.");
		}
	}
}

/*
public class dialog_1 {
	public static void main(String[] args) {
		String név = JOptionPane.showInputDialog("Felahsználó neve");
		String jelszó = JOptionPane.showInputDialog("Jelszó");
		if (név != null && jelszó != null && név.equals("laci") && jelszó.equals("1234")) {
			UIManager.put("Panel.background", new ColorUIResource(Color.GREEN));
			JOptionPane.showMessageDialog(null, "Accepted", "Message", JOptionPane.OK_CANCEL_OPTION);
		} else {
			UIManager.put("Panel.background", new ColorUIResource(Color.RED));
			JOptionPane.showMessageDialog(null, "Rejected", "Message", JOptionPane.ERROR_MESSAGE);
		}
	}
} 
*/