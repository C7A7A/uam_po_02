package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ThreeButtonFrame extends JFrame {
	
	public ThreeButtonFrame() {
		this.setSize(400, 400);
		this.setLayout(new FlowLayout());
		JButton but1 = new JButton("Exit");
		JButton but2 = new JButton("Change title");
		JButton but3 = new JButton("Change BG color");
		
		but1.addActionListener(new exitListener());
		
		
		ActionListener changeTitle = new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent arg0) {
	        	 JFrame f1 = (JFrame) SwingUtilities.windowForComponent(but2);
	        	 f1.setTitle("XD");
	         }  
		};	
		
		but2.addActionListener(changeTitle);
		
		
		ActionListener changeBGColor = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				but3.setBackground(Color.BLACK);
			}
		};
		
		but3.addActionListener(changeBGColor);
		
		this.add(but1);
		this.add(but2);
		this.add(but3);
	}
	
	public class exitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args) {
		ThreeButtonFrame frame = new ThreeButtonFrame();
		
		frame.setVisible(true);
	}

}
