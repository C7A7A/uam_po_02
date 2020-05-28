package swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class Example3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		
		frame.setLayout(new GridLayout(1,2));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.white);
		frame.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.black);
		frame.add(panel2);
		
		JLabel leftLabel = new JLabel("Left panel");
		panel1.add(leftLabel);
		
		JLabel rightLabel = new JLabel("Right label");
		rightLabel.setForeground(Color.white);
		panel2.add(rightLabel);
		
		frame.setVisible(true);
	}

}
