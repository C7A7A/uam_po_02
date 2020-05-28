package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.*;

public class OuterClassListenerFrame extends JFrame { 

    public OuterClassListenerFrame() throws HeadlessException {
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            this.setSize(300,100); 
  
            String[] colors = {"red", "green", "blue"}; 
            JComboBox<String> colorList = new JComboBox<String>(colors); 
            this.add(colorList, BorderLayout.PAGE_START); 
            colorList.addItemListener(new ComboBoxItemListener((JPanel)this.getContentPane()));
            this.getContentPane().setBackground(Color.red);
    } 

    public static void main(String[] args) {
            OuterClassListenerFrame frame = new OuterClassListenerFrame();
            frame.setVisible(true);
    } 

}
