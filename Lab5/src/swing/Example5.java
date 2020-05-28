package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Example5 {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JButton exitButton = new JButton("Exit");
		ActionListener exitListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		};
		exitButton.addActionListener(exitListener);
		panel.add(exitButton);
		
		frame.setVisible(true);
	}
}
