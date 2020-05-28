package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.*;

public class ThreeShapesPanel extends JPanel {
	
	Color col1 = random();
	Color col2 = random();
	Color col3 = random();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(col1);
		g2d.drawOval(100, 150, 200, 120);
		g2d.fillOval(100, 150, 200, 120);
		
		g2d.setColor(col2);
		g2d.drawRect(50, 10, 100, 120);
		g2d.fillRect(50, 10, 100, 120);
		
		g2d.setColor(col3);
		g2d.drawRect(300, 120, 175, 125);
		g2d.fillRect(300, 120, 175, 125);
	}

	public Color random() {
		Random rand = new Random();
		int num1 = rand.nextInt(256);
		int num2 = rand.nextInt(256);
		int num3 = rand.nextInt(256);
		Color col = new Color(num1, num2, num3);
		return col;
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 400);
	
		frame.setLayout(new GridLayout(1, 2));
		
		JPanel panelLeft = new JPanel();
		panelLeft.setBackground(Color.white);
		panelLeft.setLayout(new GridLayout(4, 1));
		JButton button1 = new JButton("Button");
		panelLeft.add(button1);
		JLabel label = new JLabel("Label");
		panelLeft.add(label);
		JTextField field = new JTextField("TextField");
		panelLeft.add(field);
		JLabel label2 = new JLabel("Label2");
		panelLeft.add(label2);
		
		frame.add(panelLeft);
		
		ThreeShapesPanel panelRight = new ThreeShapesPanel();
		panelRight.setBackground(Color.black);
		frame.add(panelRight);
		
		frame.setVisible(true);
	}
}
