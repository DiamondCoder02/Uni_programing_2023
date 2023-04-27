package lesson11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JColorChooser;

public class menuTest_1 {
	public static void main(String[] args) {
		Menü m = new Menü();
		m.menü("Menü teszt");
	}
}

class Menü extends JFrame implements ActionListener {
	JMenuItem exit;
	JMenuItem colorings;
	JMenuItem open;
	private final JFileChooser fc = new JFileChooser();
	private Color color;

	public void menü(String cim) {
		setSize(400, 150);
		setTitle(cim);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JMenuBar mb;
		JMenu File;
		setJMenuBar(mb = new JMenuBar());
		mb.add(File = new JMenu("File"));
		mb.add(new JMenu("Help"));
		File.add(open = new JMenuItem("Open"));
		File.addSeparator();
		File.add(colorings = new JMenuItem("colorings"));
		File.addSeparator();
		File.add(exit = new JMenuItem("Exit"));
		setVisible(true);
		open.addActionListener(this);
		colorings.addActionListener(this);
		color = colorings.getBackground();
		exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == open) {
			fc.showOpenDialog(this);
		} else if (e.getSource() == colorings) {
			color = JColorChooser.showDialog(this, "Colors", color);
			if (color != null) {
				open.setBackground(color);
				colorings.setBackground(color);
				exit.setBackground(color);
			}
		} else if (e.getSource() == exit) {
			dispose();
		}
	}
}
