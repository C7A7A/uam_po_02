package swing;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBoxTvSeriesListener implements ItemListener {

	JLabel display;
	
	public ComboBoxTvSeriesListener(JLabel display) {
		this.display = display;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			display.setText(e.getItem().toString());
		}
	}

}
