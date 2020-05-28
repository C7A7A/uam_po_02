package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class MultiListenerFrame extends JFrame implements ActionListener {

	static final String[] titles = {"HAHA", "XD"};
	static final String init_title = titles[0];
	
	static final String[] tv_series = {"GOT", "Vikings", "Peaky Blinders", "The Last Dance"};
	
	JButton but1;
	
	JRadioButton rad_but1;
	JRadioButton rad_but2;
	
	JComboBox<String> box;
	JLabel display;
	
	public MultiListenerFrame() {
		this.setSize(480, 600);
		this.setLayout(new FlowLayout());
		this.setName(init_title);
		
		box = new JComboBox<String>(tv_series);
		this.add(box);
		display = new JLabel(tv_series[0]);
		this.add(display);
		box.addItemListener(new ComboBoxTvSeriesListener(display));
		
		but1 = new JButton("BUTTON KOX");
		but1.addActionListener(new changeForeground());
		this.add(but1);
		
		rad_but1 = new JRadioButton(titles[0]);
		rad_but2 = new JRadioButton(titles[1]);
		
		rad_but1.setActionCommand("0");
		rad_but1.addActionListener(this);
		
		this.add(rad_but1);
		
		rad_but2.setActionCommand("1");
		rad_but2.addActionListener(this);
		this.add(rad_but2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rad_but1);
		group.add(rad_but2);
		
	}
	
	public class changeForeground implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			but1.setForeground(Color.GREEN);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int titleNumber = Integer.parseInt(e.getActionCommand());
		JFrame frame = (JFrame) SwingUtilities.windowForComponent(rad_but1);
		frame.setTitle(titles[titleNumber]);
		
	}
	
	public static void main(String[] args) {
		MultiListenerFrame frame = new MultiListenerFrame();
		
		frame.setVisible(true);
	}

	

}
