package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

public class Example4 extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.red);
		g2d.drawRect(50, 50, 150, 100);
		g2d.fillRect(50, 50, 150, 100);
		
		g2d.setColor(Color.blue);
		g2d.drawOval(250, 250, 150, 150);
		g2d.fillOval(250, 250, 150, 150);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(640, 480);
		
		Example4 panel = new Example4();
		panel.setBackground(Color.white);
		frame.add(panel);
		
		frame.setVisible(true);
	}

}
