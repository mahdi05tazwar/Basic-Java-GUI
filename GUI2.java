package GUI; //RENAME THIS TO WHATEVER YOUR PACKAGE NAME IS!!!!!!!!
//READ THE STATEMENT ABOVE!!!
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI2 implements ActionListener{
	JFrame frame;
	JLabel label;
	JPanel panel;
	JButton button;
	
	public GUI2(){
		frame = new JFrame();
		button = new JButton("Click me");
		button.addActionListener(this);
		label = new JLabel("Not clicked");
		panel = new JPanel();
		
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setLayout(new GridLayout(2, 0));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("HELLO");
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[]args) {
		new GUI2();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) label.setText("CLICKED!");
	}
	
}
