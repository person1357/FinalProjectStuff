import java.awt.*;          // access to Container
import java.awt.event.*;    // access to WindowAdapter, WindowEvent

import javax.swing.*;       // access to JFrame and JComponents
import javax.swing.Timer;
import javax.swing.event.*;     // access to JSlider events

import java.util.*;

// https://docs.oracle.com/javase/tutorial/uiswing/misc/timer.html 
//use this link for reference for how to use swing timer

public class guiC extends JFrame implements ActionListener{
    private JButton startButton;
    private JButton unit1;
    private JButton unit2;
    private JButton unit3;
    private JButton unit4;
    private JButton unit5;
    private JButton unit6;
    private JButton unit7;
    private JButton[] buttonArray;
    public guiC()
    {
    	Container container = getContentPane();
        container.setLayout( new GridLayout(5,9) );
    	
    	unit1 = new JButton("fish.gif");
    	buttonArray = new JButton[8];
    	ButtonHandler buttonHandler = new ButtonHandler();
    	// STEP 4: add unit JButtons
    	for(int a=1; a<8;a++)
    	{
    		buttonArray[a]= new JButton();
    		container.add(buttonArray[a]);
    	}
    	startButton = new JButton("Start Game");
    	container.add(startButton);
    	startButton.addActionListener(buttonHandler);
    	// STEP 5: set default close operation
    	addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
    	// STEP 6: set window size and show window
        setSize(1000,1800);
        setVisible(true);
        
    }
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		for(int a=1; a<8;a++)
    	{
    		if(event.getSource() == buttonArray[a])
    			unitArray1.makeUnit(1);
    	
		if(event.getSource() == startButton)
			// construction a Swing timer that goes off every 1000 msec (1 sec)
	        Timer timer = new javax.swing.Timer(1000, this);
			timer.start();		// timer starts here
	}
