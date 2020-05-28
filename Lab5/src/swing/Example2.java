package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Example2 {
	public static void main(String[] args) {		
		JFrame frame = new JFrame();
		frame.setSize(640, 480);
		
		frame.getContentPane().setBackground(Color.red);
		
		JButton button1 = new JButton("Button 1");
		frame.add(button1, BorderLayout.PAGE_START);
		
		JButton button2 = new JButton("Button 2");
		frame.add(button2, BorderLayout.PAGE_END);
		
		JLabel label = new JLabel("This is label");
		frame.add(label);
		
		JTextField field = new JTextField("This is textfield!");
		frame.add(field);
		
		frame.setLayout(new FlowLayout());
		
		frame.setVisible(true);
	}
}
