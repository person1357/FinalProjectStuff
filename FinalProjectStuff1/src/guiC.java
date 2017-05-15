import java.awt.*;          // access to Container
import java.awt.event.*;    // access to WindowAdapter, WindowEvent

import javax.swing.*;       // access to JFrame and JComponents
import javax.swing.Timer;
import javax.swing.event.*;     // access to JSlider events

import java.util.*;

public class guiC extends JFrame implements ActionListener{
    private JButton startButton;
    private JButton unit1;
    public guiC()
    {
    	
    	startButton = new JButton("Start Game");
    	unit1 = new JButton("fish.gif");
    	// STEP 4: add unit JButtons
    	add
    	// STEP 5: set default close operation
        //setDefaultCloseOperation(System.EXIT_ON_CLOSE);
    	// STEP 6: set window size and show window
        setSize(1000,700);
        setVisible(true);
        // construction a Swing timer that goes off every 1000 msec (1 sec)
        Timer timer = new javax.swing.Timer(1000, this);
    }
    
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
}
