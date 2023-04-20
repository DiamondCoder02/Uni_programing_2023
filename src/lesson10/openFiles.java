package lesson10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class openFiles {
	public static void main(String[] args) {
		FileTest file = new FileTest();
		file.Test();
	}
}

class FileTest extends JFrame implements ActionListener {
	private JButton bt = new JButton("File kiválasztása");
	private JFileChooser fc = new JFileChooser();
	private JLabel lbDir = new JLabel("Path: ");
	private JLabel lbFile = new JLabel("File: ");

	public void Test() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 150);
		setTitle("Fájl kiválasztás");
		setLayout(null);
		bt.setBounds(10, 1, 100, 20);
		lbDir.setBounds(10, 50, 400, 20);
		lbFile.setBounds(10, 70, 400, 20);
		add(bt);
		add(lbDir);
		add(lbFile);
		setVisible(true);
		bt.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt)
			if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
				File sf = fc.getSelectedFile();
				if (sf != null) {
					lbDir.setText("Path: " + fc.getCurrentDirectory().getAbsolutePath());
					lbFile.setText("File: " + sf.getName());
				}
			}
	}
}