package lesson10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class dialog_2 {
	public static void main(String[] args) {
		DialogTeszt teszt = new DialogTeszt();
	}
}

class DialogTeszt extends JFrame implements ActionListener {
	Container cont = getContentPane();
	JButton Név, Exit;

	public DialogTeszt() {
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setBounds(200, 200, 400, 200);
		cont.add(new JTextArea("Nyomd le a Névegy gombot,\nmajd az OK-t is!"));
		JPanel panel = new JPanel();
		setTitle("Dialog teszt");
		panel.add(Név = new JButton("Névjegy"));
		panel.add(Exit = new JButton("Exit"));
		cont.add(panel, BorderLayout.SOUTH);
		Név.addActionListener(this);
		Exit.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Név)
			new Névjegy(this);
		else if (e.getSource() == Exit)
			System.exit(0);
	}
}

class Névjegy extends JDialog implements ActionListener {
	Container cont = getContentPane();
	JButton OK;

	public Névjegy(JFrame own) {
		super(own, "Névjegy", true);
		setLocation(getParent().getX() + 200, getParent().getY() + 50);
		setResizable(false);
		cont.setBackground(SystemColor.controlHighlight);
		cont.setLayout(new GridLayout(3, 1));
		cont.add(new JLabel("Név: Laci", JLabel.LEFT));
		cont.add(new JLabel("Cím: Pécs", JLabel.LEFT));
		JPanel ok = new JPanel();
		cont.add(ok);
		ok.add(OK = new JButton("OK"));
		OK.addActionListener(this);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		// Ablak bezárása és a memória felszabadítása
	}
}
