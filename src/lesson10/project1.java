package lesson10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class project1 {
	public static void main(String[] args) {
		UserSaver us = new UserSaver();
		us.asking();
	}
}

class UserSaver extends JFrame implements ActionListener {
	JLabel nameLabel = new JLabel("Name");
	JLabel paymentLabel = new JLabel("Payment");
	JTextField nameButton = new JTextField("name");
	JTextField paymentButton = new JTextField("payment");
	JButton add = new JButton("Add");
	JButton modify = new JButton("Modify");
	JButton remove = new JButton("Remove");
	JButton listUsers = new JButton("list");
	JButton exitProgram = new JButton("exit");

	public void asking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400, 400);
		setTitle("UserSaver");
		setSize(400, 400);
		// setLayout(new FlowLayout());
		add(nameLabel);
		add(nameButton);
		add(paymentLabel);
		add(paymentButton);
		add(add);
		add(modify);
		add(remove);
		add(listUsers);
		add(exitProgram);
		pack();
		setVisible(true);
		add.addActionListener(this);
		modify.addActionListener(this);
		remove.addActionListener(this);
		listUsers.addActionListener(this);
		exitProgram.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			System.out.println("add");
		} else if (e.getSource() == modify) {
			System.out.println("modify");
		} else if (e.getSource() == remove) {
			System.out.println("remove");
		} else if (e.getSource() == listUsers) {
			System.out.println("list");
		} else if (e.getSource() == exitProgram) {
			System.exit(0);
		}
	}
}