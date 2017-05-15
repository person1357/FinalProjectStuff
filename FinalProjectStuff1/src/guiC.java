import java.awt.*;          // access to Container
import java.awt.event.*;    // access to WindowAdapter, WindowEvent

import javax.swing.*;       // access to JFrame and JComponents
import javax.swing.event.*;     // access to JSlider events

import java.util.*;

public class guiC implements ActionListener{
    private Unit myUnit;
    public guiC()
    {
    	myUnit = new Unit();
    }
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
}
