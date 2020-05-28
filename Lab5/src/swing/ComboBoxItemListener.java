package swing;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class ComboBoxItemListener implements ItemListener {

    JPanel panel; 

    public ComboBoxItemListener(JPanel panel) {
            this.panel = panel;
    }

    @Override 
    public void itemStateChanged(ItemEvent arg0) {

            if(arg0.getStateChange()==ItemEvent.SELECTED) {
                    String color = (String)arg0.getItem();
                      switch(color) {
                              case "red":
                                      panel.setBackground(Color.red);
                                      break;
                              case "green": 
                                      panel.setBackground(Color.green);
                                      break;
                              case "blue":
                                      panel.setBackground(Color.blue); 
                                      break;
                      }
            }
    }

}