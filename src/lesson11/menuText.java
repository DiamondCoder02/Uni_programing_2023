package lesson11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class menuText {
	public static void main(String[] args) {
		Menü mainMenu = new Menü();
		mainMenu.MenuSystem("Fuck");
	}
}

class Menü extends JFrame implements ActionListener {
	JMenuItem exit;
	JMenuItem open;
	private final JFileChooser fc = new JFileChooser();

	public void MenuSystem(String cim) {
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
		File.add(exit = new JMenuItem("Exit"));
		setVisible(true);
		open.addActionListener(this);
		exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == open) {
			fc.showOpenDialog(this);
			beolvas(fc.getSelectedFile());
		}
		if (e.getSource() == exit)
			dispose();
	}

	public void beolvas(File file) {
		try (Scanner out = new Scanner(file)) {
			while (out.hasNext()) {
				System.out.println(out.nextLine());
			}
			out.close();
		} catch (NullPointerException error) {
			System.out.println(error.getMessage());
			JOptionPane.showMessageDialog(null, "Nincs fájlnév", "Fájl hiba", JOptionPane.ERROR_MESSAGE);
		} catch (IOException error) {
			JOptionPane.showMessageDialog(null, error.getMessage(), "Fájl hiba", JOptionPane.ERROR_MESSAGE);
		}
	}
}